-- Mostrar los productos para los que no hay stock
select count(*) from products where UnitsInStock = 0;
-- Sumar el total de unidades en stock de todos los productos cuyo campo UnitsOnOrder no sea cero.
select sum(UnitsInStock) from products where UnitsOnOrder != 0;
-- Contar el numero de empleados cuyo nombre empieza por "a"
select count(*) from employees where (FirstName like "A%");
-- Imprimir el número máximo de unidades en stock.
select max(UnitsInStock) from products;
-- Imprimir el número mínimo de unidades en stock.
select min(UnitsInStock) from products;
-- De todos aquellos productos cuyo campo UnitsOnOrder es superior a 30, imprimir el número 
-- máximo de unidades en stock.
select max(UnitsInStock) from products where UnitsOnOrder > 30;
-- De todos aquellos productos para los que no hay stock, el precio mayor.
select max(UnitPrice) from products where UnitsInStock = 0;
-- 
select avg(UnitPrice) as MEDIA, var_pop(UnitPrice) as VARIANZA, stddev(UnitPrice) as DESVIACION from products;
