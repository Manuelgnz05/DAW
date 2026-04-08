-- 3. Inventario de productos
-- Una tienda quiere registrar sus productos: nombre, precio, cantidad en stock y fecha de
-- incorporación al inventario.

drop database if exists Tienda;
create database if not exists Tienda;
use Tienda;

create table if not exists Productos(
	ID int primary key not null,
	Nombre varchar(255) not null,
    Precio float not null,
    Cantidad_en_stock int not null, 
    Fecha_de_incorporación date not null,
    primary key (Nombre)
);

INSERT INTO Productos (Nombre, Precio, Cantidad_en_stock, Fecha_de_incorporación) VALUES
('Laptop Pro 15', 1199.99, 25, '2024-01-10 09:30:00'),
('Ratón Inalámbrico', 24.50, 150, '2024-02-15 11:00:00'),
('Monitor 4K 27"', 349.00, 40, '2023-11-20 14:45:00'),
('Teclado Mecánico RGB', 85.95, 60, '2024-03-05 10:15:00'),
('Auriculares Noise Cancelling', 179.90, 35, '2024-01-22 16:20:00'),
('Disco Duro Externo 2TB', 74.25, 100, '2023-12-01 08:00:00'),
('Silla Ergonómica', 210.00, 15, '2024-04-12 13:30:00'),
('Webcam Full HD', 55.49, 80, '2024-02-28 09:00:00'),
('Impresora Láser', 189.99, 12, '2023-10-15 12:00:00'),
('Smartphone Modelo X', 899.00, 30, '2024-05-01 17:10:00');