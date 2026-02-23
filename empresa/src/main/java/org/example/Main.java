package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] arg){

        // Ejercicio 1
        IO.println("EJERCICIO 1");

        Empleado [] arr = new Empleado[2];

        arr[0] = new Administrativo("Administrador", 1200);
        arr[1] = new Repartidor("Repartidor", 1200, 50);

        for(Empleado x: arr){
            x.mostrarInfo();
        }


        // Ejercicio 2
        IO.println("\n\nEJERCICIO 2");

        List<Descuento> lista = new ArrayList<Descuento>();
        final int precioBase = 100;

        //Desclaramos objetos para poder manejarlos mas facilmente

        DescuentoFijo fijo = new DescuentoFijo();
        DescuentoPorcentaje porcentaje = new DescuentoPorcentaje();
        SinDescuento sinDescuento = new SinDescuento();

        //Anadimos a la coleccion
        lista.add(fijo);
        lista.add(porcentaje);
        lista.add(sinDescuento);

        for(Descuento x: lista){
            IO.println("Precio final: " + x.aplicaDescuento(precioBase) + " euros");
        }

        //Ejemplo de aplicacion de descuentros sobre producto real

        //Establecemos un precio base de 100
        Producto raton = new Producto("Raton", 100);
        IO.println("\n\nPrecio base del raton: " + raton.getPrecio() + " euros");

        //Aplicamos el descuento
        raton.setPrecio(porcentaje.aplicaDescuento(raton.getPrecio()));

        //Compobamos que el precio del producto se ha guardado en esa instancia
        IO.println("Precio raton con 15 euros de descuento: " + raton.getPrecio());

    }
}