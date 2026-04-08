-- 1
select SupplierID as "ID de proveedor", CompanyName as "Nombre de compañia" from suppliers where CompanyName like "%Ltd.";
-- 2
select * from orders where month(ShippedDate) = 4;
-- 3
select products.*, orders.OrderID, employees.EmployeeID from products 
join orderdetails on (orderdetails.ProductID = products.ProductID)
join orders on (orders.OrderID = orderdetails.OrderID)
join employees on (employees.EmployeeID = orders.EmployeeID) 
where orderdetails.Discount>0;
-- 4
select Country, count(*) from customers where fax is not null group by customers.Country;
-- 5
select count(*) from orders where ShipVia = 3;
-- 6
select avg(reorderLevel) from products where ProductName like "c%";
-- 7
select count(*) from categories where Picture is not null;
-- 8
select * from suppliers where City = "London";
-- 9
select sum(UnitsInStock) from products where ProductID%2 = 0;
-- 10
select territories.TerritoryDescription, territories.TerritoryID, employees.EmployeeID from employees 
join employeeterritories on (employees.EmployeeID = employeeterritories.EmployeeID)
join territories on (territories.TerritoryID = employeeterritories.TerritoryID);