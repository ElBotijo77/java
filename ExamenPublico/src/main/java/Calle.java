import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Stream;

public class Calle {

    private String nombre = "";
    public ArrayList<Obra> list;

    public Calle(){};

    public Calle(String nombre, ArrayList<Obra> list) {
        this.nombre = nombre;
        this.list = list;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Obra> getList() {
        return list;
    }

    public void setList(ArrayList<Obra> list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Calle calle = (Calle) o;
        return Objects.equals(nombre, calle.nombre) && Objects.equals(list, calle.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, list);
    }

    public void mostrarCalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("Las obras son: ");

        for(Obra x: list){
            sb.append(x.getNombre());
            sb.append(", ");
        }
        IO.println(new String(sb));
    }
}
