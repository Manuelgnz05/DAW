-- 1. Mostrar toda la información de todos los productos, mostrando los nombres de columnas
-- en castellano y separando cada palabra con un espacio. Ordenar en orden descendente.
select ProductID as "Id de producto", ProductName as "Nombre de producto",
SupplierID as "Id de proveedor", CategoryID as "ID de categoria",
QuantityPerUnit as "Cantidad por unidad", UnitPrice as "Precio por unidad",
UnitsInStock as "Unidades en stock", UnitsOnOrder as "Unidades pedidas", 
ReorderLevel as "NIvel de ordenacion", Discontinued as "Descatalogado"
from products order by ProductID desc;
-- 2. Mostrar el nombre de compañía, nombre de contacto y teléfono de todos los clientes.
select CompanyName, ContactName, Phone from customers;
-- 3. Por cada empleado mostrar su nombre, apellidos, día de nacimiento, mes de
-- nacimiento y año de nacimiento (en cinco columnas en total).
select FirstName, LastName, day(BirthDate), month(BirthDate), year(BirthDate) from employees;
-- 4. Mostrar los nombres de todos los productos en maýusculas.
select upper(productName) from products;
-- 5. Contar los productos con precio unitario superior a 50.
select count(*) from products where UnitPrice>50;
-- 6. Calcular media de carga (Freight) de los pedidos enviados
-- por la compañía de envíos con ID 3.
select avg(Freight) from orders where shipVia = 3;
-- 7. Mostrar la información de detalle de pedido, incluyendo además el nombre de cada -- producto.
select orderdetails.*, products.ProductName from orderdetails 
join products on (products.ProductID = orderdetails.ProductID);
-- 8. Por cada pedido mostrar toda su información (orders), incluyendo además
-- el país (Country) del empleado del pedido, y el país (Country) del cliente del pedido.
select orders.*, employees.Country, customers.Country from orders 
join employees on(employees.EmployeeID = orders.EmployeeID)
join customers on(customers.CustomerID = orders.CustomerID);
-- 9. Por cada ciudad, contar el número de proveedores (suppliers).
select city, count(distinct SupplierID) from suppliers group by City;
-- 10. Por cada país y ciudad, contar el número de empleados (employees).
select country, city,  count(*) from employees group by Country, City;