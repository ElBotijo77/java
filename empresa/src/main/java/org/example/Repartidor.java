package org.example;

public class Repartidor extends Empleado{

    private int entregas;

    public Repartidor(String nombre, double salarioBase, int entregas) {
        super(nombre, salarioBase);
        this.entregas = entregas;
    }

    @Override
    public double calcularSalario(){
        final int comision = 2;
        return getSalarioBase() + (entregas * comision);
    }
}
