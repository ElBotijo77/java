package org.example.src;

// Clase secundaria: representa cada objeto dentro del array del JSON
class LineaProducto {
    private int idProducto;
    private int numUnidades;

    public LineaProducto(int idProducto, int numUnidades) {
        this.idProducto = idProducto;
        this.numUnidades = numUnidades;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public static class RecepcionPedido {
    }
}
