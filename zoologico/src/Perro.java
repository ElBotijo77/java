public class Perro extends Animal{

    protected int patas;
    protected String cola;
    protected int numeroRegistro;

    public Perro(int patas, String cola, int numeroRegistro){
        super("Sin nombre", 0, "Desconocido");

    }

    public Perro(String nombre, int edad, String raza, int patas, String cola, int numeroRegistro) {
        super(nombre, edad, raza);
        this.patas = patas;
        this.cola = cola;
        this.numeroRegistro = numeroRegistro;
    }

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad, raza);
    }

    @Override
    public String comunicarse() {
        return "El perro ladra";
    }

    public void olfatear(){
        System.out.println("El perro huele la farola");
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public int getPatas() {
        return patas;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getCola() {
        return cola;
    }
}
