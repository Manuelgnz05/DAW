-- 1. Nombres de productos suministrados por proveedores de Australia, Canada o USA,
-- para aquellos productos con ID de producto par.

select ProductName from products where SupplierID in 
	(select SupplierID from suppliers where Country in ("Australia", "Canada", "USA")) 
    and ProductID%2 = 0;

-- 2. Productos cuyo nombre de categoría empieza por la letra C y termina por la letra S.

select * from products where CategoryID in (select CategoryID from categories where CategoryName like "C%S");

-- 3. Mostrar nombre y apellidos de aquellos empleados que tienen un número de pedidos superior
-- a los realizados por Anne Dodsworth o Nancy Davolio.

select FirstName, LastName from employees join orders on(orders.EmployeeID = employees.EmployeeID) 
group by orders.EmployeeID having count(*)>
	(select count(*) from employees join orders on (orders.EmployeeID = employees.EmployeeID) 
    where FirstName in ("Anne", "Dodsworth") or LastName in ("Nancy", "Davolio"));

-- 4. Países que tienen el triple de clientes que Irlanda.

select Country, count(*) from customers group by Country having count(*) >= 
	(select count(*)*3 from customers where Country = "Ireland");

-- 5. Productos cuyo valor de unidades en stock sea superior al valor medio de unidades en stock
-- de los productos de la categoría 3.

select * from products where UnitsInStock > 
	(select avg(UnitsInStock) from products where CategoryID = 3);

-- 6. Nombres de categorias con un número de productos superior al total de productos
-- presentes en los pedidos 10260, 10263 y 10283.

select CategoryName from categories 
join products on (categories.CategoryID = products.CategoryID)
group by CategoryName having count(*)> 
	(select count(*) from orderdetails where OrderID in (10260, 10263, 10283));
