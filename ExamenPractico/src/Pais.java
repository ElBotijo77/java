public class Pais {

    private String nombre;
    private int poblacion;
    private float pib;

    public Pais(String nombre, int poblacion, float pib) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pib = pib;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public float getPib() {
        return pib;
    }

}
