import java.util.ArrayList;
import java.util.Objects;

public class Ciudad{

    private String nombre = "";
    public ArrayList<Calle> ciudad;

    public Ciudad(){};

    public Ciudad(String nombre, ArrayList<Calle> ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Calle> getCiudad() {
        return ciudad;
    }

    public void setCiudad(ArrayList<Calle> ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ciudad ciudad1 = (Ciudad) o;
        return Objects.equals(nombre, ciudad1.nombre) && Objects.equals(ciudad, ciudad1.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ciudad);
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", ciudad=" + ciudad +
                '}';
    }

    public void mostrarCiudad(){
        IO.println(ciudad.toString());

    }

}
