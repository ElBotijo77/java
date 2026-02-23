package org.example;

public class Rectangulo extends Contenedor implements Figura {


    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String obtenerNombre() {
        return "Rectangulo";
    }
}
