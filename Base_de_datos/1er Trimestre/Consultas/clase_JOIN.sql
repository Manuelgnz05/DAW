-- Por cada pedido, mostrar el ID de pedido así como el nombre y apellido del empleado asociado
SELECT employees.EmployeeID, orders.OrderID, concat(employees.FirstName, 
" ", employees.LastName) 
FROM employees, orders 
WHERE employees.EmployeeID = orders.EmployeeID;

SELECT employees.EmployeeID, orders.OrderID, concat(employees.FirstName, 
" ", employees.LastName) 
FROM employees JOIN orders 
ON(employees.EmployeeID = orders.EmployeeID);

SELECT employees.EmployeeID, orders.OrderID, concat(employees.FirstName, 
" ", employees.LastName) 
FROM employees INNER JOIN orders 
ON(employees.EmployeeID = orders.EmployeeID);

-- EJERCICIO 1: realizar una consulta donde obtengamos 
-- el ID de los pedidos asociados a la empleada Nancy Davolio.

SELECT employees.EmployeeID, orders.OrderID, concat(employees.FirstName, 
" ", employees.LastName) 
FROM employees JOIN orders 
ON(employees.EmployeeID = orders.EmployeeID) where employees.FirstName = "Nancy";

-- EJERCICIO 2: recuperar todos los campos de la tabla Orders,
-- imprimiendo además la compañía del cliente.

select orders.*, customers.CompanyName from customers join orders 
on (customers.CustomerID = orders.CustomerID);

-- EJERCICIO 3: por cada producto, mostrar el nombre del producto y el nombre
-- de la compañía que lo provee.