package org.example;

public class Empleado {

    private String nombre;
    private double salarioBase;

    // CONSTRUCTOR

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    //METODOS PROPIOS

    public double calcularSalario(){
        return salarioBase;
    }

    public void mostrarInfo(){
        IO.println("Nombre empleado: " + nombre +
                   "\nSalario: " + calcularSalario());
    }

    // GETTERS Y SETTERS

    public String getNomrbre() {
        return nombre;
    }

    public void setNomrbre(String nomrbre) {
        this.nombre = nomrbre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
