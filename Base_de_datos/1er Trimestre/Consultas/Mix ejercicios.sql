-- Selecciona el nombre y apellido de las personas que viven en Londres.
select FirstName, LastName from employees where city = "London";
-- Selecciona los tres primeros empleados cuyo título empiecen con S.
select * from employees where Title like "S%" limit 3;
-- Selecciona todos los campos de aquellos productos donde el precio unitario sea superior a 20.
select * from products where UnitPrice>20;
-- Selecciona todos los precios unitarios comprendidos entre 29 y 30 usando between.
select UnitPrice from products where (UnitPrice between 29 and 30);
-- Repite sin usar between.
select unitPrice from products where UnitPrice>=29 and UnitPrice<=30;
-- Selecciona todos los campos de la tabla Products cuyo nombre contenga la letra C.
select * from products where ProductName like "%c%";
-- Selecciona todos los campos donde el CategoryID sea 2, 3 o 4, usando el operador IN.
select * from products where CategoryID in (2, 3, 4);
-- Repite sin usar IN.
select * from products where CategoryID = 2 or CategoryID = 3 or CategoryID = 4;
-- Selecciona los productos con mayor y menor precio unitario. Usar dos sentencias SQL.
select max(UnitPrice), min(unitPrice)  from products;
-- Genere una lista de la tabla Employees (Empleado) donde solo se genere una columna 
-- de salida y esta contenga los campos: EmployeeID, LastName y FirstName en español.
select concat_ws(" ", employeeID, lastName, firstname) from employees;
-- Suponga que queremos ver aquellos productos (Tabla Products) cuyos valores se encuentran entre los 4 y 
-- 20 Dólares.
select * from products where UnitPrice between 4 and 20;
-- Liste los campos de la tabla productos que tengan exactamente un precio de 18, 19 y 10 dolares.
select * from products where (UnitPrice in (18, 19, 10));
-- Recuperar el apellido de los Empleados cuya primera letra comienza entre <<A>> y <<M>>.
select FirstName from employees where LastName >= "A" and LastName<="M";
-- Crear una consulta que muestre el apellido de todos aquellos empleados cuyo nombre comience por a o por b
select FirstName from employees where FirstName like "A%" or FirstName like "B%";
-- Crear una consulta que muestre el apellido de todos aquellos empleados cuyo nombre comience por alguna 
-- letra comprendida entre a y f
select LastName from employees where FirstName>="A%" and FirstName <="F%";
-- Crear una consulta que muestre el ID aquellos clientes cuyo pais es USA, SPAIN, ITALY. Imprimir
-- en una columna adicional: este es de USA/SPAIN/ITALY usando CASE-WHEN.
select CustomerID, Country, case when Country = "Spain" then "Es de España" 
when Country = "USA" then "Es de Estados Unidos" when Country = "Italy" 
then "Es de Italia" end as Pais from customers where Country = "Spain" or 
Country = "Italy" or Country = "USA";
-- Repetir sin usar CASE-WHEN.

-- Una lista de todos los detalles de la tabla de empleados.
select * from employees;
-- Una lista de los nombres y apellidos de todos los empleados.
select FirstName, LastName from employees;
-- Una lista de todos los nombres de las ciudades que aparecen en la tabla de empleados. 
-- No mostrar 2 veces un mismo nombre de ciudad.
select distinct City from employees;
-- Una lista de los nombres de productos y precios unitarios.
select ProductName, UnitPrice from products;
-- En la tabla de empleados: una lista de los detalles completos de los empleados que viven en EE.UU.
select * from employees where Country = "USA";
-- A partir de la tabla Pedidos, listar todos los pedidos que tienen un PESO (freight) > 50.
select * from orders where Freight>50;
-- De la tabla de clientes: listar nombre de la empresa de todos los clientes donde el cargo es igual 
-- a Propietario (owner).
select CompanyName from customers where ContactTitle = "owner";
-- A partir de los clientes una lista de todos donde el nombre del cliente comienza con la letra "A”
select * from customers where ContactName like "A%";
-- Una lista de los nombres de clientes donde la región no está en blanco.
select ContactName from customers where Region is not null;
-- Una lista de todos los productos, ordenado por precio unitario (el más barato primero).
select * from products order by UnitPrice;
-- Una lista de todos los productos, ordenado por precio unitario (el más caro primero).
select * from products order by UnitPrice desc;
-- El número total de empleados. Nombre de la columna de salida "TotalEmpleados".
select count(*) as "Total Empleados" from employees;
-- De la tabla de Pedidos, el pedido con el menor gasto de envió, el gasto de envió promedio y 
-- el máximo gasto de envio (puede estar separado en 3 consultas distintas).
select min(UnitPrice*Quantity), avg(UnitPrice*Quantity), max(UnitPrice*Quantity) from orderdetails;
-- Utilizando la tabla de clientes una lista de los nombres de ciudades y el número de clientes en cada ciudad.
select City, count(*) from customers group by City;
-- Utilizando la tabla de clientes una lista de los nombres de ciudades y el número de clientes en cada ciudad. 
-- Solo las ciudades con al menos 2 clientes deben aparecer en la lista.
select City, count(*) as "Numero de clientes" from customers group by City having count(*)>=2;