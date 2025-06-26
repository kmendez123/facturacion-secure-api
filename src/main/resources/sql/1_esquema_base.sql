CREATE TABLE IF NOT EXISTS persona (
    id_persona BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre     VARCHAR(60) NOT NULL,
    apellido   VARCHAR(60) NOT NULL,
    dni        VARCHAR(10) UNIQUE NOT NULL,
    correo     VARCHAR(120) NOT NULL
);

CREATE TABLE IF NOT EXISTS usuario (
    id_usuario BIGINT AUTO_INCREMENT PRIMARY KEY,
    username   VARCHAR(60) NOT NULL UNIQUE,
    clave      VARCHAR(60) NOT NULL,
    id_persona BIGINT NOT NULL,
    FOREIGN KEY (id_persona) REFERENCES persona(id_persona)
);

CREATE TABLE IF NOT EXISTS rol (
    id_rol BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(60) NOT NULL
);

CREATE TABLE IF NOT EXISTS tipo_pago (
    id_tipo_pago BIGINT AUTO_INCREMENT PRIMARY KEY,
    tipo         VARCHAR(60) NOT NULL,
    descripcion  VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS factura (
    id_factura    BIGINT AUTO_INCREMENT PRIMARY KEY,
    ruc           VARCHAR(15) NOT NULL,
    fecha         DATETIME NOT NULL,
    descuento     DECIMAL(10,2) NOT NULL,
    total         DECIMAL(10,2) NOT NULL,
    id_persona    BIGINT NOT NULL,
    id_tipo_pago  BIGINT NOT NULL,
    FOREIGN KEY (id_persona) REFERENCES persona(id_persona),
    FOREIGN KEY (id_tipo_pago) REFERENCES tipo_pago(id_tipo_pago)
);

CREATE TABLE IF NOT EXISTS clasificacion (
    id_clasificacion BIGINT AUTO_INCREMENT PRIMARY KEY,
    grupo            VARCHAR(60) NOT NULL
);

CREATE TABLE IF NOT EXISTS proveedor (
    id_proveedor BIGINT AUTO_INCREMENT PRIMARY KEY,
    ruc          VARCHAR(15) UNIQUE NOT NULL,
    nombre       VARCHAR(60) NOT NULL,
    telefono     VARCHAR(10) NOT NULL,
    pais         VARCHAR(60) NOT NULL,
    correo       VARCHAR(120) NOT NULL,
    moneda       VARCHAR(60) NOT NULL
);

CREATE TABLE IF NOT EXISTS producto (
    id_producto       BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre            VARCHAR(60) NOT NULL,
    stock             INT NOT NULL,
    precio            DECIMAL(10,2) NOT NULL,
    id_clasificacion  BIGINT NOT NULL,
    id_proveedor      BIGINT NOT NULL,
    FOREIGN KEY (id_clasificacion) REFERENCES clasificacion(id_clasificacion),
    FOREIGN KEY (id_proveedor) REFERENCES proveedor(id_proveedor)
);

CREATE TABLE IF NOT EXISTS item_factura (
    id_item         BIGINT AUTO_INCREMENT PRIMARY KEY,
    cantidad        INT NOT NULL,
    precio_unitario DECIMAL(10,2) NOT NULL,
    subtotal        DECIMAL(10,2) NOT NULL,
    id_producto     BIGINT NOT NULL,
    id_factura      BIGINT NOT NULL,
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto),
    FOREIGN KEY (id_factura) REFERENCES factura(id_factura)
);
