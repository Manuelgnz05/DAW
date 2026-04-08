-- 1. Contar el número de empleados de Francia. 
-- Renombrar el nombre de la columna resultante.
select count(*) as "Empleados de Francia" from employees where Country = "Francia";

-- 2. Contar el numero de empleados de Estados Unidos o Reino Unido.
select count(*) from employees where Country = "USA" or Country = "UK";
-- 3. Contar el número de clientes de Madrid.
select count(*) from customers where City = "Madrid";

-- 4. Contar el número de clientes cuyo nombre de compañía empieza por F o B.
select count(*) from customers where (CompanyName like "F%") or (CompanyName like "B%");

-- 5. Calcular el precio unitario medio de los productos.
select avg(UnitPrice) from products;

-- 6. Calcular el total de unidades en stock.
select sum(UnitsInStock) from products;

-- 7. Calcular el total de unidades en pedido.
select sum(UnitsOnOrder) from products;