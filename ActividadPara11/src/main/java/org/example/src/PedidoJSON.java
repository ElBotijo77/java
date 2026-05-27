package org.example.src;

import org.example.model.Pedido;
import org.example.model.Producto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoJSON {

    private final ObjectMapper mapper;

    public PedidoJSON() {
        this.mapper = new ObjectMapper()
                .registerModule(new JavaTimeModule()); // Necesario para OffsetDateTime
    }

    public List<Pedido> obtenerTodos() throws Exception {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT id_pedido, id_producto, unidades_pedidas, fecha_pedido FROM pedidos";

        try (Connection conn = SupabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                // Construimos JSON por fila y dejamos que Jackson deserialice
                String jsonFila = String.format(
                        "{\"id_pedido\":%d, \"id_producto\":%d, \"unidades_pedidas\":%d, \"fecha_pedido\":\"%s\"}",
                        rs.getInt("id_pedido"),
                        rs.getInt("id_producto"),
                        rs.getInt("unidades_pedidas"),
                        rs.getObject("fecha_pedido")
                );

                pedidos.add(mapper.readValue(jsonFila, Pedido.class));
            }
        }
        return pedidos;
    }
}

