package org.example.model;

import java.sql.*;

public class CRUD {
    /**
     * Retorna una conexión
     * @return
     */
    static public Connection conectar() {
        try {
            String url = "jdbc:mysql://localhost:3306/actividad11";
            Connection cn = DriverManager.getConnection(url,
                    "admin11", "Admin1234");
            return cn;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Retorna un nuevo Statement
     * @param cn
     * @return
     */
    static public Statement crearStatement(Connection cn) {

        try {
            Statement stmt = cn.createStatement();

            return stmt;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    static public boolean insertar(Statement stmt, int id, String nombre,
                                String codigo, String categoria, int cantidad)
    {
        try {
            String sql = "INSERT INTO actividad11.productos(id, nombre, codigo, " +
                    "categoria, cantidad)" +
                    " VALUES ('" + id + "'," +
                    " '" + nombre + "'," +
                    " '" + codigo + "'," +
                    " '" + categoria + "'," +
                    " '" + cantidad + "');";
            System.out.println(sql);


            int filasInsertadas = stmt.executeUpdate(sql);
            System.out.println("Filas insertadas: " + filasInsertadas);
            return filasInsertadas > 0;
        } catch (Exception e) {
            System.out.println("Error!!!!: " + e.getMessage());
            return false;
        }
    }

    /**
     * Lee filas
     * @param cn
     * @return
     */
    static public String leer(Connection cn) {
        String salida = "";

        String sql = "SELECT * FROM mensajes where nombre='Sandia'";
        try(PreparedStatement pstmt = cn.prepareStatement(sql)) {
            ResultSet resultado = pstmt.executeQuery();

            while (resultado.next()) {
                salida = salida + resultado.getInt("id")
                        + "   " + resultado.getString("nombre")
                        + "   " + resultado.getString("mensaje")
                        + "   " + resultado.getDate("fecha").toString()
                        + "\n";
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return salida;
    }

    /**
     * Eliminar los mensajes por nombre
     * @param cn
     * @return
     */
    static public boolean borrar(Connection cn, String nombre) {
        String sql = "DELETE FROM mensajes where nombre=?";
        try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            int filasBorradas = pstmt.executeUpdate();
            return filasBorradas > 0;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}

