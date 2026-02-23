package org.presencial;

import java.util.Scanner;

public class Persona {

    private String nombre = "";
    private String apellido = "";
    private String dni = "";
    private int edad = 0;

    public Persona(String dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(){};

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Se llama " + nombre + " con apellido " + apellido + " y edad de " + edad;
    }

    public static String escribeDatos(){
        Scanner sc = new Scanner(System.in);
        IO.println("Introduce un nombre");
        String str = sc.nextLine();
        return str;
    }
}
