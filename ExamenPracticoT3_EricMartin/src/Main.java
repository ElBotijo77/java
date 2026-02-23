import java.util.Scanner;

public class Main {

    /*Para evitar sorpresas por culpla del usuario envolvemos en un try catch poniendo de base no multiplicar
     * por cero ni por numeros negativos. La tabla se mostrara por pantalla a traves de un metodo*/

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int eleccionUsuario = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println("Introduce el numero para ver su tabla de multiplicar. Tiene que ser un entero positivo");
                eleccionUsuario = sc.nextInt();
                if (eleccionUsuario <= 0) throw new Exception("No puede ser un numero negativo o cero");
                valid = true;
            } catch (Exception e) {
                System.out.println("Has introducido un numero invalido. Se reiniciara el programa");
                sc.next();
            }
        }

        /*LLamamos al método y le pasamos por parametro la eleccion del usuario. Si queremos introducir
        otro numero simplemente se lo pasamos por parametro, por ejemplo un 0*/

        muestraTabla(eleccionUsuario);
        muestraTabla(0);

        sc.close();
    }

    public static void muestraTabla(int n) {
        for (int i = 0; i <= 10; i++) {
            IO.println(i + " x " + n + " = " + i * n);
        }
        System.out.println(" ");
    }
}