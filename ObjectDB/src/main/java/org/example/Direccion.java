package org.example;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Direccion implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private long id;
    private String calle;
    private String ciudad;
    private String provincia;

    public Direccion(String calle, String ciudad, String provincia) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }
}