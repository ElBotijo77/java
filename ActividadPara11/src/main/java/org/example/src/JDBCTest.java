package org.example.src;

import org.example.model.CRUD;
import org.example.model.Producto;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JDBCTest {

    @Test
    void insertar() {
        //Given

        // Establecemos la conexion
        Connection cn = CRUD.conectar();
        Statement stmt = CRUD.crearStatement(cn);

        boolean resultadoInsertar = false;

        //When
        if (stmt!=null) {
            resultadoInsertar = CRUD.insertar(stmt, 1, "nuevo", "AA", "dsd", 200);
        }

        //Then
        assertTrue(resultadoInsertar);

        //Producto resultado = CRUD.leer(CRUD.conectar());
        //Metemos a mano las caracteristicas del producto para comprobar que es igual al introducido
        assertEquals(new Producto( 1, "nuevo", "AA", "dsd", 200), CRUD.leer(cn, 1));

        System.out.println(new Producto( 1, "nuevo", "AA", "dsd", 200));
        System.out.println(CRUD.leer(cn, 1).toString());

        // A continuacion se muestra el codigo necesario en SQL

        /*
        *CREATE DATABASE IF NOT EXISTS actividad11;

        CREATE USER 'admin11'@'localhost' IDENTIFIED BY 'Admin1234';

        -- Dar permiso total a la BD de agenda
        GRANT ALL ON actividad11.* TO 'admin11'@'localhost';

        CREATE TABLE productos (
            id INT AUTO_INCREMENT PRIMARY KEY,
            nombre VARCHAR(100) NOT NULL,
            codigo VARCHAR(20) NOT NULL,
            categoria VARCHAR(50),
            cantidad INT DEFAULT 0
        );
        *
        * */

    }
}