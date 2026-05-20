package org.example.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GuardarPedido {
    // 1. Datos de configuración de tu MySQL Workbench
    private static final String URL = "jdbc:mysql://localhost:3306/nombre_tu_base_datos";
    private static final String USER = "root";
    private static final String PASSWORD = "tu_contraseña"; // Pon aquí tu clave de MySQL

    public static void main(String[] args) {
        // Simulación de los datos que has extraído del JSON del comprador
        int idProductoJson = 3;
        int unidadesJson = 5;

        // 2. La consulta SQL con '?' para evitar errores de sintaxis e inyecciones
        String sql = "INSERT INTO pedidos (id_producto, num_unidades) VALUES (?, ?)";

        // 3. Conectar e insertar (Usa try-with-resources para cerrar la conexión automáticamente)
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Reemplazamos los '?' por las variables del JSON
            pstmt.setInt(1, idProductoJson);
            pstmt.setInt(2, unidadesJson);

            // Ejecutamos la orden en la base de datos
            int filasInsertadas = pstmt.executeUpdate();

            if (filasInsertadas > 0) {
                System.out.println("¡Pedido cargado en MySQL con éxito!");
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar o insertar en la base de datos: " + e.getMessage());
        }
    }
}
