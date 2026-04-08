-- 6. Clientes y pedidos
-- Una empresa quiere registrar pedidos realizados por clientes.
-- • De los clientes: nombre, apellidos, email, teléfono.
-- • De los pedidos: fecha del pedido, importe total y método de pago.
-- Cada pedido pertenece a un único cliente.

drop database if exists Empresa;
create database if not exists Empresa;
use Empresa;

create table if not exists clientes(
	idCliente int primary key auto_increment,
	Nombre varchar(255) not null,
    Apellidos varchar(255) not null,
    email varchar(55) not null,
    telefono varchar(55) not null
);

create table if not exists pedidos(
	idPedido int primary key auto_increment,
	fecha date not null,
	importe float not null,
    metodo_pago varchar(55) not null,
    cliente int not null,
    foreign key(cliente) references clientes(idCliente)
);

INSERT INTO clientes (Nombre, Apellidos, email, telefono) VALUES
('Alejandro', 'Sanz López', 'a.sanz@email.com', '600123456'),
('Beatriz', 'Gómez Daza', 'b.gomez@email.com', '611987654'),
('Carlos', 'Ruiz Mateo', 'c.ruiz@email.com', '622456789'),
('Diana', 'Vidal Castro', 'd.vidal@email.com', '633321654');

INSERT INTO pedidos (fecha, importe, metodo_pago, cliente) VALUES
('2024-01-10', 45.50, 'Tarjeta de Crédito', 1),
('2024-01-12', 120.00, 'PayPal', 2),
('2024-02-01', 15.99, 'Efectivo', 1),
('2024-02-05', 300.25, 'Transferencia', 3),
('2024-02-15', 55.00, 'Tarjeta de Crédito', 2),
('2024-03-01', 89.90, 'PayPal', 4);
