package org.example;

public class DescuentoFijo implements Descuento {
    @Override
    public float aplicaDescuento(float precio) {
        return precio - 15;
    }
}
