public class Ave extends Animal {

    private int patas;
    private int alas;

    public Ave(String nombre, int edad, String raza, int patas, int alas) {
        super(nombre, edad, raza);
        this.patas = patas;
        this.alas = alas;
    }


    @Override
    public String comunicarse() {
        return "El ave pia o grazna";
    }

    public void hacerNido(){
        System.out.println("El pajaro hace un nido");
    }

}
