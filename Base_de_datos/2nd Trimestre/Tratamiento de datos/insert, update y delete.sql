-- BASE DE DATOS: PIEZAS
-- 1. Añadir una entrada a la base de datos para indicar que "Suministros Skellington" (code "TNBC") 
-- proveerá piñones (code "1") por 7 céntimos cada uno.
insert into provee (ID_pieza, ID_proveedor, precio) values (1, 'TNBC', 7);
-- 2. Incrementa todos los precios por un céntimo.
update provee set precio = precio+1;
-- 3. Actualiza la base de datos para reflejar que "Corporacion Susan Calvin" (code "RBT") no proveerá clavos (code 4).
delete from provee where ID_Proveedor = "RBT" and ID_Pieza = 4;
-- 4. Actualiza la base de datos para reflejar que "Corporacion Susan Calvin" (code "RBT") no proveerá ninguna pieza 
-- (el proveedor debe permanecer en la base de datos).
delete from provee where ID_Proveedor = "RBT";
-- BASE DE DATOS: MOVIES
-- 1. Añade la película "One, Two, Three" sin calificación.
insert into movies (Code, Title) values (10, 'One, Two, Three');
-- 2. Configura la calificación de todas las películas sin calificar a "G"
update movies set rating = "G" where rating is null;
-- 3. Elimina cines que proyecten películas calificadas con "NC-17".
delete from movietheaters where code = 6;
-- BASE DE DATOS: WAREHOUSES
-- 1. Crea un nuevo almacén en New York con capacidad para 3 cajas.
insert into warehouses (code, location, capacity) values (6, 'New York', 3);
-- 2. Crea una nueva caja con código "H5RT", que contenga "Papers" con un valor de $200, y situada en el almacén 2.
insert into boxes (code, contents, value, warehouse) values ('H5RT', 'Papers', 200, 2);
-- 3. Reduce el valor de todas las cajas un 15%.
update boxes set value = value*0.85;
-- 4. Aplica un 20% de reducción a las cajas con un valor superior que el valor medio de todas las cajas.
update boxes set value = value*0.80 where avg(value)>value; -- No se puede
-- 5. Elimina todas las cajas con un valor inferior a $100.
delete from boxes where value<100;
-- 6. Elimina todas las cajas de los almacenes saturados.

-- BASE DE DATOS: DEPARTMENTS
-- 1. Añade un nuevo departamento llamado "Quality Assurance", con un presupuesto de $40,000 y 
-- código de departamento de 11. Añade un empleado llamado "Mary Moore" en ese departamento, con SSN 847-21-9811.
insert into departments (code, name, budget) values (11, 'Quality Assurance', 40000);
insert into employees (SSN, name , lastname, department) values (847-21-9811, 'Mary', 'Moore', 11);
-- 2. Reduce el presupuesto de todos los departamentos un 10%.
update departments set budget = budget*0.90;
-- 3. Reasigna todos los empleados del departamento Research (code 77) al departamento IT (code 14).
update employees set department = 14 where department = 77;
-- 4. Borra todos los empleados del departamento de IT (code 14).
delete from employees where Department = 14;
-- 5. Borra todos los empleados que trabajan en departamentos con un presupuesto superior o igual a $60,000.
-- No se puede hacer
-- 6. Borra todos los empleados.
delete from employees;
-- BASE DE DATOS: MANUFACTURERS
-- 1. Añade un nuevo producto: Loudspeakers, $70, manufacturer 2.
insert into products (code, name, price, manufacturer) values (11, 'Loudspeakers', 70, 2);
-- 2. Actualiza el nombre del producto 8 a "Laser Printer".
update products set name = "Laser Printer" where code = 8;
-- 3. Aplica un 10% de descuento a todos los productos.
update products set price = price*0.90;
-- 4. Aplica un 10% de descuento a todos los productos con un precio superior o igual a $120.
update products set price = price*0.90 where price >= 120;