package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main (String[] args){

            Figura [] arr = new Figura[3];

            arr[0] = new Circulo( 5);
            arr[1] = new Rectangulo( 5, 5);
            arr[2] = new Triangulo(5,5);

            for(Figura x: arr){

                System.out.println("Figura seleccionada: " + x.obtenerNombre());
                System.out.println("El area es: " + String.format("%.2f", x.calcularArea()));
            }


        }

}
