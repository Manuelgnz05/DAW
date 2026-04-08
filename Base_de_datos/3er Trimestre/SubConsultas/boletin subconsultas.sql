-- 1. Ciudades que tienen menos menos clientes (customers) que la ciudad
-- de Buenos Aires.
select City, count(*) from customers group by City having count(*) < 
	(select count(*) from customers where City = "Buenos Aires");
    
-- 2. Nombre de los empleados que son jefes. Dejar para más adelante.

-- 3. Pedidos cuyo valor de carga (Freight) esta por encima de la media.
select * from orders where Freight > 
	(select avg(Freight) from orders);
    
-- 4. Productos cuya categoria empieza con la letra C.
select * from products where CategoryID in 
	(select CategoryID from categories where CategoryName like "C%");

-- 5.Productos cuyo valor de unidades en stock sea superior al valor máximo 
-- de unidades en stock de los productos de la categoría 4.

select * from products where UnitsInStock > 
	(select max(UnitsInStock) from products where CategoryID = 4);
    
-- 6. Escribir una consulta para recuperar el nombre de la compañía
-- e ID de proveedor de aquellos proveedores que viven en un país que tiene mas proveedores que Alemania.
-- MAL

select SupplierID, CompanyName from suppliers where Country in 
	(select Country from suppliers group by Country having count(*) > (
		select count(*) from suppliers where Country = "Germany"));
    
-- 7. Escribir una consulta para imprimir el nombre, apellidos y edad de aquellos 
-- empleados que tienen una edad superior a la edad media.

select FirstName, LastName, timestampdiff(year, birthDate, now()) from employees
where timestampdiff(year, birthDate, now()) >
	(select avg(timestampdiff(year, birthDate, now())) from employees);

-- 8. Escribir una consulta para imprimir el nombre, apellidos y edad de aquellos
-- empleados que tienen una edad superior a la edad media de aquellos empleados con el título de 'Sales Representative'.

select FirstName, LastName, timestampdiff(year, Birthdate, now()) edad from employees where timestampdiff(year, Birthdate, now())  > 
	(select avg(timestampdiff(year, birthDate, now())) from employees where Title = "Sales Representative");

-- 9. Escribir una consulta para recuperar todos los datos de los
-- empleados que tienen una edad superior a la edad de Margaret Peacock.

select * from employees where timestampdiff(year, birthDate, now()) > 
	(select timestampdiff(year, birthDate, now()) edad from employees where FirstName = "Margaret" and LastName = "Peacock");


-- 10. Escribir una consulta para recuperar el ID de pedido, ID de cliente y nombre de compañía. 
-- Trabaje sin hacer joins entre orders y customers.

select OrderID, CustomerID ID_cliente, 
	(select CompanyName from customers where CustomerID = ID_cliente) from orders;

-- 11.  Nombre de compañías de clientes que no han hecho pedidos en el 1996. No usar JOIN.

select CompanyName from customers where CustomerID not in 
	(select CustomerID from orders where year(OrderDate) = 1996);

-- 12. Nombre de productos suministrados por proveedores de Japón. No usar JOIN.

select ProductName from products where SupplierID in 
	(select SupplierID from suppliers where Country = "Japan");

-- 13. Hacer una subconsulta para obtener los empleados que tienen como jefe a Andrew Fuller.

select * from employees where ReportsTo in 
	(select EmployeeID from employees where FirstName = "Andrew" and LastName = "Fuller");

-- 14. Repetir para mostrar los que no tienen como jefe a Andrew.

select * from employees where ReportsTo not in 
	(select EmployeeID from employees where FirstName = "Andrew" and LastName = "Fuller");

-- 15. Recuperar los ID de productos con un
-- precio unitario superior al precio unitario medio.

select ProductID from products where UnitPrice > 
	(select avg(UnitPrice) from products);

-- 16. Subconsulta para obtener los nombres de categorias con un número de productos superior al número de
-- productos que pertenecen a la categoría 'condiments'.

