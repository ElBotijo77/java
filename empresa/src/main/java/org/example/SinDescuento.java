package org.example;

public class SinDescuento implements Descuento {
    @Override
    public float aplicaDescuento(float precio) {
        return precio;
    };
}
