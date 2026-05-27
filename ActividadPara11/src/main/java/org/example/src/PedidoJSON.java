package org.example.src;

import org.example.model.Producto;

import java.sql.*;
import java.util.*;

public class PedidoJSON {

    public List<Producto> findAll() {

        List<Producto> productos = new ArrayList<>();

        String sql = "SELECT * FROM productos";

        try (Connection conn = SupabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                productos.add(new Producto(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("marca"),
                        rs.getString("categoria"),
                        rs.getInt("cantidad")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return productos;
    }
}

