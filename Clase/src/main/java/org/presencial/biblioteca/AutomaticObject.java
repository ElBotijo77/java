package org.presencial.biblioteca;

import org.presencial.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutomaticObject {

    static Scanner sc = new Scanner(System.in);

    public static void main (String[]args){

        int nPersonas = 0;

        List<Persona> empleados = new ArrayList<Persona>();

        IO.println("Cuantas personas quieres añadir?");
        nPersonas = sc.nextInt();

        for(int i=0; i<nPersonas; i++){
            empleados.add(creaPersona());
        }

        for(Persona x: empleados){
            IO.println(x.toString());
        }

        sc.close();
    }

    public static Persona creaPersona(){
        Persona p = new Persona();

        String dni = "";

        IO.println("Introduce el DNI");
        dni = sc.nextLine();

        IO.println("Como te llamas?");
        p.setNombre(sc.nextLine());

        IO.println("Tus apellidos?");
        p.setApellido(sc.nextLine());

        IO.println("Cuantos anos tienes?");
        p.setEdad(sc.nextInt());

        return p;
    }

}
