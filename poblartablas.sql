
DROP TABLE IF EXISTS detalle_pedido;
DROP TABLE IF EXISTS envios;
DROP TABLE IF EXISTS pedidos;
DROP TABLE IF EXISTS inventario;
DROP TABLE IF EXISTS productos;
DROP TABLE IF EXISTS tiendas;
DROP TABLE IF EXISTS usuarios;


CREATE TABLE usuarios (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    contraseña VARCHAR(100) NOT NULL,
    rol ENUM('ADMIN', 'CLIENTE') NOT NULL
); 

CREATE TABLE productos (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10,2) NOT NULL,
    categoria VARCHAR(50) NOT NULL
); 

CREATE TABLE tiendas (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(200) NOT NULL,
    ciudad VARCHAR(50) NOT NULL
);

CREATE TABLE inventario (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    producto_id BIGINT NOT NULL,
    tienda_id BIGINT NOT NULL,
    stock INT NOT NULL,
    FOREIGN KEY (producto_id) REFERENCES productos(id),
    FOREIGN KEY (tienda_id) REFERENCES tiendas(id)
); 

CREATE TABLE pedidos (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    usuario_id BIGINT NOT NULL,
    fecha_pedido DATETIME DEFAULT CURRENT_TIMESTAMP,
    estado ENUM('PENDIENTE', 'ENVIADO', 'ENTREGADO') DEFAULT 'PENDIENTE',
    total DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
); 



-- Insertar datos de prueba
-- Usuarios
INSERT INTO usuarios (nombre, email, contraseña, rol) VALUES
('Admin EcoMarket', 'admin@ecomarket.cl', 'Admin123', 'ADMIN'),
('Cliente Ejemplo', 'cliente@ecomarket.cl', 'Cliente123', 'CLIENTE');

-- Productos
INSERT INTO productos (nombre, descripcion, precio, categoria) VALUES
('Cepillo Bambú', 'Cepillo dental de bambú ecológico', 1990.00, 'Higiene'),
('Bolsa Tela Orgánica', 'Bolsa de tela reutilizable grande', 5990.00, 'Hogar'),
('Jabón Natural', 'Jabón artesanal libre de químicos', 2990.00, 'Higiene');

-- Tiendas
INSERT INTO tiendas (nombre, direccion, ciudad) VALUES
('Santiago Centro', 'Av. Libertador 100', 'Santiago'),
('Valdivia Eco', 'Calle Los Robles 450', 'Valdivia');

-- Inventario
INSERT INTO inventario (producto_id, tienda_id, stock) VALUES
(1, 1, 50),
(1, 2, 30),
(2, 1, 20),
(3, 2, 15);

-- Pedidos
INSERT INTO pedidos (usuario_id, total, estado) VALUES
(2, 8970.00, 'PENDIENTE'),
(2, 2990.00, 'ENTREGADO');



