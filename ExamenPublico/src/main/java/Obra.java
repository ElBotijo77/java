import java.util.Objects;

public class Obra {

    private String codigo = "";
    private String nombre = "";
    private double costo = 0;
    private boolean finalizada = false;

    public Obra(){};

    public Obra(String codigo, String nombre, double costo, boolean finalizada) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
        this.finalizada = finalizada;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Obra obra = (Obra) o;
        return Double.compare(costo, obra.costo) == 0 && finalizada == obra.finalizada && Objects.equals(codigo, obra.codigo) && Objects.equals(nombre, obra.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, costo, finalizada);
    }

    @Override
    public String toString() {
        return "Obra{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costo=" + costo +
                ", finalizada=" + finalizada +
                '}';
    }

    public String mostrarDatos(){
        return String.format("Obra{codigo='%s', nombre='%s', costo=%f, finalizada=%b}", codigo, nombre, costo, finalizada);
    }
}
