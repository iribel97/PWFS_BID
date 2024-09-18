/*
* Encontrar la cantidad de productos vendidos por cada empleado y mostrar el nombre del empleado junto con la cantidad de productos vendidos.
*/
SELECT e.nombre, e.apellido, SUM(v.cantidad) AS cantidad_productos_vendidos
FROM empleados e, ventas v 
WHERE e.id = v.empleado_id
GROUP BY e.id;


/*
* Calcular el monto total de ventas por cada cliente y mostrar el nombre del cliente junto con el monto total de sus compras.
*/
select c.id, c.nombre, sum(v.monto_total)
from ventas v, clientes c
where v.cliente_id = c.id
group by c.id;

/*
* Encontrar el producto más caro vendido y mostrar su nombre y precio.
*/
select v.precio_unitario as 'precio', p.nombre 
from ventas v, productos p
where v.producto_id = p.id
order by v.precio_unitario desc
limit 1;

/*
* Calcular el salario promedio de los empleados en cada departamento y mostrar el nombre del departamento junto con el salario promedio.
*/
select avg(e.salario) as 'salario promedio', d.nombre
from empleados e, departamentos d
where e.departamento_id = d.id
group by e.departamento_id;

/*
* Encontrar la cantidad total de ventas realizadas por cada empleado y mostrar el nombre 
* y apellido del empleado junto con la cantidad total de ventas.
*/
SELECT e.nombre, e.apellido, count(v.id) 'total ventas'
FROM empleados e, ventas v 
WHERE e.id = v.empleado_id
GROUP BY e.id;

/*
* Encuentra la cantidad de ventas realizadas por cada empleado y muestra el nombre y apellido del empleado junto 
* con la cantidad total de ventas. Limita los resultados a mostrar solo a los empleados que hayan realizado más de 5 ventas 
* y ordenarlos de forma descendente con respecto a la cantidad de ventas.
*/
SELECT e.nombre, e.apellido, COUNT(v.id) AS total_ventas
FROM ventas v, empleados e 
WHERE v.empleado_id = e.id
GROUP BY e.id
HAVING COUNT(v.id) >= 4
ORDER BY total_ventas DESC;

/*
* Calcula el monto total vendido por cada empleado y muestra el nombre del empleado junto con el monto total. 
* Usa la cláusula HAVING para filtrar a aquellos empleados que hayan vendido más de 10 productos en total. 
* Muestra el resultado en orden descendente según el monto total vendido.
*/
SELECT e.nombre, e.apellido, SUM(v.monto_total) AS total_vendido, SUM(v.cantidad) AS total_productos
FROM ventas v, empleados e 
WHERE v.empleado_id = e.id
GROUP BY e.id
HAVING SUM(v.cantidad) > 9
ORDER BY total_vendido DESC;

/*
* Encuentra el monto total vendido a cada cliente y muestra el nombre del cliente junto con el monto total. 
* Usa la cláusula HAVING para filtrar a aquellos clientes cuyo monto total promedio en sus compras sea superior a $1500. 
* Muestra el resultado en orden descendente según el monto total vendido.
*/
SELECT c.nombre, SUM(v.monto_total) AS total_vendido, AVG(v.monto_total) AS promedio_compras
FROM ventas v, clientes c 
WHERE v.cliente_id = c.id
GROUP BY c.id
HAVING AVG(v.monto_total) > 1500
ORDER BY total_vendido DESC;

/*
* Calcula la cantidad total de ventas realizadas a cada cliente y muestra el nombre del cliente junto con la cantidad total de ventas. 
* Limita los resultados a mostrar solo a los clientes que hayan realizado más de 3 ventas ordénalos de forma descendente 
* según la cantidad de ventas.
*/
SELECT c.nombre, COUNT(v.id) AS total_ventas
FROM ventas v, clientes c 
WHERE v.cliente_id = c.id
GROUP BY c.nombre
HAVING COUNT(v.id) >= 3
ORDER BY total_ventas DESC;

/*
* Encuentra los productos más caros vendidos (precio mayor a 1000), muestra su nombre y precio y ordenarlos de forma descendente por precio.
*/
SELECT p.nombre, p.precio
FROM productos p, ventas v 
WHERE v.producto_id = p.id AND p.precio > 1000
GROUP BY p.nombre, p.precio
ORDER BY p.precio DESC;
