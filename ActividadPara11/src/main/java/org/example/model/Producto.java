package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;
    private String marca;
    private String categoria;

    @Column(name = "num_unidades")
    private Integer numUnidades;

    public Producto(Integer idProducto, String nombre, String marca, String categoria, Integer numUnidades) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.numUnidades = numUnidades;
    }

    // Getters y Setters
    public Integer getIdProducto() { return idProducto; }
    public void setIdProducto(Integer id) { this.idProducto = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String n) { this.nombre = n; }
    public String getMarca() { return marca; }
    public void setMarca(String m) { this.marca = m; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String c) { this.categoria = c; }
    public Integer getNumUnidades() { return numUnidades; }
    public void setNumUnidades(Integer u) { this.numUnidades = u; }
}