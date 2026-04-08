-- 1. Selecciona todas las filas de la tabla de empleados
select * from employees;
-- 2. Repite lo anterior, pero mostrando sólo el nombre y primer apellido de cada empleado.
select FirstName, LastName from employees;
-- 3. Repite lo anterior, pero mostrando la cabecera de las columnas en español.
select FirstName as "Nombre", LastName as "Apellido" from employees;
-- 4. Selecciona todas las filas de la tabla de pedidos y anota 
-- cuantas hay en total. A continuación, selecciona de nuevo todas las filas
-- pero mostrando únicamente el ID de pedido, contando de nuevo
-- cuantas hay. ¿Coincide con la anotación anterior? ¿Por qué?
select * from orders;
-- Hay 830 filas
select OrderID from orders;
-- Si que coincide

-- 5. Muestra el nombre de las distintas compañías proveedoras,
-- renombrando la cabecera de la columna como Nombre de compañía (respeta los espacios).
select CompanyName as "Nombre de Compañia"from suppliers;

-- 6. Muestra el ID de producto y nombre de producto de todos los productos.
select ProductID, productName from products;

-- 7. Visualiza todo el contenido de la tabla de productos. A continuación haz lo mismo
-- con la tabla de pedidos, y de nuevo, haz lo mismo con la tabla de detalle de pedidos.
-- ¿El contenido de las tres tablas guarda alguna similitud o relación? ¿Crees que tienen
-- algo que ver?
select * from products;
select * from orders;
select * from orderdetails;
-- Si el productID
-- Claro ya que los tres tienen que ver con los productos que piden.