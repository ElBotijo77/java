package org.example;

public class DescuentoPorcentaje implements Descuento {
    @Override
    public float aplicaDescuento(float precio) {
        return (float) (precio * 0.85);
    }
}
