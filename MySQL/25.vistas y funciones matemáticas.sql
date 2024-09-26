use mi_bd;

-- Crea una tabla triangulos_rectangulos con dos columnas: longitud_lado_adyacente y longitud lado_opuesto, ambos de tipo INT.
CREATE TABLE triangulos_rectangulos (
longitud_lado_adyacente INT,
longitud_lado_opuesto INT
);
-- Rellena la tabla triangulos_rectangulos con 10 filas con enteros aleatorios entre 1 y 100
INSERT INTO triangulos_rectangulos (longitud_lado_adyacente,
longitud_lado_opuesto)
SELECT FLOOR(RAND() * 100) + 1, FLOOR(RAND() * 100) + 1
FROM (VALUES
ROW(1),ROW(2),ROW(3),ROW(4),ROW(5),ROW(6),ROW(7),ROW(8),ROW(9),ROW(10)) AS
numbers;
-- Crea una vista donde agregues la columna “hipotenusa” calculándola a partir de los otros dos lados. Utiliza el teorema de Pitágoras para realizar el cálculo: Siendo el lado adyacente “A” y el opuesto “B” y la hipotenusa “C” la fórmula quedaría de la siguiente forma:
-- C =A2+B2​
DROP VIEW IF EXISTS vista_triangulos;
CREATE VIEW vista_triangulos AS
SELECT *,
SQRT(POW(longitud_lado_adyacente, 2) + POW(longitud_lado_opuesto, 2))
AS hipotenusa
FROM triangulos_rectangulos;
-- Reemplaza la vista y ahora agrégale dos columnas para calcular el ángulo α en radianes y grados. Aquí tienes dos fórmulas:
-- En radianes: =arcsen(BC) =arccos(AC) = arctan(BA)
CREATE OR REPLACE VIEW vista_triangulos AS
SELECT *,
ATAN2(longitud_lado_opuesto, longitud_lado_adyacente) AS angulo_alfa_radianes,
DEGREES(ATAN2(longitud_lado_opuesto, longitud_lado_adyacente)) AS angulo_alfa_grados,
SQRT(POW(longitud_lado_opuesto, 2) + POW(longitud_lado_adyacente, 2)) AS hipotenusa FROM
triangulos_rectangulos;
-- Reemplaza la vista y ahora agrégale dos columnas para calcular el ángulo β en radianes y grados. Aquí tienes dos fórmulas:
-- En radianes: β =arccos(BC)=arcsen(AC) = arctan(AB)  
CREATE OR REPLACE VIEW vista_triangulos AS
SELECT *,
ATAN(longitud_lado_adyacente/hipotenusa) AS angulo_beta_radianes,
DEGREES(ATAN(longitud_lado_adyacente/hipotenusa)) AS angulo_beta_grados
FROM (
    SELECT longitud_lado_opuesto, longitud_lado_adyacente,
        SQRT(POW(longitud_lado_opuesto, 2) + POW(longitud_lado_adyacente, 2)) AS hipotenusa
    FROM triangulos_rectangulos
    ) AS tr;
-- Reemplaza la vista y ahora agrégale dos columnas para calcular el ángulo γ en radianes y grados. Como se trata de triángulos rectángulos, el ángulo es de 90°, pero aplica una fórmula de igual manera, usa la regla de que la suma de los ángulos de un triángulo suma 180°.
CREATE OR REPLACE VIEW vista_triangulos AS
SELECT *,
90 AS angulo_gamma_grados
FROM (
SELECT *,
DEGREES(ASIN(longitud_lado_opuesto /
SQRT(POW(longitud_lado_opuesto,2)+POW(longitud_lado_adyacente,2)))) AS
angulo_alfa_grados,
DEGREES(ACOS(longitud_lado_opuesto /
SQRT(POW(longitud_lado_opuesto,2)+POW(longitud_lado_adyacente,2)))) AS
angulo_beta_grados
FROM triangulos_rectangulos
) AS tr;
-- Crea una tabla triangulos_rectangulos_2 con dos columnas: angulo_alfa y una hipotenusa ambos de tipo INT.
DROP TABLE IF EXISTS triangulos_rectangulos_2;
CREATE TABLE triangulos_rectangulos_2 (
angulo_alfa INT,
hipotenusa INT
);
-- Rellena la tabla triangulos_rectangulos_2 con 10 filas con enteros aleatorios entre 1 y 89 para angulo_alfa y enteros aleatorios entre 1 y 100 para la columna hipotenusa.
INSERT INTO triangulos_rectangulos_2 (angulo_alfa, hipotenusa)
SELECT FLOOR(RAND() * 89) + 1, FLOOR(RAND() * 100) + 1
FROM (VALUES
ROW(1),ROW(2),ROW(3),ROW(4),ROW(5),ROW(6),ROW(7),ROW(8),ROW(9),ROW(10)) AS
numbers;
-- Crea una vista donde agregues la columna lado_adyacente donde calcules su longitud.
CREATE VIEW vista_triangulos_2 AS
SELECT *,
ROUND(COS(RADIANS(angulo_alfa)) * hipotenusa, 2) AS lado_adyacente
FROM triangulos_rectangulos_2;
-- Agrega a la vista la columna lado_opuesto donde calcules su longitud.
CREATE OR REPLACE VIEW vista_triangulos_2 AS
SELECT *,
ROUND(SIN(RADIANS(angulo_alfa)) * hipotenusa, 2) AS lado_opuesto
FROM triangulos_rectangulos_2;
-- Agrega a la vista la columna angulo_beta donde calcules su valor en grados.
CREATE OR REPLACE VIEW vista_triangulos_2 AS
SELECT *,
DEGREES(ACOS(lado_adyacente / hipotenusa)) angulo_beta
FROM (SELECT *,
COS(RADIANS(angulo_alfa)) * hipotenusa lado_opuesto,
SIN(RADIANS(angulo_alfa)) * hipotenusa lado_adyacente
FROM triangulos_rectangulos_2) tr;
-- Agrega a la vista la columna angulo_gamma donde calcules su valor en grados.
CREATE OR REPLACE VIEW vista_triangulos_2 AS
SELECT *,
180 - angulo_alfa - angulo_beta AS angulo_gamma
FROM (SELECT *,
DEGREES(ACOS(lado_adyacente / hipotenusa)) AS angulo_beta
FROM (SELECT *,
COS(RADIANS(angulo_alfa)) * hipotenusa AS
lado_opuesto,
SIN(RADIANS(angulo_alfa)) * hipotenusa AS
lado_adyacente
FROM triangulos_rectangulos_2) tr) tr2;
-- Redondea todos los valores con hasta dos números decimales.
CREATE OR REPLACE VIEW vista_triangulos_2 AS
SELECT *,
ROUND(180 - angulo_alfa - angulo_beta,2) angulo_gamma
FROM (
SELECT *,
ROUND(DEGREES(ACOS(lado_adyacente / hipotenusa)),2) angulo_beta
FROM (
SELECT *,
ROUND(COS(RADIANS(angulo_alfa)) * hipotenusa,2) lado_opuesto,
ROUND(SIN(RADIANS(angulo_alfa)) * hipotenusa,2) lado_adyacente
FROM triangulos_rectangulos_2) tr
) tr2;

table vista_triangulos_2;