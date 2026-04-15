-- SUB1: Muestre los nombres de productos cuyo valor de unidades en stock sea superior al valor máximo
-- de unidades en stock de los productos de la categoría 2, 5 y 7.

select ProductName from products pr where pr.UnitsInStock > 
	(select max(p.UnitsInStock) from products p where CategoryID in (2, 5, 7));

-- SUB2: muestre las ciudades que tienen más clientes que la suma de clientes de Torino y Leipzig pero
-- menos clientes que la suma de clientes de Sao Paulo y London.

select City from customers group by City having count(*) > 
	(select count(*) from customers where City in ("Torino", "Leipzig")) and count(*) < 
		(select count(*) from customers where City in ("Sao Paulo", "London"));

-- SUB3: obtener los ID de aquellos empleados que tienen una cantidad de pedidos superior
-- a la cantidad máxima de pedidos realizada por un empleado.

select e.EmployeeID from employees e join orders o on (o.EmployeeID = e.EmployeeID) 
group by o.EmployeeID having count(*) > 
	(select count(*) from employees e join orders o on (o.EmployeeID = e.EmployeeID) 
	group by o.EmployeeID order by count(*) desc limit 1);

-- Muestre los nombres e ID de empleados cuya edad sea inferior a:
-- SUB4: la edad del empleado más viejo más la edad del empleado más joven, entre dos. Puede
-- usar la edad aproximada si lo desea.

select FirstName, EmployeeID from employees where timestampdiff(year, BirthDate, now()) < 
	((select timestampdiff(year, BirthDate, now()) edad from employees order by edad desc limit 1)
    + (select timestampdiff(year, BirthDate, now()) edad from employees order by edad limit 1))/2;

-- Muestre los nombres e ID de empleados cuya edad sea inferior a:
-- SUB5: la suma de la edad de todos los empleados entre la cantidad total de empleados. Puede usar la edad
-- aproximada si lo desea, pero NO puede usar la función de media AVG.

select FirstName, EmployeeID from employees where timestampdiff(year, BirthDate, now()) <
	(select (sum(timestampdiff(year, BirthDate, now())) / (select count(*) from employees)) from employees);
