package org.example.src;

import org.example.model.CRUD;
import org.example.model.Pedido;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

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
        System.out.println("AAAAAAAAAAAAAAAAAA");

        //TestSupabaseConnection.testConexion();

        try {
            PedidoJSON repo = new PedidoJSON();
            List<Pedido> pedidos = repo.obtenerTodos();
            System.out.println("AAAAAAAAAAAAAAAAAA");
            pedidos.forEach(p ->
                    System.out.println("Pedido #" + p.getIdPedido() +
                            " | Producto: " + p.getProducto() +
                            " | Unidades: " + p.getUnidadesPedidas() +
                            " | Fecha: " + p.getFechaPedido())
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

