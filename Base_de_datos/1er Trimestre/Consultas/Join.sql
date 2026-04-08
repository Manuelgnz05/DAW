-- 1. Obtener todos los pedidos hechos por el empleado King, Robert.
SELECT orders.* 
FROM employees JOIN orders 
ON(employees.EmployeeID = orders.EmployeeID) where employees.FirstName = "Robert" 
and employees.LastName = "King";
-- 2. Obtener todos los pedidos hechos por el empleado (King, Robert) (Davolio, Nancy) y (Fuller, Andrew).
SELECT orders.* 
FROM employees JOIN orders 
ON(employees.EmployeeID = orders.EmployeeID) where employees.FirstName in ("Robert", "Nancy", "Andrew")
and employees.LastName in ("King", "Davolio", "Fuller");
-- 3. Obtener todos los pedidos del cliente cuyo nombre de contacto es "Bernardo Batista".
select orders.* from customers join orders on(customers.CustomerID = orders.CustomerID) 
where customers.ContactName = "Bernardo Batista";
-- 4. Obtener todos los productos(código de producto, nombre, precio, stock) del pedido 10257.
select products.ProductID, products.ProductName, products.UnitPrice, products.UnitsInStock from products 
join orderdetails on (products.ProductID = orderdetails.ProductID) where orderdetails.OrderID = 10257;
-- 5. Obtener todos los productos(código de producto, nombre, precio, stock) de los pedidos hechos 
-- desde 1997 hasta la fecha de hoy.
select products.ProductID, products.ProductName, products.UnitPrice, products.UnitsInStock from products 
join orderdetails on (products.ProductID = orderdetails.ProductID) join orders 
on (orderdetails.OrderID = orders.OrderID) where year(orders.OrderDate) between 1997 and now();
-- 6. Mostar el ID del pedido, fecha del pedido y el total de productos de cada pedido.
select orders.OrderID, orders.OrderDate, count(orders.OrderID) from orders join orderdetails 
on (orders.OrderID = orderdetails.OrderID) group by orders.OrderID, orders.OrderDate;
-- 7. Obtener el nombre de todas las categorías y los nombres de sus productos, precio y stock.
select categories.CategoryName, products.ProductName, products.UnitPrice, products.UnitsInStock 
from categories join products on(products.CategoryID = categories.CategoryID);
-- 8. Obtener el número de productos por cada categoría mostrando el nombre de la categoría, solamente 
-- para las categorías 3, 5 y 8. Ordenar por el nombre de la categoría.
select categories.CategoryName, count(categories.CategoryID) from categories join products 
on (products.CategoryID = categories.CategoryID) group by categories.CategoryID 
having categories.CategoryID in (3, 5, 8) order by categories.CategoryName; 
-- 9. 
-- 10. Por cada pedido, obtener el ID de pedido, ID de producto, ID de proveedor y el nombre de la compañía.
select orderdetails.OrderID, products.ProductID, suppliers.SupplierID, suppliers.CompanyName from products
join suppliers on(products.SupplierID = suppliers.SupplierID) join orderdetails 
on(products.ProductID = orderdetails.ProductID);
-- 11. Por cada pedido, obtener el ID de pedido, ID de empleado y el nombre de empleado.
select orders.OrderID, employees.EmployeeID, employees.FirstName from employees join orders 
on (employees.EmployeeID = orders.EmployeeID);
-- 12. Por cada producto, obtener el ID de producto, ID de categoría y el nombre de categoría.
select products.ProductID, categories.CategoryID, categories.CategoryName from categories join products
on (products.CategoryID = categories.CategoryID);
-- 13. Por cada empleado, imprimir el ID de empleado, nombre, apellido e ID de territorio.
select employees.EmployeeID, employees.FirstName, employees.LastName, territories.TerritoryID 
from territories join employeeterritories on(employeeterritories.TerritoryID = territories.TerritoryID)
join employees on (employees.EmployeeID = employeeterritories.EmployeeID);
-- 14. Por cada cliente, mostrar el ID de cliente, nombre de contacto y pedidos que ha hecho.
select customers.CustomerID, customers.ContactName, orders.OrderID 
from customers join orders on (customers.CustomerID = orders.CustomerID);
-- 15. Por cada cliente, mostrar el ID de cliente, nombre de contacto y numero total pedidos.
select customers.CustomerID, customers.ContactName, count(customers.CustomerID) 
from customers join orders on (customers.CustomerID = orders.CustomerID) 
group by  customers.CustomerID, customers.ContactName;
-- 16. Por cada pedido presente en orderdetails, imprimir toda su información y además, el nombre de 
-- la categoría a la que pertenece.
select orderdetails.*, categories.CategoryName from categories join products 
on (products.CategoryID = categories.CategoryID) join orderdetails 
on (orderdetails.ProductID = products.ProductID);
-- 17. Por cada pedido, mostrar el ID de pedido, dirección del cliente y dirección del empleado.
select orders.OrderID, customers.Address, employees.Address from orders join customers 
on (orders.CustomerID = customers.CustomerID) join employees on (employees.EmployeeID = orders.EmployeeID);
-- 18. Por cada producto, mostrar el ID de producto, nombre de producto y dirección del proveedor.
select products.ProductID, products.ProductName, suppliers.Address from suppliers join products
on (suppliers.SupplierID = products.SupplierID);
-- 19. Visualizar el nombre de la compañía y el id del cliente, fecha, precio unitario y producto del pedido.
select customers.CompanyName, customers.CustomerID, orders.OrderDate, products.UnitPrice, products.ProductName
from orders join orderdetails on (orderdetails.OrderID = orders.OrderID) 
join products on (products.ProductID = orderdetails.ProductID)
join customers on (customers.CustomerID = orders.CustomerID);
-- 20. Mostrar el nombre del producto, el precio, el stock y el nombre de la categoría a la que pertenece.
select products.ProductName, products.UnitPrice, products.UnitsInStock, categories.CategoryName
from products join categories on (categories.CategoryID = products.CategoryID);
-- 21. Mostrar el nombre del producto, el precio producto, el código del proveedor y el nombre de la
-- compañía proveedora.
select products.ProductName, products.UnitPrice, suppliers.SupplierID, suppliers.CompanyName 
from suppliers join products on (products.SupplierID = suppliers.SupplierID);
-- 22. Mostrar el id del pedido, fecha, código del producto, precio, código del empleado y su nombre completo.
select orders.OrderID, orders.OrderDate, products.ProductID, products.UnitPrice, employees.EmployeeID,
concat_ws(" ", employees.FirstName, employees.LastName) from orders join orderdetails 
on (orders.OrderID = orderdetails.OrderID) join products on (products.ProductID = orderdetails.ProductID)
join employees on (employees.EmployeeID = orders.EmployeeID); 
-- 23. Calcular el stock de productos por cada categoría. Mostrar el nombre de la categoría y el stock por 
-- categoría.
select  categories.CategoryName, sum(products.UnitsInStock) from categories join products 
on(categories.CategoryID = products.CategoryID) group by categories.CategoryID;
-- 24. Obtener el nombre del cliente, nombre del proveedor, nombre del empleado y el nombre de los productos 
-- que están en el pedido 10794.
select customers.ContactName, suppliers.CompanyName, employees.FirstName, products.ProductName
from orderdetails join products on (orderdetails.ProductID = products.ProductID) join suppliers
on (suppliers.SupplierID = products.SupplierID) join orders on (orderdetails.OrderID = orders.OrderID)
join customers on (customers.CustomerID = orders.CustomerID) join employees 
on (employees.EmployeeID = orders.EmployeeID) where orderdetails.OrderID = 10794;
-- 25. Seleccionar el nombre de la compañía del cliente, el código de la orden de compra, la fecha de la 
-- orden de compra, código del producto, cantidad pedida del producto, nombre del producto, el nombre de 
-- la compañía proveedora y la ciudad del proveedor, usar Join.
select customers.ContactName, orders.OrderID, orders.OrderDate, products.ProductID, 
products.UnitsOnOrder, products.ProductName, suppliers.CompanyName, suppliers.City from orders
join customers on (customers.CustomerID = orders.CustomerID) join orderdetails
on (orderdetails.OrderID = orders.OrderID) join products on (orderdetails.ProductID = products.ProductID)
join suppliers on (suppliers.SupplierID = products.SupplierID);
-- 26. Seleccionar cuantos proveedores tengo en cada país, considerando solo a los nombres de los 
-- proveedores que comienzan con la letra E hasta la letra P, además de mostrar solo los países donde 
-- tenga más de 2 proveedores.
select country, count(*) as "Total" from suppliers where CompanyName like  ("E%" and "P%") group by Country ;
-- 27. Crear una consulta que muestre el nombre de empleado y el número de empleados que cada uno de los 
-- empleados tiene a su cargo, pero solo para aquellos empleados que tienen gente a su cargo.

