use mi_bd

-- Crea una tabla llamada concentracion_de_hidrogenos con una columna de id incremental, y otra columna nanomoles_por_litro, 
-- y rellénala con 10 números, estos numeros deben ser el resultado de elevar 10 a un exponente aleatorio entero entre 9 y (-5).

DROP TABLE IF EXISTS concentracion_de_hidrogenos;
CREATE TABLE concentracion_de_hidrogenos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nanomoles_por_litro DECIMAL(20, 10)
);

INSERT INTO concentracion_de_hidrogenos (nanomoles_por_litro)
SELECT POWER(10, FLOOR(RAND() * 15) - 5);

-- Crea una vista donde agregues la columna ph donde calcules el ph de la sustancia. Utiliza la siguiente formula: 
-- pH = -log[H+]
-- Log: es el logaritmo en base 10.
-- [H+]: es la concentración de hidrogeno en moles.
-- Como la tabla tiene guarda el valor de la concentración en nanomoles debes hacer la conversión a moles primero:
-- 1 mol = 1.000.000.000 nanomoles.
CREATE OR REPLACE VIEW vista_concentracion_ph AS
SELECT 
    id,
    nanomoles_por_litro,
    ROUND(-LOG10(nanomoles_por_litro / 1000000000), 2) AS ph -- Conversión de nanomoles a moles y cálculo de pH
FROM concentracion_de_hidrogenos;

-- Crea una vista donde agregues la columna escala_de_ph donde etiquetes la sustancia con las siguientes categorías según su ph:
-- Acida : 7 < ph > 0
-- Neutra: ph = 7
-- Alcalina: 14 < ph > 7

CREATE OR REPLACE VIEW vista_ph_escala AS
SELECT 
    id,
    nanomoles_por_litro,
    ph,
    CASE 
        WHEN ph < 7 THEN 'Ácida'
        WHEN ph = 7 THEN 'Neutra'
        ELSE 'Alcalina'
    END AS escala_de_ph
FROM vista_concentracion_ph;

-- Crea la tabla numeros_ocultos con la columna_1 de tipo varchar y la columna_2 de int y rellénala con estos valores:
-- VALUES
-- ('EB4ECB', 16),
-- ('25SK1E', 31),
-- ('8C2B88', 22),
-- ('58D660A', 15),
-- ('100010020211000', 3),
-- ('20251A2', 13),
-- ('4MFL6M', 23),
-- ('IO36L', 29),
-- ('748D676', 14),
-- ('J1G50', 32)
DROP TABLE IF EXISTS numeros_ocultos;
CREATE TABLE numeros_ocultos (
    columna_1 VARCHAR(20),
    columna_2 INT
);

INSERT INTO numeros_ocultos (columna_1, columna_2)
VALUES
('EB4ECB', 16),
('25SK1E', 31),
('8C2B88', 22),
('58D660A', 15),
('100010020211000', 3),
('20251A2', 13),
('4MFL6M', 23),
('IO36L', 29),
('748D676', 14),
('J1G50', 32);

-- Todos los números de la primera columna de la tabla anterior están expresados en una base numérica correspondiente 
-- a la segunda columna, crea una vista con una tercera columna para mostrar los números de la columna_1 expresados en base 
-- 10 y ordénalos de mayor a menor.
CREATE OR REPLACE VIEW vista_numeros_ocultos_base10 AS
SELECT 
    columna_1,
    columna_2,
    CONV(columna_1, columna_2, 10) AS valor_base_10 -- Conversiones de las diferentes bases a base 10
FROM numeros_ocultos
ORDER BY valor_base_10 DESC;
TABLE vista_numeros_ocultos_base10

-- Actualiza la vista_ahorros_futuros para que no incluya la columna ahorro_inicial, y 
-- luego crea una nueva vista vista_ahorro_inicial donde utilices la vista_ahorros_futuros
-- y la siguiente fórmula para calcular una nueva columna ahorro_inicial, incluye las demás 
-- columnas excepto tasa_interes en la vista final: 
-- VA = VF / (1+r)^n
-- VA: Valor actual (ahorro_inicial).
-- VF: Valor futuro (ahorros futuros).
-- r:  La tasa de interés (tasa_interes).
-- n: El número de periodos (periodos).
CREATE OR REPLACE VIEW vista_ahorros_futuros AS
SELECT 
    periodos,
    tasa_interes,
    ROUND(ahorro_inicial * POWER(1 + (tasa_interes - 1), periodos), 2) AS valor_futuro
FROM ahorros;
TABLE vista_ahorros_futuros;

CREATE OR REPLACE VIEW vista_ahorro_inicial AS
SELECT 
    ROUND(valor_futuro / POWER(1 + (tasa_interes - 1), periodos), 2) AS ahorro_inicial,
    periodos,
    valor_futuro
FROM vista_ahorros_futuros;
TABLE vista_ahorro_inicial;
-- Crea una nueva vista vista_tasa_interes donde utilices la vista_ahorro_inicial y la siguiente
-- fórmula para calcular la columna tasa_interes, incluye las demás columnas, excepto “periodos”,
-- en la vista final:
-- r = ( (VF / VA)^(1/n) ) - 1
-- r: La tasa de interés (tasa_interes).
-- VF: Valor futuro (ahorros futuros).
-- VA: Valor actual (ahorro_inicial).
-- n: El número de periodos (periodos).
CREATE OR REPLACE VIEW vista_tasa_interes AS
SELECT 
    ahorro_inicial,
    valor_futuro,
    ROUND(POWER(valor_futuro / ahorro_inicial, 1.0 / periodos) - 1, 5) AS tasa_interes
FROM vista_ahorro_inicial;

TABLE vista_tasa_interes;
-- Crea una nueva vista vista_periodos donde utilices la vista_tasa_interes y la siguiente fórmula para calcular la columna periodos, incluye todas las columnas en la vista final:
-- n = ln(VF / VA) / ln(1 + r)
-- n: El número de periodos (periodos).
-- VF: Valor futuro (ahorros futuros).
-- VA: Valor actual (ahorro_inicial).
-- r: La tasa de interés (tasa_interes).
CREATE OR REPLACE VIEW vista_periodos AS
SELECT 
    ahorro_inicial,
    valor_futuro,
    tasa_interes,
    ROUND(LOG(valor_futuro / ahorro_inicial) / LOG(1 + tasa_interes), 2) AS periodos
FROM vista_tasa_interes;

TABLE vista_periodos;

