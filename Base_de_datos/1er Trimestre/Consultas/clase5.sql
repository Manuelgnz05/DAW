
select categoryID, avg(UnitsInStock) from products group by CategoryID;

select categoryID, avg(UnitsInStock) from products group by CategoryID having avg(UnitsInStock)<30;

select categoryID, avg(UnitsInStock) as media from products group by CategoryID having media<30;

-- De la tabla pedidos (Orders), imprimir por cada empleado el número de pedidos. 
-- Debe mostrarse el ID de empleado como ID DEL EMPLEADO y el número de pedidos como NUM_PEDIDOS.

select EmployeeID, count(*) as "pedidos realizados" from orders group by employeeID;

-- De la tabla OrderDetails, por cada pedido, imprimir el ID de pedido y el total de unidades

select orderID, sum(Quantity) as unidades from orderdetails group by OrderID;

-- Repetir el ejercicio anterior imprimiendo solo aquellos pedidos con un numero total de unidades inferior a 50

select orderID, sum(Quantity) as unidades from orderdetails group by OrderID having unidades<50;