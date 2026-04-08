-- Mostrar todos los productos cuyo precio unitario sea superior al precio unitario medio

select * from products where UnitPrice > (select avg(UnitPrice) from products);

-- Subconsulta (hija): obtener el precio unitario medio
select avg(UnitPrice) from products;

-- Consulta padre: productos cuyo precio unitario
-- sea superior al numerito
select * from products where UnitPrice>(select avg(UnitPrice) from products);

-- Empleados que no son representantes de ventas (Sales representative)

-- subconsulta: empleados que son representantes de venta
select EmployeeID from employees where Title = "Sales Representative";

select * from employees where EmployeeID not in 
	(select EmployeeID from employees where Title = "Sales Representative");