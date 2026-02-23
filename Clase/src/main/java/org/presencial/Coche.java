package org.presencial;

import java.util.Scanner;

public class Coche {

    String matricula;
    String marca;
    String modelo;
    String color;
    double velocidad;

    public Coche(String matricula, String marca, double velocidad, String color, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.velocidad = velocidad;
        this.color = color;
        this.modelo = modelo;
    }

    //-----------------SETTERS-------------------

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }


    public void setFrenar(int n){
        if((velocidad - n) <= 0) velocidad = 0;
    }

    public void setAcelerar(){
        velocidad += 10;
    }

    //---------------GETTERS-----------------

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setAcelerar(int n){
        velocidad += n;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
