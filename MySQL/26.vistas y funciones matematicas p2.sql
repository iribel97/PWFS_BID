use mi_bd;
-- Crea una tabla mensajes que tenga una columna “datos” de tipo varchar y una columna valor_crc de tipo int, con las siguientes filas: VALUES
--     ('Hola, ¿cómo estás? Espero que tengas un buen día.',3221685809),
--     ('Ayer fui al cine a ver una película genial.', 951196167),
--     ('Estoy emocionado por el próximo fin de semana.', 3275166159),
--     ('Mi reunión se pospuso para el martes que viene.', 169741145),
--     ('He estado trabajando en un proyecto importante.', 6480112535),
--     ('Esta receta de pastel de manzana es deliciosa.', 2524836786),
--     ('Planeo hacer un viaje a la playa este verano.', 5107635050),
--     ('Mi gato se divierte jugando con su pelota.', 3578632817),
--     ('Hoy es un día soleado y agradable.', 3675102258),
--     ('El libro que estoy leyendo es muy interesante.', 854938277);
DROP TABLE IF EXISTS mensajes;
CREATE TABLE mensajes (
    datos VARCHAR(255),
    valor_crc BIGINT
);

INSERT INTO mensajes (datos, valor_crc) 
VALUES 
('Hola, ¿cómo estás? Espero que tengas un buen día.', 3221685809),
('Ayer fui al cine a ver una película genial.', 951196167),
('Estoy emocionado por el próximo fin de semana.', 3275166159),
('Mi reunión se pospuso para el martes que viene.', 169741145),
('He estado trabajando en un proyecto importante.', 6480112535),
('Esta receta de pastel de manzana es deliciosa.', 2524836786),
('Planeo hacer un viaje a la playa este verano.', 5107635050),
('Mi gato se divierte jugando con su pelota.', 3578632817),
('Hoy es un día soleado y agradable.', 3675102258),
('El libro que estoy leyendo es muy interesante.', 854938277);

TABLE mensajes;
-- Crea una vista con una tercera columna “análisis” donde verifiques si el valor crc del mensaje es igual al valor de la segunda columna, si no es igual muestra un mensaje “adulterado” en la tercera columna o “correcto” en el caso contrario.
CREATE OR REPLACE VIEW vista_mensajes AS
SELECT 
    datos, 
    valor_crc,
    CASE 
        WHEN valor_crc = CRC32(datos) THEN 'correcto'
        ELSE 'adulterado'
    END AS análisis
FROM mensajes;
TABLE vista_mensajes;
-- Crea una tabla llamada ahorros con tres columnas: ahorro_inicial (la cantidad inicial de ahorros en dólares) de tipo decimal(10, 2), periodos (el número de períodos en años) de tipo int, y tasa_interes (la tasa de interés nominal anual en porcentaje) de tipo decimal(5, 2). 
DROP TABLE IF EXISTS ahorros;
CREATE TABLE ahorros (
    ahorro_inicial DECIMAL(10, 2),
    periodos INT,
    tasa_interes DECIMAL(5, 2)
);

-- Llena la tabla con 10 filas de números aleatorios para ahorro_inicial (un valor mayor a 1000), periodos (un valor entre 1 y 10), y tasa_interes (un valor entre 1 y 1,20).
INSERT INTO ahorros (ahorro_inicial, periodos, tasa_interes)
VALUES
(1500.00, 5, 1.05),
(2000.50, 3, 1.10),
(1800.75, 7, 1.03),
(2200.00, 4, 1.08),
(1300.25, 2, 1.07),
(1700.60, 6, 1.04),
(1400.00, 10, 1.09),
(2500.80, 8, 1.06),
(1900.35, 9, 1.12),
(2100.40, 1, 1.02);

-- Crea una vista llamada vista_ahorros_futuros que incluya una columna con el cálculo de los ahorros futuros ajustados por la tasa de interés. Para esto utilizaremos la fórmula para calcular el interés compuesto:
-- VF = VA x (1+r)^n
-- VF: Valor futuro (ahorros futuros).
-- VA: Valor actual (ahorro_inicial).
-- r: La tasa de interés (tasa_interes).
-- n: El número de periodos (periodos).

CREATE OR REPLACE VIEW vista_ahorros_futuros AS
SELECT 
    ahorro_inicial,
    periodos,
    tasa_interes,
    ROUND(ahorro_inicial * POWER(1 + (tasa_interes - 1), periodos), 2) AS valor_futuro
FROM ahorros;

TABLE vista_ahorros_futuros;
