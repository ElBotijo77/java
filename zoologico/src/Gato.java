public class Gato extends Animal {

    private int vidas;
    private String color;

    public Gato(String nombre, int edad, String raza, int vidas, String color) {
        super(nombre, edad, raza);
        this.vidas = vidas;
        this.color = color;
    }

    @Override
    public String comunicarse() {
        return "";
    }
}