-- 28. Crear una consulta que muestre el nombre de empleado, el número de pedidos tramitado por cada 
-- empleado, de aquellos empleados que han tramitado mas de 15 pedidos.

-- 29. Crear una consulta que muestre el nombre del cliente, el número de pedidos que nos ha realizado el 
-- cliente, el dinero que nos ha dejado en la empresa, de todos los clientes que sean de USA y que nos han 
-- realizado mas de 5 pedidos.

-- 30. Crear una consulta que muestre el nombre del jefe y el número de empleados a su cargo de aquel jefe 
-- que mas empleados tenga a su cargo.

-- 31. Obtener el nombre del cliente y el número de pedidos del cliente que mas pedidos ha realizado en la 
-- empresa

-- 32. Obtener el nombre del cliente y el volumen de negocio del cliente que mas volumen de negocio 
-- nos ha dejado en la empresa.

-- MUY LARGOS, NO HACER
-- 33. Seleccionar el nombre de la compañía del cliente, nombre del contacto, el código de la orden de 
-- compra, la fecha de la orden de compra, el código del producto, cantidad pedida del producto, nombre 
-- del producto y el nombre de la compañía proveedora, usar JOIN. Solamente las compañías proveedoras que 
-- comienzan con la letra de la A hasta la letra G, además la cantidad pedida del producto debe estar 
-- entre 23 y 187.

-- 34. Seleccionar el nombre de la compañía del cliente, el código de la orden de compra, la fecha de la 
-- orden de compra, código del producto, cantidad pedida del producto, nombre del producto, el nombre de 
-- la compañía proveedora y la ciudad del proveedor.

-- 35. Seleccionar el nombre de la compañía del cliente, nombre del contacto, el código de la orden de 
-- compra, la fecha de la orden de compra, código del producto, cantidad pedida del producto, nombre del 
-- producto y el nombre de la compañía proveedora, usar Join. Solamente las compañías proveedoras que 
-- comienzan con la letra de la A hasta la letra G, además la cantidad pedida del producto debe estar 
-- entre 18 y 190.

