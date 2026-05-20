package org.example.src;

import java.util.ArrayList;
import java.util.List;

// Clase principal que representa el pedido completo
public class PedidoJSON {
    private String fechaEntrega;
    private List<LineaProducto> productos;

    // Constructor
    public PedidoJSON(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
        this.productos = new ArrayList<>();
    }

    // Método para añadir productos al pedido
    public void agregarProducto(int id, int unidades) {
        this.productos.add(new LineaProducto(id, unidades));
    }

    // Getters (necesarios para leer los datos antes de meterlos en MySQL)
    public String getFechaEntrega() { return fechaEntrega; }
    public List<LineaProducto> getProductos() { return productos; }
}

