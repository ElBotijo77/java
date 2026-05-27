package org.example.src;

import java.sql.Connection;

public class TestSupabaseConnection {

    public static void main(String[] args) {

        System.out.println("Probando conexión a Supabase...");

        try (Connection conn = SupabaseConnection.getConnection()) {

            if (conn != null && !conn.isClosed()) {
                System.out.println("✔ Conexión exitosa a Supabase");
            } else {
                System.out.println("❌ No se pudo establecer la conexión");
            }

        } catch (Exception e) {
            System.out.println("❌ Error al conectar:");
            e.printStackTrace();
        }
    }
}