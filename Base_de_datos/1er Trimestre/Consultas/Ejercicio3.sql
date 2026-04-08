-- 1.Seleccionar los pedidos realizados por el empleado con código entre el 2 y 5 con
-- fecha de pedido del 31 de julio de cualquier año. Buscar información sobre la función
-- EXTRACT.
select * from orders where (EmployeeID between 2 and 5) and (extract(month from orderDate) = 7) 
and (extract(day from orderDate) = 31);

-- 2. Seleccionar los pedidos realizados por el empleado con código 3, de cualquier año,
-- pero solo de los últimos 5 meses (agosto-diciembre). Buscar información sobre la
-- función MONTH.

select * from orders where (EmployeeID = 3) and (month(orderDate) between 8 and 12);

-- 3. Seleccionar los detalles de los pedidos (tabla OrderDetails) que tengan cantidades
-- entre 10 y 250.

select * from orderdetails where quantity between 10 and 250;

-- 4. Seleccionar los detalles de los pedidos cuyo coste (precio unitario x unidades) se
-- encuentre entre 10 y 330. Mostrar el coste como TOTAL.

select *, UnitPrice*Quantity as Total from orderdetails where UnitPrice*Quantity between 10 and 330;

-- 5. Hacer un listado de todos los países a los que pertenecen los distintos clientes
-- (buscar información sobre el operador DISCTINCT).

select distinct country from customers;

-- 6. Mostrar los 15 productos más vendidos.

select * from products order by UnitsOnOrder desc limit 15;

-- 7. Imprimir el nombre de todos los empleados, así como la longitud en caracteres del
-- mismo (en dos columnas).

select FirstName, char_length(firstName) as "Caracteres" from employees;

-- 8. Imprimir en una única columna el nombre y apellidos de todos los empleados,
-- concatenados.
select concat(FirstName, " ", LastName) as "Nombre Completo" from employees;

-- 9. Imprimir el nombre de los empleados en minúsculas y el apellido en mayúsculas.

select lower(FirstName), upper(LastName) from employees;

-- 10. Imprimir el nombre de los empleados, excluyendo la primera y última letra.

select substring(FirstName, 2, length(FirstName) - 2) as "Nombre cortado" from employees;

-- 11. Imprimir el nombre, apellidos y fecha de nacimiento de todos los empleados. La
-- fecha de nacimiento debe estar en el formato europeo (DD—MM--AAAA).

select firstName, LastName,  date_format(birthDate, "%d-%m-%Y") as "fecha de nacimiento" from employees;

-- 12. Por cada empleado, imprimir junto a su nombre y apellidos, el número de años que
-- han transcurrido desde su nacimiento hasta su contratación.

select FirstName, LastName, TIMESTAMPDIFF(year, birthDate, hireDate) from employees;

-- 13. Por cada empleado, imprimir el número de años que han transcurrido desde su
-- contratación hasta la fecha actual.

select TIMESTAMPDIFF(year, hireDate, now()) from employees;

-- 14. Repetir el ejercicio anterior expresando el resultado en meses.

select TIMESTAMPDIFF(month, hireDate, now()) from employees;

-- 15. Repetir el ejercicio anterior expresando el resultado en días.

select TIMESTAMPDIFF(day, hireDate, now()) from employees;

-- 16. Imprimir el nombre del día de la semana en el que nació cada empleado, junto con
-- su nombre y apellidos.

select firstName, LastName, date_format(birthDate, "%W") from employees;

-- 17. Imprimir el nombre del mes en el que fue contratado cada empleado, junto con su
-- nombre y apellidos.

select firstName, LastName, date_format(hireDate, "%M") from employees;

-- 18. Por cada empleado, imprimir nombre, apellidos, fecha de contratación y antigüedad
-- en días (días que lleva contratado).

select firstName, LastName, timestampdiff(day, hireDate, now()) as antigüedad from employees;

-- 19. Repetir el ejercicio anterior añadiendo una nueva columna con la edad a la que fue
-- contratado.

select firstName, LastName, timestampdiff(day, hireDate, now()) as antigüedad, timestampdiff(year,birthDate, hireDate) from employees;

-- 20. Seleccionar los 7 productos con precio más caro, que cuenten con stock en
-- almacén. Buscar información sobre la palabra reservada LIMIT.

select * from products where UnitsInStock>0 order by UnitPrice desc limit 7;

-- 21. Seleccionar los 9 productos con menos stock en almacén, que pertenezcan a la
-- categoría 3, 5 u 8.

select * from products where CategoryID in (3,5,8) order by UnitsInStock limit 9;