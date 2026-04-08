-- 1. Mostrar el nombre del cliente y el número total de pedidos realizados.
SELECT Customers.ContactName, COUNT(Orders.OrderID) AS TotalPedidos
FROM Customers
JOIN Orders ON Customers.CustomerID = Orders.CustomerID
GROUP BY Customers.ContactName;

-- 2. Mostrar el importe total vendido por producto (precio unitario x cantidad)
SELECT Products.ProductName, SUM(orderdetails.UnitPrice * orderdetails.Quantity) AS ImporteTotal
FROM Products
JOIN orderdetails ON Products.ProductID = orderdetails.ProductID
GROUP BY Products.ProductName;

-- 3. Mostrar los clientes que han realizado más de 10 pedidos
SELECT Customers.ContactName, COUNT(Orders.OrderID) AS TotalPedidos
FROM Customers
JOIN Orders ON Customers.CustomerID = Orders.CustomerID
GROUP BY Customers.ContactName
HAVING TotalPedidos > 10;

-- 4. Mostrar el precio medio por categoría
SELECT Categories.CategoryName, AVG(Products.UnitPrice) AS PrecioMedio
FROM Categories
JOIN Products ON Categories.CategoryID = Products.CategoryID
GROUP BY Categories.CategoryName;

-- 5. Mostrar el pedido con mayor importe total
SELECT orderdetails.OrderID, SUM(orderdetails.UnitPrice * orderdetails.Quantity) AS ImporteTotal
FROM orderdetails
GROUP BY orderdetails.OrderID
ORDER BY ImporteTotal DESC
LIMIT 1;

-- 6. Mostrar el número de productos por proveedor
SELECT Suppliers.CompanyName, COUNT(Products.ProductID) AS NumeroProductos
FROM Suppliers
JOIN Products ON Suppliers.SupplierID = Products.SupplierID
GROUP BY Suppliers.CompanyName;

-- 7. Mostrar la media de días de envío por empleado. Los días de envío son los que transcurren entre la fecha de envío y la fecha de pedido.
SELECT Employees.FirstName, Employees.LastName, AVG(DATEDIFF(Orders.ShippedDate, Orders.OrderDate)) AS MediaDias
FROM Employees
JOIN Orders ON Employees.EmployeeID = Orders.EmployeeID
WHERE Orders.ShippedDate IS NOT NULL
GROUP BY Employees.FirstName, Employees.LastName;

-- 8. Productos cuyo precio es mayor que el precio medio
SELECT P1.ProductName, P1.UnitPrice
FROM Products AS P1
JOIN Products AS P2
GROUP BY P1.ProductID, P1.ProductName, P1.UnitPrice
HAVING P1.UnitPrice > AVG(P2.UnitPrice);