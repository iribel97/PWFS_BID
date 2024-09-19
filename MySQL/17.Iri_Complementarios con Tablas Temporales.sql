DROP TEMPORARY TABLE IF EXISTS escuela_primaria;
DROP TEMPORARY TABLE IF EXISTS escuela_secundaria;
DROP TEMPORARY TABLE IF EXISTS clientes_temporales;

# Tabla temporal de escuela primaria
CREATE TEMPORARY TABLE escuela_primaria (
    id INT,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT,
    grado INT
);

-- Insertamos los valores en la tabla temporal
INSERT INTO escuela_primaria (id, nombre, apellido, edad, grado)
VALUES
(1, 'Alejandro', 'González', 11, 5),
(2, 'Isabella', 'López', 10, 4),
(3, 'Lucas', 'Martínez', 11, 5),
(4, 'Sofía', 'Rodríguez', 10, 4),
(5, 'Mateo', 'Pérez', 12, 6),
(6, 'Valentina', 'Fernández', 12, 6),
(7, 'Diego', 'Torres', 10, 4),
(8, 'Martina', 'Gómez', 11, 5),
(9, 'Joaquín', 'Hernández', 10, 4),
(10, 'Valeria', 'Díaz', 11, 5);

CREATE TEMPORARY TABLE clientes_temporales AS
	SELECT * FROM clientes;

-- TABLE empleados INTERSECT TABLE clientes_temporales;
SELECT concat(nombre, ' ', apellido) 'nombre'
	FROM empleados
    INTERSECT
    SELECT nombre
    FROM clientes_temporales;
# Alternativa en caso de que no funicone el INTERSECT
SELECT e.nombre, e.apellido
	FROM empleados e
	INNER JOIN clientes_temporales c
	ON CONCAT(e.nombre, ' ', e.apellido) = c.nombre;

# Excepción entre la tabla temporal de clientes y empleados
-- TABLE clientes_temporales EXCEPT TABLE empleados;
SELECT nombre
	 FROM clientes_temporales
     EXCEPT
     SELECT CONCAT(nombre, ' ', apellido)
     FROM empleados;
# Alternativa en caso de que no funicone el EXCEPT
SELECT c.nombre
	FROM clientes_temporales c
	LEFT JOIN empleados e
	ON CONCAT(e.nombre, ' ', e.apellido) = c.nombre
	WHERE e.id IS NULL;


/*
* Crea una tabla temporal escuela secundaria que tenga las siguientes columnas: 
* id(int), nombre(varchar), apellido(varchar), edad(int) y grado(int). Y que tenga los siguientes valores:
*/
CREATE TEMPORARY TABLE escuela_secundaria (
    id INT,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT,
    grado INT
);
INSERT INTO escuela_secundaria (id, nombre, apellido, edad, grado)
VALUES
(1, 'Eduardo', 'Sánchez', 16, 10),
(2, 'Camila', 'Martín', 17, 11),
(3, 'Manuel', 'Gutiérrez', 15, 9),
(4, 'Laura', 'García', 16, 10),
(11, 'Pablo', 'Ortega', 17, 11),
(12, 'Carmen', 'Ramírez', 15, 9),
(13, 'Carlos', 'Molina', 16, 10),
(14, 'Ana', 'Ruiz', 17, 11),
(15, 'Luis', 'Fernández', 15, 9),
(16, 'María', 'López', 16, 10);

/*
* Realiza la intersección de la escuela primaria y escuela secundaria con el nombre y apellido de los alumnos 
* para saber quienes fueron a ambas escuelas.
*/
SELECT nombre, apellido
	FROM escuela_primaria
    INTERSECT
    SELECT nombre, apellido
    FROM escuela_secundaria;
# Otra forma
SELECT sp.nombre, sp.apellido
	FROM escuela_primaria sp
	INNER JOIN escuela_secundaria ss
	ON sp.nombre = ss.nombre AND sp.apellido = ss.apellido;

/*
* Realiza la excepción de la escuela primaria con la secundaria para saber quienes no siguieron cursando en dicha escuela secundaria.
*/
TABLE escuela_primaria EXCEPT TABLE escuela_secundaria;

/*
* Realiza la excepción de la escuela secundaria con la primaria para saber quienes no siguieron cursando en dicha escuela secundaria
*/
TABLE escuela_secundaria EXCEPT TABLE escuela_primaria;

/*
* Realiza la unión de la escuela primaria y secundaria con la columna grado para saber cuáles son los grados que abarcan ambas escuelas, 
* y ordénalos de forma descendente.
*/
SELECT grado
	FROM escuela_primaria
	UNION
	SELECT grado
	FROM escuela_secundaria
	ORDER BY grado DESC;