package ejercicioLibro;

import java.util.Scanner;

public class TareaUno {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        int n1 = 0, n2 = 0, suma = 0, resta = 0, producto = 0, potencia = 0;
        double division;

        while(!valid){
            try {
                IO.println("Introduce dos numeros validos no negativos ni con caracteres especiales");

                IO.println("Numero 1: ");
                n1 = sc.nextInt();

                IO.println("Numero 2: ");
                n2 = sc.nextInt();

                valid = true;

            } catch (Exception e) {
                IO.println("No has introducido un numero valido");
            }
        }

        suma = n1 + n2;
        resta = n1 - n2;
        producto = n1 * n2;
        division = n1 / n2;
        potencia = (int) Math.pow(n1, n2);

    }

}
