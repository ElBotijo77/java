package org.example.src;

public class TablesSQL {

/*
CREATE DATABASE IF NOT EXISTS actividad11;

CREATE USER 'admin11'@'localhost' IDENTIFIED BY 'Admin1234';

-- Dar permiso total a la BD de agenda
GRANT ALL ON actividad11.* TO 'admin11'@'localhost';

CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    marca VARCHAR(50) NOT NULL,
    categoria VARCHAR(50),
    cantidad INT DEFAULT 0
);

CREATE TABLE pedidos (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    id_producto INT NOT NULL,
    unidades_pedidas INT NOT NULL,
    fecha_pedido DATETIME,

    CONSTRAINT fk_pedido_producto
    FOREIGN KEY (id_producto)
    REFERENCES productos(id)
);

select * from productos;
SET SQL_SAFE_UPDATES = 0;
DELETE FROM productos;

INSERT INTO productos (id, nombre, marca, categoria, cantidad) VALUES
(1, 'Auriculares Wave Pro', 'SoundMax', 'Electrónica', 15),
(2, 'Botella Térmica Arctic', 'HydroPlus', 'Hogar', 30),
(3, 'Teclado Mecánico Thunder', 'KeyForce', 'Informática', 8),
(4, 'Zapatillas Runner X', 'MoveFit', 'Deporte', 20),
(5, 'Cafetera Express Mini', 'CoffeeLux', 'Electrodomésticos', 5),
(6, 'Mochila Urban Pack', 'TravelGo', 'Accesorios', 12),
(7, 'Lámpara LED Smart', 'BrightHome', 'Iluminación', 18),
(8, 'Tablet VisionTab 10', 'TechNova', 'Electrónica', 7),
(9, 'Silla Ergonómica Flex', 'ComfortSeat', 'Muebles', 10),
(10, 'Ratón Gaming Nitro', 'GameCore', 'Informática', 25);
*/

}
