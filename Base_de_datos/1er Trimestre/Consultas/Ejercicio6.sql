-- Nivel básico – Consultas simples (WHERE, ORDER BY)

-- 1. Muestra el nombre y país de todos los clientes que sean de España.
select nombre, pais from clientes where pais = "España";
-- 2. Lista las habitaciones que estén disponibles.
select * from habitaciones where estado = "disponible";
-- 3. Muestra las reservas confirmadas ordenadas por fecha_entrada descendente.
select * from reservas where estado = "confirmada" order by fecha_entrada desc;
-- 4. Obtén los empleados contratados después de 2023-01-01.
select * from empleados where fecha_contratacion > "2023-01-01";
-- 5. Muestra los clientes cuyo apellido empiece por “M”.
select * from clientes where apellido like "M%";

-- 🔹 Nivel intermedio – Funciones de cadena y fecha

-- 6. Crea una consulta que devuelva el nombre completo del cliente y su email en mayúsculas.
select concat_ws(" ", upper(nombre), upper(apellido), upper(email)) from clientes;
-- 7. Muestra el nombre del empleado y cuántos años lleva trabajando.
select nombre, timestampdiff(year, fecha_contratacion, now()) as "Años trabajando" from empleados;
-- 8. Calcula cuántos días dura cada reserva.
select *, timestampdiff(day, fecha_entrada, fecha_salida) as "dias reservados" from reservas;
-- 9. Muestra los tres primeros caracteres del nombre de cada cliente.
select nombre, substring(nombre, 1, 3) from clientes;
-- 10.Obtén la longitud del nombre completo de cada cliente.
select nombre, apellido, char_length(nombre) + char_length(apellido) from clientes;
-- Obten las ultimas 3 letras del nombre de los clientes.
select substring(nombre, char_length(nombre)-2) from clientes;
-- 🔹 Nivel avanzado – Funciones de agregado, GROUP BY, HAVING

-- 11.Número total de reservas por estado
select estado, count(*) from reservas group by estado;
-- 12.Duración promedio de las reservas por estado
select estado, avg(timestampdiff(day, fecha_entrada, fecha_salida)) from reservas group by estado;
-- 13.Número de clientes registrados por país
select pais, count(*) as "Numero de clientes" from clientes group by pais;
-- 14.Precio máximo y mínimo de habitaciones por tipo
select tipo, min(precio_noche) as "minimo precio", max(precio_noche) as "maximo precio" from habitaciones group by tipo;
-- 15.Número de reservas con duración superior a 5 días
select count(*) from reservas where timestampdiff(day, fecha_entrada, fecha_salida)>5;
-- 16.Salario promedio de empleados por cargo
select cargo, avg(salario) as salario from empleados group by cargo;
-- 17.Número de reservas por cliente, mostrando solo los que tengan más de 1 reserva
select id_cliente, count(*) as "Numero reservas por cliente" from clientes group by id_cliente having count(*)>1;