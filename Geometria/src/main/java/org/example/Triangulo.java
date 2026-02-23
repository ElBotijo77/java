package org.example;

public class Triangulo extends Contenedor implements Figura{

    final int MITAD = 2;

    public Triangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return (base * altura) / MITAD;
    }

    @Override
    public String obtenerNombre() {
        return "Triangulo";
    }
}
