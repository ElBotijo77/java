package org.presencial.biblioteca;

import javax.xml.transform.SourceLocator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//String a = IO.readln("Introudce un numero");
//Gesvision negreros

public class Ahorcado {

    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    char[] palabraArray;
    char[] solution;
    char letter;
    int fallos;
    String palabra = "";


    public static void main(String [] args){
        Ahorcado ah = new Ahorcado();

        ah.run();
    }

    public void run(){

        rellenaArryPalabraDefinitiva();
        muestraPorPantalla();


    }

    public void rellenaArryPalabraDefinitiva(){
        try {
            IO.println("Indica la palabra elejida:");
            palabra = rd.readLine();
        }catch (Exception e){
            IO.println("Ha ocurrido el siguiente error: " + e.getMessage());
        }
        palabraArray = palabra.toCharArray();

        solution = new char[palabra.length()];

        for(int i =0; i<solution.length; i++){
            solution[i] = '_';
        }

        IO.println(solution.length + " sdsd " + Arrays.toString(palabraArray));

        solution = new char[palabra.length()];
    }

    public char letraEleccionUsuario(){
        boolean letterValid = false;

        while (!letterValid){
            try{
                IO.println("Escribe un caracter real. Se reiniciará hasta que des un valor valido");
                letter = rd.readLine().charAt(0);
                letterValid = true;
            }catch (Exception e){
                IO.println("Introduce una puta letra real");
            }
        }
        return letter;
    }

    public void rellenaSolucion(char letter){
        for(int i =0; i<palabraArray.length-1; i++) {
            if (letter == palabraArray[i]) solution[i] = letter;
            else fallos++;
        }
    }

    public void muestraPorPantalla(){
        mostrarDibujoSolo(fallos);

        for(int i=0; i<solution.length-1; i++){
            if(solution[i] != '_') IO.print(" " + solution[i] + " ");
            else IO.print(" _ ");
        }
    }

    public static void mostrarDibujoSolo(int fallos) {

        switch (fallos) {
            case 0:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 1:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |"); // Cabeza
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 2:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |   |"); // Cuerpo
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 3:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|   |"); // Brazo Izquierdo
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 4:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |"); // Brazo Derecho
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 5:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" /    |"); // Pierna Izquierda
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 6:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" / \\  |"); // Pierna Derecha (Derrota)
                System.out.println("      |");
                System.out.println("=========");
                break;
            default:
                // Opcional: Manejar números fuera de rango 0-6
                System.out.println("Número de fallos no válido: " + fallos);
                mostrarDibujoSolo(0); // Mostrar estado inicial por defecto
                break;
        }
    }
}
