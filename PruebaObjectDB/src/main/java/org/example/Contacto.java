package org.example;

import javax.persistence.*;
import java.io.Serializable;

@NamedQuery(name="consultarTodo", query="SELECT c FROM Contacto c")
@Entity
public class Contacto implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private long id;
    private String nombre;
    private Direccion direccion;

    public Contacto() {
    }

    public Contacto(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}