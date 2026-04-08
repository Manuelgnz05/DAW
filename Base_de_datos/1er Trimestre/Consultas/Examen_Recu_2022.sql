-- 1. Por cada producto, mostrar su nombre de producto y su nombre de categoría, pero
-- sólo si el ID de categoría es par.
select products.ProductName, categories.CategoryName 
from products 
join categories 
on (categories.CategoryID = products.CategoryID)
where categories.CategoryID%2 = 0;
-- 2. Por cada ID de empleado, mostrar su nombre, apellidos y cantidad de pedidos atendidos.
select FirstName, LastName, count(*) as "Pedidos atendidos"
from employees 
join orders
on (orders.EmployeeID = employees.EmployeeID)
group by orders.EmployeeID;
-- 3. Por cada país de proveedor, contar la cantidad de productos que se proveen, mostrando 
-- nombre de país y cantidad.
select suppliers.Country, count(*) 
from suppliers 
join products
on(suppliers.SupplierID = products.SupplierID)
group by suppliers.Country;
-- 4. Por cada ID de producto, mostrar la cantidad de pedidos en los que aparece. 
-- El ID de producto debe aparecer en los resultados.
select ProductID, count(*) 
from orderdetails
group by ProductID;
-- 5. Mostrar la cantidad de categorías que contienen alguna letra s en su descripción 
-- (al menos una).
select count(*) from categories where Description like "%s%";
-- 6. Por cada empleado, mostrar su nombre, apellidos, toda la información de cada pedido 
-- y detalle de pedido.
select employees.FirstName, employees.LastName, orders.*, orderdetails.* 
from employees 
join orders
on (orders.EmployeeID = employees.EmployeeID)
join orderdetails
on (orderdetails.OrderID = orders.OrderID);
