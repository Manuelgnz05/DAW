-- 1. Mostrar todos los empleados y todos sus atributos.
select * from employees;
-- 2. Mostrar todos los productos y todos sus atributos.
select * from products;
-- 3. Mostrar el ID, nombre y categoría de los productos.
select productID, ProductName, CategoryID from products;
-- 4. Mostrar los productos que pertenecen a la categoría 2.
select * from products where CategoryID = 2;
-- 5. Productos que pertenece a la categoría 2 y 4.
select * from products where (CategoryID = 2) and (CategoryID = 4);
-- 6. Productos que pertenece a la categoría 2 o 4.
select * from products where (CategoryID = 2) or (CategoryID = 4);
-- 7. Mostrar id de producto, nombre de producto y precio unitario para todos aquellos 
-- productos cuyo precio unitario sea superior a 100.
select productID, ProductName, unitprice from products where unitprice > 100;
-- 8. Mostrar el producto con nombre “tofu”.
select * from products where ProductName = "tofu";
-- 9. Mostrar los productos cuyo ID se encuentra en la categoría, 2, 3 o 4. Hacer de dos formas distintas.
select * from products where (CategoryID = 2) or (CategoryID = 3) or (CategoryID = 4);
select * from products where CategoryID between 2 and 4;
-- 10. Mostrar los productos cuyo ID de proveedor se encuentra en la categoría 3,5 u 8.
select * from products where (SupplierID = 3) or (SupplierID = 5) or (SupplierID = 8);
-- 11. Mostrar los productos cuyo precio oscilan entre 30 y 60 dólares.
select * from products where unitprice between 30 and 60;
-- 12. Mostrar los productos cuyo stock está entre 0 y 10.
select * from products where UnitsInStock between 0 and 10;
-- 13. Mostrar todos los productos que empiezan con ‘c’.
select * from products where ProductName like "c%";
-- 14. Ordenar todos los productos por nombre, en orden ascendente.
select * from products order By ProductName;
-- 15. Ordenar todos los productos por ID, en orden descendente.
select * from products order By ProductID desc;
-- 16. Seleccione todos los campos de la tabla cliente, ordenado por nombre del contacto
-- de la compañía, alfabéticamente.
select * from customers order by ContactName;
-- 17. Seleccione todos los campos de la tabla pedidos, ordenados por fecha del pedido,
-- descendentemente.
select * from orders order by orderDate desc;
-- 18. Seleccione todos los campos de la tabla detalle del pedido, ordenada por cantidad
-- pedida, ascendentemente.
select * from orderdetails order by Quantity;
-- 19. Obtener todos los productos, cuyo nombre comienzan con la letra P y tienen un
-- precio unitario comprendido entre 10 y 120.
select * from products where (ProductName like "P%") and (UnitPrice between 10 and 120);
-- 20. Obtener todos los clientes de los países de: USA, France o UK. Hacer de dos formas.
select * from customers where (Country = "USA") or (Country = "France") or (Country = "UK");
select * from customers where Country in ("USA", "France", "UK");
-- 21. Obtener todos los productos descontinuados (Discontinued=1) o sin stock, que
-- pertenecen a la categoría 1, 3, 4 o 7.
select * from products where ((Discontinued = 1) or (UnitsInStock = 0)) and CategoryID in (1,3,4,7);
-- 22. Obtener todas los pedidos hechos por el empleado con código: 2, 5 o 7 en el año 1996.
select * from orders where (EmployeeID in (2, 5, 7)) and (year(OrderDate) = 1996);
-- 23. Seleccionar todos los clientes que cuenten con Fax (valor distinto de null).
select * from customers where fax is not null;
-- 24. Seleccionar todos los empleados que cuentan con un jefe (campo ReportsTo).
select * from employees where reportsTo is not null;
-- 25. Seleccionar todos los campos del cliente, cuya compañía empiecen con letra A
-- hasta la D y pertenezcan al país de USA, ordenarlos por la dirección.
select * from customers where ((CompanyName like "A%") or (CompanyName like "B%") 
or (CompanyName like "C%") or (CompanyName like "D%")) and (Country = "USA") order by address;
-- 26. Seleccionar todos los campos del cliente, cuya compañía empiecen con las letras
-- de la B a la G, y pertenezcan al país de UK, ordenarlos por nombre de la compañía
SELECT * FROM customers WHERE CompanyName >= 'B' AND CompanyName < 'H' AND Country = 'UK' ORDER BY CompanyName;
-- 27. Seleccionar los productos vigentes cuyos precios unitarios están entre 35 y 250, sin
-- stock en almacén, pertenecientes a las categorías 1, 3, 4, 7 u 8, que son
-- distribuidos por los proveedores, 2, 4, 6, 7, 8 o 9
select * from products where (Discontinued = 0) and (UnitPrice between 35 and 250) 
and (UnitsInStock = 0) and (CategoryID in (1, 3, 4, 7, 8)) and (SupplierID in (2, 4, 6, 7, 8, 9));
-- 28. Seleccionar todos los campos de los productos descontinuados, que pertenezcan a
-- los proveedores con códigos: 1, 3, 7, 8 y 9, que tengan stock en almacén, y al
-- mismo tiempo que sus precios unitarios estén entre 39 y 190, ordenados por código
-- de proveedores y precio unitario de manera ascendente.
select* from products where (Discontinued = 1) and (SupplierID in (1, 3, 7, 8, 9)) 
and (UnitsInStock>0) and (UnitPrice between 39 and 190) order by SupplierID, UnitPrice desc;


-- Productos que en sus nombres contienen la letra "t"
select * from products where ProductName like "%t%";