select CategoryName from categories join products on (categories.CategoryID = products.CategoryID) group by CategoryName 
having count(*) > 
	(select count(products.ProductID) from categories join products on (categories.CategoryID = products.CategoryID) 
    where CategoryName = "condiments");

-- 17. Subconsulta para obtener los ID de aquellos empleados que tienen un número de pedidos superior
-- a la media de pedidos por empleado.
-- Nose

select EmployeeID, count(*)
from orders
group by EmployeeID
having count(*) > (
	select avg(pedidos)
	from (
		select count(*) as pedidos
		from orders
		group by EmployeeID
	) as temporal
);

-- 18: productos cuyo valor de unidades en stock sea superior al valor máximo de unidades en stock
-- de los productos de la categoría 1 y 3.

select * from products where UnitsInStock > 
	(select max(UnitsInStock) from products where CategoryID in (1,3));

-- 19: escribir una consulta para recuperar todos los datos de los empleados que tienen una edad inferior
-- a la edad de Anne Dodsworth o Janet Leverling. INFERIOR A LA MAS JOVEN.

select * from employees where timestampdiff(year, birthdate, now()) < 
	(select min(timestampdiff(year, birthdate, now())) from employees 
    where FirstName in ("Anne", "Janet") and LastName in ("Dodsworth", "Leverling"));

-- 20: escribir una consulta para recuperar los paises que tiene mas proveedores que la suma
-- de proveedores que tienen Brasil y España.

select Country from suppliers group by Country having count(*) > 
	(select count(*) from suppliers where Country in ("Brazil", "Spain"));

-- 21: escribir una consulta para recuperar el nombre de la compañía e ID de proveedor
-- de aquellos proveedores que viven en un país que tiene mas proveedores que la suma
-- de proveedores que tienen Brasil y España.
-- Nose

select CompanyName, SupplierID from suppliers;

-- subconsulta: suma de proveedores que tienen Brasil y España.
(select count(*) from suppliers where Country in ("Brazil", "Spain"));

-- 22: ciudades que tienen más clientes que Madrid.

select City from customers group by City having count(*) >
	(select count(*) from customers where City = "Madrid");
    
-- 23: ciudades que tienen más clientes que Madrid y Sevilla o Seville. Hacer con MAX.

select City, count(CustomerID) as TotalClientes from Customers group by City having COUNT(CustomerID) > (
        select max(conteo) from 
			(select count(CustomerID) as conteo from Customers where City in ('Madrid', 'Sevilla', 'Seville')
            group by City) as tabla_conteos);

-- 24: ciudades que tienen más clientes que Madrid o Sevilla o Seville. Hacer con la SUMA

SELECT City, COUNT(CustomerID) AS TotalClientes FROM Customers GROUP BY City HAVING COUNT(CustomerID) > (
        SELECT COUNT(CustomerID) FROM Customers WHERE City IN ('Madrid', 'Sevilla', 'Seville'));

-- 25: ciudades que tienen más clientes que la suma de clientes de Madrid, Sevilla o Seville y Lisboa.

-- 26: Escribir una consulta para imprimir el nombre, apellidos y edad de aquellos empleados
-- que tienen una edad igual o superior a la edad media.

-- 27: Escribir una consulta para imprimir el nombre, apellidos y edad de aquellos empleados
-- que tienen una edad igual o superior a la edad media de los empleados con el cargo Sales Representative.

-- 28: Productos cuyo valor de unidades en stock sea superior al valor mínimo de unidades en stock de los productos
-- de la categoría 4 o superior al valor mínimo de unidades en stock de los productos
-- de la categoría 6.

-- 29: Productos cuya categoría empieza por la letra C o D.

-- 30: Ciudades que tienen menos clientes (customers)
-- que la ciudad de Buenos Aires y Munich.

-- 31: empleados que son más jóvenes que Margaret, Laura y Michael.