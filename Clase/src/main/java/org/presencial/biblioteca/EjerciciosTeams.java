package org.presencial.biblioteca;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosTeams {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        EjerciciosTeams object = new EjerciciosTeams();

        IO.println(object.esMayor());
        IO.println(Arrays.toString(object.cincoNumeros()));
        IO.println(object.sumaHastaCancelacion());

    }

    public String esMayor(){


        IO.println("Primer numero");
        int n1 = sc.nextInt();

        IO.println("Segundo numero");
        int n2 = sc.nextInt();

        if(n1 == n2) return "Son iguales";

        return (n1<n2)? "El mayor es n2": "El mayor es n1";
    }

    public int[] cincoNumeros(){
        int[] solution = new int[2];
        int[] number = new int[5];

        for(int i=0; i<5; i++){
            IO.println("ntroduce el numero " + i + ":");
            int n = sc.nextInt();
            number[i] = n;
            solution[0] += n;
        }

        if(solution[0] != 0) solution[1] = (int) Math.floor((float)solution[0] / 5);

        return solution;
    }

    public String sumaHastaCancelacion(){
        int sumaTotal = 0;
        boolean valid = false;

        while (!valid){
            try {
                IO.println("Ejercicio 3: ");
                sumaTotal += sc.nextInt();
            }catch (Exception e){
                valid = true;
            }
        }
        return "Has introducido un numero invalido y por tanto se ha terminado el programa. " +
                "\nSuma total es " + sumaTotal;
    }

}
