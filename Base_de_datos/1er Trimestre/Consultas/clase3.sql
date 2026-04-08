-- Imprimir el nombre de producto, precio unitario y precio unitario tras aplicar un descuento del 30%,
-- traduciendo al español los nombres de las columnas generadas en el informe.
select ProductName as "Nombre Producto", UnitPrice as "Precio Unitario", UnitPrice*0.7 
as "Con Descuento" from products;

select now();

select char_length("Manuel");
select FirstName, char_length(FirstName) from employees;

select concat("Pablo", "Perez");
select concat(FirstName, " ", LastName) as "Nombre Completo" from employees;
select concat_ws( " ", FirstName, LastName, EmployeeID) as "Nombre Completo" from employees;