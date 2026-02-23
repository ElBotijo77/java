package org.example;

public class Circulo implements Figura {

    float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String obtenerNombre() {
        return "Circulo";
    }
}
