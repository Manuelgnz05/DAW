-- 1. Muestre el ID de proveedor, nombre de contacto y titulo de contacto (en este
-- mismo orden) para todos los proveedores existentes. La cabecera de las
-- columnas del grid de resultado deben mostrarse exactamente como ID de
-- proveedor, Nombre de contacto y Titulo de contacto, respetando los espacios.
-- Todas las cadenas de caracteres de las distintas filas devueltas deben aparecer
-- en mayúsculas.
select upper(SupplierID) as "ID de proveedor", 
upper(contactName) as "Nombre de contacto", upper(contactTitle) as "Titulo de contacto" 
from suppliers;
-- 2. Por cada producto muestre el nombre de producto, longitud en caracteres
-- del nombre de producto, precio unitario redondeado al entero inferior, número
-- de unidades en stock y ganancia. La ganancia de cada producto se calcula
-- multiplicando el número de unidades en stock del producto y el precio unitario
-- redondeado de dicho producto
select ProductName, length(ProductName) as Longitud, floor(unitPrice), UnitsInStock,
(UnitsInStock*floor(unitPrice)) as ganancias from products;
-- 3. Muestre los empleados cuya columna Extension comienza y termina en el
-- numero 3.
select * from employees where Extension like "3%3";
-- 4. Halle la antigüedad laboral en años de los empleados de London y Seattle.
-- Debe aparecer el nombre del empleado, su ciudad y su antigüedad.
select FirstName, City, timestampdiff(year, hireDate, now()) as antigüedad from employees 
where city in ("London", "Seattle");
-- 5. Por cada año, hallar la cantidad de pedidos que ha atendido cada empleado.
-- Utilice la fecha de pedido para ello.
select year(orders.OrderDate), employees.FirstName, count(*) 
from orders join employees
on (employees.EmployeeID = orders.EmployeeID) 
group by employees.EmployeeID, year(orders.OrderDate);
-- 6. Por cada titulo de contacto, mostrar cuantas veces se repite dicho titulo en la
-- tabla de proveedores.
select ContactTitle, count(*) from suppliers group by ContactTitle;
-- 7. Contar cuantas categorías tienen el carácter / en su nombre.
select count(*) from categories where CategoryName like "%/%";
-- 8. Mostrar el ID del empleado (y solo el ID) que ha atendido mas pedidos.
select EmployeeID from orders
group by orders.EmployeeID order by count(*) desc limit 1;