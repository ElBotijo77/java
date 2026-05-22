package org.example.src;

import org.example.model.CRUD;

import java.sql.Connection;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        /*Por grupos, desarrollar una aplicación en Java que gestione pedidos de productos.
            Equipo A Vendedor
            El equipo diseña una tabla de productos (a elección del grupo).
            La tabla tiene que tener al menos cuatro campos (id, nombre, descripción, etc). El id será autonumérico. El catálogo de productos tendrá al menos 10 productos.
            El equipo también diseña una tabla de pedidos, que incluya el número de unidades solicitadas de cada producto, y la fecha de entrega.
            El equipo diseña un archivo en formato JSON para recibir pedidos de su catálogo.

            Equipo B Comprador
            El equipo recibe del Vendedor el formato JSON, y realiza un pedido de al menos cinco productos.
            El equipo B envía el archivo JSON con el pedido al Vendedor.

            Equipo A Vendedor
            El equipo recibe del comprador el archivo JSON con el pedido. Procesa el archivo y cara en su tabla de pedidos todos los productos solicitados.
            Se tiene que poder consultar el pedido de cada producto. Para ello se puede diseñar una pantalla en Java o una consulta en MySQL Workbench.
            Lógicamente, los roles de comprador y vendedor se intercambian.*/


        Connection cn = CRUD.conectar();
        if (cn != null) {
            System.out.println("Conectado");

            try (Statement stmt = CRUD.crearStatement(cn)) {
                //Crear
               // INSERTAR UN PRODUCTO
                // if (CRUD.crear(stmt, 11, "Juan", "juan@example.com",
                 //       "Descanso", "2024-05-09"))
                    System.out.println("Inserción OK");
               // else System.out.println("Inserción KO");


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            /*
            System.out.println(CRUD.leer(cn));
            if (CRUD.borrar(cn,"Laura"))
                System.out.println("Borrado OK");
            else System.out.println("Borrado KO");

            */
        }
    }
}

