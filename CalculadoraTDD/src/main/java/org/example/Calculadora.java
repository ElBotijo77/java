package org.example;

public class Calculadora {

    //Creamos una prueba para que falle el test de SUMA

    public int suma(int a, int b) {
        return a + b;
    }

    public double suma(double a, double b) {
        return a + b;
    }

    public int suma(int a, int b, int c) {
        return a + b + c;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        if (b == 0) return -999999;
        return (int) a / b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public int factorial(int n) {
        if (n < 0) return -999999;
        if (n == 0) return 1;

        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public boolean esMayor(int a, int b) {
        return a > b;
    }

}
