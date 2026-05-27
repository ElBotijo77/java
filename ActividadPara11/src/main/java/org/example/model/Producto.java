package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String nombre;
    private String marca;
    private String categoria;
    private Integer cantidad;

    public Producto(){};

    public Producto(Integer id, String nombre, String marca, String categoria, Integer cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public Integer getIdProducto() { return id; }
    public void setIdProducto(Integer id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String n) { this.nombre = n; }
    public String getMarca() { return marca; }
    public void setMarca(String m) { this.marca = m; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String c) { this.categoria = c; }
    public Integer getNumUnidades() { return cantidad; }
    public void setNumUnidades(Integer u) { this.cantidad = u; }

    //Modificación del metodo equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producto producto = (Producto) o;

        return java.util.Objects.equals(id, producto.id) &&
                java.util.Objects.equals(cantidad, producto.cantidad) &&
                java.util.Objects.equals(nombre, producto.nombre) &&
                java.util.Objects.equals(marca, producto.marca) &&
                java.util.Objects.equals(categoria, producto.categoria);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, nombre, marca, categoria, cantidad);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", categoria='" + categoria + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}