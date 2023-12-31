#  CREATE DATABASE tp2;
USE tp2;
SHOW DATABASES;

CREATE TABLE CLIENTES (
	ID_CLIENTES INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    NOMBRE VARCHAR(25) NOT NULL,
    APELLIDO VARCHAR(20) NOT NULL,
    TELEFONO INT(15) UNSIGNED,
    DNI INT(10) UNSIGNED NOT NULL,
    DOMICILIO VARCHAR(30) NOT NULL,
    CCOD INT(2) UNSIGNED DEFAULT 0
    );
# DROP TABLE CLIENTES;

CREATE TABLE BICICLETAS(
	ID_BICICLETAS INT UNSIGNED NOT NULL PRIMARY KEY,
    MARCA VARCHAR(15) NOT NULL,
    MODELO INT (6) UNSIGNED NOT NULL,
    COLOR VARCHAR(12) NOT NULL,
    A_FABRIC DATE,
    BCOD INT (2) UNSIGNED NOT NULL
	);
# DROP TABLE BICICLETAS;
    
CREATE TABLE TIPO_DE_BICI(
    TCOD INT (2) UNSIGNED NOT NULL PRIMARY KEY,
	TIPO VARCHAR(12) NOT NULL
	);
# DROP TABLE TIPO_DE_BICI;
    
DESCRIBE CLIENTES;
DESCRIBE BICICLETAS;
DESCRIBE TIPO_DE_BICI;

INSERT INTO CLIENTES  
VALUES (1, 'JUAN', 'PEREZ', '45212356', '3518754122', 'BELGRANO-618', 1),
	(2, 'JOSE', 'LOPEZ', '12345687', '3517896541', 'RIVADAVIA-1015', 2),
	(3, 'CARLOS', 'RODRIGUEZ', '45612387', '3519877896', 'CERRITO-12', 3),
	(4, 'JORGE', 'PAEZ', '65441278', '3529637534', 'HORNEROS-214', 2),
	(5, 'ROSARIO', 'ASTIZ', '51948235', '3584897561', 'BARILOCHE-174',3),
	(6, 'MELISA', 'BENITEZ', '41155845', '351862591', 'YRIGOYEN-14', 1);
SELECT * FROM CLIENTES;

INSERT INTO BICICLETAS
VALUES (1, 'TREK', '2012', 'ROJO', '2012-01-01', 1),
	(2, 'SCOTT', '2013', 'AZUL', '2013-01-01', 2),
	(3, 'GIANT', '2020', 'ROJO', '2020-01-01', 3),
    (4, 'BMC', '2018', 'NEGRO', NULL, 2),
    (5, 'SCOTT', '2017', 'AMARILLO', NULL, 2),
    (6, 'TREK', '2014', 'VERDE', NULL, 3);
SELECT * FROM BICICLETAS;

INSERT INTO TIPO_DE_BICI
	VALUES	(0, 'NO POSEE BICICLETA'),
			(1, 'PASEO'),
			(2, 'MONTAÑA'),
			(3, 'CARRERA');
SELECT * FROM TIPO_DE_BICI;

SELECT *
FROM CLIENTES 
INNER JOIN BICICLETAS ON CLIENTES.CCOD = BICICLETAS.BCOD
LEFT JOIN TIPO_DE_BICI ON BICICLETAS.BCOD = TIPO_DE_BICI.TCOD 
ORDER BY CLIENTES.ID_CLIENTES;


# ESTEBAN BERGERO - TP2 - MySQL