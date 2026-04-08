-- 1. Muestra el nombre de todos los clientes en mayúsculas, ordenados alfabéticamente por apellido.
select upper(nombre) as Nombre from clientes order by apellido;
-- 2. Muestra el nombre y salario de los empleados cuyo cargo contenga la palabra “Recepcionista”.
select nombre, salario from empleados where cargo in ("Recepcionista");
-- 3. Muestra las habitaciones de tipo “Suite” cuyo precio por noche sea superior a 160€.
select * from habitaciones where tipo = "Suite" and precio_noche>160;
-- 4. Muestra los clientes cuyo año de registro sea 2023.
select * from clientes where year(fecha_registro) = 2023;
-- 5. Muestra el nombre y apellido del cliente, junto con la longitud (número de caracteres) de su nombre.
select nombre, apellido, length(nombre) as longitud_nombre from clientes;
-- 6. Calcula el número de habitaciones disponibles por tipo.
select tipo, count(*) as numero_habitaciones_disponibles from habitaciones where estado = "disponible" group by tipo;
-- 7. Calcula el salario promedio de los empleados agrupado por cargo.
select cargo, avg(salario) from empleados group by cargo;
-- 8. Muestra el número total de reservas realizadas por país de origen del cliente.
select clientes.pais, count(clientes.pais) from reservas join clientes 
on (reservas.id_cliente = clientes.id_cliente) group by clientes.pais; 
-- 9. Muestra la duración media (en días) de las reservas por estado (completada,
-- confirmada, etc.).
select estado, avg(timestampdiff(day, fecha_entrada, fecha_salida)) from reservas group by estado;
-- 10.Muestra los tipos de habitación cuya tarifa media supere los 100€.
select tipo, avg(precio_noche) as tarifa_media from habitaciones group by tipo having tarifa_media>100;
-- 11.Muestra el nombre completo del cliente, el número de habitación y el empleado que
-- gestionó cada reserva.
select concat_ws(" ", clientes.nombre, clientes.apellido), habitaciones.numero, empleados.nombre
from habitaciones join reservas on (reservas.id_habitacion=habitaciones.id_habitacion)
join clientes on (clientes.id_cliente = reservas.id_cliente) join empleados
on(empleados.id_empleado = reservas.id_empleado);
-- 12.Muestra el nombre del cliente, el tipo de habitación y la fecha de entrada de cada reserva
-- ordenada por fecha.
select clientes.nombre, habitaciones.tipo, reservas.fecha_entrada from reservas join clientes
on (reservas.id_cliente = clientes.id_cliente) join habitaciones 
on (habitaciones.id_habitacion = reservas.id_habitacion) order by reservas.fecha_entrada;
-- 13.Muestra el nombre del servicio y el nombre del cliente que lo contrató, sin repetir
-- combinaciones.
select distinct servicios.nombre, clientes.nombre from servicio_reserva join reservas
on (reservas.id_reserva = servicio_reserva.id_reserva) join servicios
on (servicios.id_servicio = servicio_reserva.id_servicio) join clientes 
on (clientes.id_cliente = reservas.id_cliente);
-- 14.Muestra el nombre del cliente y el importe total de los servicios contratados en todas sus
-- reservas.
select clientes.nombre, sum(servicios.precio) as "Importe total" from servicio_reserva join reservas
on (reservas.id_reserva = servicio_reserva.id_reserva) join servicios
on (servicios.id_servicio = servicio_reserva.id_servicio) join clientes 
on (clientes.id_cliente = reservas.id_cliente) group by clientes.nombre;
-- 15.Muestra el nombre y país de los clientes que han reservado una habitación de tipo “Suite” y
-- han contratado el servicio “Spa”.
select clientes.nombre, clientes.pais from servicio_reserva join reservas
on (reservas.id_reserva = servicio_reserva.id_reserva) join servicios
on (servicios.id_servicio = servicio_reserva.id_servicio) join clientes 
on (clientes.id_cliente = reservas.id_cliente) join habitaciones
on (habitaciones.id_habitacion = reservas.id_habitacion)
where habitaciones.tipo = "Suite" and servicios.nombre = "Spa";