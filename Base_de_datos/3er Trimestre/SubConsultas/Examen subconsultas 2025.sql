-- 1.Obtener las ciudades de los clientes donde la cantidad de clientes es menor que la
-- diferencia entre la cantidad de clientes en Buenos Aires y la cantidad de clientes en
-- Barcelona.

select City, count(*)
from customers
group by City 
having count(*) < (
	(select count(*) from customers where City = "Buenos Aires") - 
    (select count(*) from customers where City = "Barcelona")
);

-- 2.Seleccionar todos los productos cuyo stock disponible sea menor que el promedio de
-- stock de todos los productos y cuyo precio unitario sea menor que el promedio
-- del precio unitario de todos los productos.

select * from products where unitsinstock < 
	(select avg(unitsinstock) from products) and unitprice < 
	(select avg(unitprice) from products);

-- 3.Obtener los nombres y apellidos de los empleados que han gestionado
-- menos pedidos que la cantidad de pedidos
-- realizados por los empleados con ID 1 o 4.

select employees.firstname, employees.lastname
from employees
join orders on employees.employeeid = orders.employeeid
group by employees.employeeid, employees.firstname, employees.lastname
having count(*) < any (
    select count(orderid)
    from orders
    where employeeid in (1, 4)
);

-- 4. Por cada empleado mostrar la descripción de su territorio junto con el ID de territorio
-- y empleado.

select employeeid, territoryid,
    (select territorydescription from territories where territoryid = employeeterritories.territoryid) as territorydescription
from employeeterritories;

-- 5. Mostrar los productos con descuento junto con el ID de pedido y el empleado que
-- atendió el pedido.

select ProductID, orders.OrderID, EmployeeID from orderdetails join orders on (orderdetails.OrderID=orders.OrderID) 
where ProductID in (select ProductID from orderdetails where Discount !=0) order by ProductID;

-- 6. Por cada cliente halle la cantidad total de pedidos, sólo para aquellos clientes de
-- Alemania, Canadá o Venezuela que tienen algún valor visible en el campo Region.

select CustomerID, count(*) as TotalPedidos from orders 
where CustomerID in (select CustomerID from customers where Country in ('Alemania', 'Canadá', 'Venezuela') and Region!="")
group by CustomerID;

-- 7. Halle el total de unidades en stock para aquellos productos cuya descripción de
-- categoría es “Carnes preparadas”.

select ProductID, UnitsInStock
from products
where CategoryID in (
	select CategoryID from categories where Description = "Prepared meats"
);

-- 8. Productos cuyo precio unitario sea mayor que el precio unitario promedio y vendidos por
-- proveedores con 3 o más productos.

select ProductID, UnitPrice
from products
where UnitPrice > (
	select avg(UnitPrice) from products
) and SupplierID in (
	select SupplierID
	from products
	group by SupplierID
	having count(*) >= 3
);
