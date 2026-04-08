-- Nivel Básico – INNER JOIN entre dos tablas

-- 1. Muestra el nombre y país de cada cliente junto con el identificador de su reserva.
select clientes.nombre, clientes.pais, reservas.id_reserva from clientes join reservas 
on (clientes.id_cliente = reservas.id_cliente);
-- 2. Muestra el nombre y apellido del empleado que gestionó cada reserva.
select empleados.nombre, empleados.apellido, reservas.id_reserva from empleados join reservas
on(empleados.id_empleado = reservas.id_empleado);
-- 3. Muestra el número de habitación y el estado de cada reserva.
select habitaciones.numero, reservas.estado from habitaciones join reservas 
on (habitaciones.id_habitacion = reservas.id_habitacion);
-- 4. Muestra el nombre completo del cliente y la fecha de entrada de su reserva.
select concat_ws(" ", clientes.nombre, clientes.apellido) as "nombre completo", reservas.fecha_entrada 
from reservas join clientes on (clientes.id_cliente = reservas.id_cliente);
-- 5. Muestra el nombre y cargo de los empleados que han gestionado alguna reserva.
select empleados.nombre, empleados.cargo from empleados join reservas 
on (reservas.id_empleado = empleados.id_empleado) group by empleados.nombre, empleados.cargo 
having count(reservas.id_reserva)>0;

-- Nivel Intermedio – INNER JOIN entre tres tablas

-- 6. Muestra el nombre del cliente, el número de habitación y las fechas de entrada y salida de
-- cada reserva.
select clientes.nombre, habitaciones.numero, reservas.fecha_entrada, reservas.fecha_salida from reservas
join clientes on (clientes.id_cliente = reservas.id_cliente) join habitaciones 
on (habitaciones.id_habitacion = reservas.id_habitacion);
-- 7. Muestra el nombre del empleado, el nombre del cliente y el estado de la reserva.
select empleados.nombre, clientes.nombre, reservas.estado from reservas join empleados
on (reservas.id_empleado = empleados.id_empleado) join clientes 
on (clientes.id_cliente = reservas.id_cliente);
-- 8. Muestra el nombre del cliente, el tipo de habitación reservada y el precio por noche.
select clientes.nombre, habitaciones.tipo, habitaciones.precio_noche from reservas join habitaciones
on (reservas.id_empleado = habitaciones.id_habitacion) join clientes 
on (clientes.id_cliente = reservas.id_cliente);
-- 9. Muestra el nombre del empleado, el número de habitación y la duración (en días) de cada
-- reserva.
select empleados.nombre, habitaciones.numero, 
timestampdiff(day, reservas.fecha_entrada, reservas.fecha_salida) as "duracion reserva" from reservas 
join habitaciones on (reservas.id_habitacion = habitaciones.id_habitacion) join empleados 
on (empleados.id_empleado = reservas.id_empleado);
-- 10.Muestra el nombre y apellido de los clientes que tienen reservas gestionadas por el
-- empleado “Laura Martínez”.
select clientes.nombre, clientes.apellido from clientes join reservas 
on (clientes.id_cliente = reservas.id_cliente) join empleados 
on (empleados.id_empleado = reservas.id_empleado) 
where empleados.nombre = "Laura" and empleados.apellido = "Martínez";

-- Nivel Avanzado

-- 11.Muestra el identificador de reserva y los servicios contratados en cada una.
select reservas.id_reserva, servicios.nombre from reservas join servicio_reserva
on (reservas.id_reserva = servicio_reserva.id_reserva) join servicios 
on (servicio_reserva.id_servicio = servicios.id_servicio);
-- 12.Muestra el nombre del cliente y los servicios que ha utilizado en sus reservas.
select clientes.nombre, servicios.nombre from clientes join reservas 
on (clientes.id_cliente = reservas.id_cliente) join servicio_reserva
on (reservas.id_reserva = servicio_reserva.id_reserva) join servicios 
on (servicio_reserva.id_servicio = servicios.id_servicio);
-- 13.Muestra el nombre del servicio y el número total de veces que ha sido contratado.
select servicios.nombre, count(servicio_reserva.cantidad) as "numero veces usado" from servicio_reserva join servicios
on (servicio_reserva.id_servicio = servicios.id_servicio) group by servicios.nombre;
-- 14.Muestra el nombre del cliente y el precio total de los servicios contratados en una de sus
-- reservas.
select clientes.nombre, sum(servicios.precio) as "precio total" from clientes join reservas 
on (clientes.id_cliente = reservas.id_cliente) join servicio_reserva
on (reservas.id_reserva = servicio_reserva.id_reserva) join servicios 
on (servicio_reserva.id_servicio = servicios.id_servicio) group by clientes.nombre;
-- 15.Muestra el nombre del cliente, el número de habitación y el servicio “Spa” si lo ha
-- contratado.
select clientes.nombre, habitaciones.numero, servicios.nombre from clientes join reservas 
on (clientes.id_cliente = reservas.id_cliente) join servicio_reserva
on (reservas.id_reserva = servicio_reserva.id_reserva) join servicios
on (servicio_reserva.id_servicio = servicios.id_servicio) join habitaciones 
on (habitaciones.id_habitacion = reservas.id_habitacion) where servicios.nombre = "Spa";