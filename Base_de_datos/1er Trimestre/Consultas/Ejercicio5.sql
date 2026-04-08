-- 1. Por cada pedido, mostrar el número de filas/registros/tuplas (tabla OrderDetails).
select OrderID, count(*) from orderdetails group by OrderID;
-- 2. Por cada producto, mostrar el número de filas/registros/tuplas (tabla OrderDetails).
select ProductID, count(*) from orderdetails group by ProductID;
-- 3. Por cada cliente, mostrar el número de pedidos.
select CustomerID, count(*) from orders group by CustomerID;
-- 4. Repetir el anterior sólo con envíos desde/hacia Londres (ShipCity).
select CustomerID, count(*) from orders where ShipCity = "London" group by CustomerID;
-- 5. Repetir el ejercicio 1 mostrando sólo aquellos que tienen más de 4 líneas.
select OrderID, count(*) as lineas from orderdetails group by OrderID having lineas > 4;
-- 6. Por cada cliente, mostrar el número de pedidos sólo para los clientes con más de 10
-- pedidos.
select CustomerID, count(*) as pedidos from orders group by CustomerID having pedidos > 10;
-- 7. Mostrar el número de empleados en cada ciudad.
select City, count(*) as empleados from employees group by City;
-- 8. Mostrar el número de empleados en cada ciudad que tenga al menos dos empleados.
select City, count(*) as empleados from employees group by City having empleados>=2;
-- 9. Mostrar el número de empleados en cada ciudad que tengan el cargo de ‘Sales
-- representative’, para aquellas ciudades con al menos dos empleados de este cargo.
-- Ordenar por el número de empleados.
select City, count(*) as empleados from employees where Title = "Sales representative" 
group by City having empleados >= 2 order by empleados;
-- 10. Muestra las distintas ciudades en las que hay empleados.
select distinct(City) from employees;
-- 11. Cuenta las ciudades en las que hay empleados.
select count(distinct(City)) from employees;
-- 12. Por cada país y ciudad de envío, mostrar el total de pedidos.
select ShipCity as ciudad, ShipCountry as pais, count(*) as numero_pedidos from orders group by ShipCity, ShipCountry;
-- 13. Por cada país y ciudad, contar los empleados que tienen el cargo de ‘Sales
-- representative’.
select City as ciudad, Country as pais, count(*) from employees where Title = "Sales representative" group by ciudad, pais;
-- 14. Por cada país y ciudad, contar el número de clientes.
select City, Country, count(*) from customers group by City, Country;
-- 15. Repetir el anterior mostrando sólo aquellos que tienen más de un cliente.
select City, Country, count(*) as clientes from customers group by City, Country having cliente>1;
-- 16. Por cada producto, hallar la cantidad de unidades vendidas y la media por pedido.
select ProductID, sum(Quantity), avg(Quantity) from orderdetails group by ProductID;
-- 17. Por cada pedido, contar los distintos productos vendidos (no la cantidad).
select OrderID, count(distinct(ProductID)) from orderdetails group by OrderID;
-- 18. Repetir el anterior mostrando solo los pedidos con un único producto.
select OrderID, count(distinct(ProductID)) as productos_disitintos from orderdetails group by OrderID having productos_disitintos = 1;
-- 19. En la tabla de proveedores (Suppliers), contar el número de proveedores por cada
-- título de contacto (ContactTitle).
select ContactTitle, count(*) as "Numero de proveedores" from suppliers group by ContactTitle;
-- 20. Contar el número de productos que empiezan por la letra C.
select count(*) from products where ProductName like "C%";
-- 21. Contar el número de pedidos que fueron realizados en un mes de Julio (OrderDate).
select count(*) from orders where (extract(month from orderDate) = 7) ;
-- 22. Contar el número de pedidos realizados por el cliente DUMON en el año 1997.
select count(*) from orders where CustomerID = "DUMON" and (extract(year from orderDate) = 1997);
-- 23. Contar el número de pedidos (Orders) en los que los años de sus campos de tipo fecha
-- no son exactamente iguales entre si, es decir, los valores de esas tres columnas no se
-- repiten para una misma fila.
select count(*) from orders where OrderDate != RequiredDate and OrderDate != ShippedDate and RequiredDate != ShippedDate;
