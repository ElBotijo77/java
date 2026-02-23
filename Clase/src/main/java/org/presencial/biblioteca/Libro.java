package org.presencial.biblioteca;

public class Libro {

    float precio;
    int isbn;
    String titulo;
    String categoria;
    int numeroEjemplares;


    public Libro(float precio, int isbn, String titulo, String categoria, int numeroEjemplares) {
        this.precio = precio;
        this.isbn = isbn;
        this.titulo = titulo;
        this.categoria = categoria;
        this.numeroEjemplares = numeroEjemplares;
    }

    public Libro(int isbn, String titulo){
        this.isbn = isbn;
        this.titulo = titulo;
    }

    public Libro(){}

    //-----------------GETTERS-----------------

    public float getPrecio() {
        return precio;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }






     public String infoLibro(){
        return "Titulo: " + titulo + ", precio: " + precio;
     }







    //-----------------SETTERS-----------------


    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }


    //-----------------SOBRECARGADO-----------------

    @Override
    public String toString() {
        return "Libro{" +
                "precio=" + precio +
                ", isbn=" + isbn +
                ", titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", numeroEjemplares=" + numeroEjemplares +
                '}';
    }
}
