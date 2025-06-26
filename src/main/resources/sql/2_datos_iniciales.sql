INSERT INTO persona (nombre, apellido, dni, correo) VALUES
('Juan', 'Martínez', '0102030405', 'juan@mail.com'),
('Laura', 'Pérez', '0607080910', 'laura@mail.com');

INSERT INTO usuario (username, clave, id_persona) VALUES
('juanma', '1234', 1),
('laurap', '5678', 2);

INSERT INTO rol (nombre) VALUES
('ADMIN'),
('USUARIO');

INSERT INTO tipo_pago (tipo, descripcion) VALUES
('Efectivo', 'Pago en efectivo'),
('Tarjeta', 'Pago con tarjeta de crédito/débito');

INSERT INTO clasificacion (grupo) VALUES
('Tecnología'),
('Papelería');

INSERT INTO proveedor (ruc, nombre, telefono, pais, correo, moneda) VALUES
('1790012345001', 'TechSupplier', '0999999999', 'Ecuador', 'contacto@tech.com', 'USD'),
('1790012345002', 'OfficePro', '0888888888', 'Ecuador', 'ventas@office.com', 'USD');

INSERT INTO producto (nombre, stock, precio, id_clasificacion, id_proveedor) VALUES
('Laptop Lenovo', 10, 850.00, 1, 1),
('Resma de papel', 50, 5.50, 2, 2);

INSERT INTO factura (ruc, fecha, descuento, total, id_persona, id_tipo_pago) VALUES
('0999999999001', NOW(), 10.00, 840.00, 1, 1),
('0999999999002', NOW(), 0.00, 11.00, 2, 2);

INSERT INTO item_factura (cantidad, precio_unitario, subtotal, id_producto, id_factura) VALUES
(1, 850.00, 850.00, 1, 1),
(2, 5.50, 11.00, 2, 2);
