package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //AccesoDirecto.escribir("plueba.bin");
        AccesoDirecto.escribir2("plueba.bin");
        AccesoDirecto.escribir3("plueba.bin");
        AccesoDirecto.escribir3("plueba.bin");

        //Probamos la alternativa
        AccesoDirecto.escribirListaCompra();
        AccesoDirecto.leerListaCompra("C:\\Users\\1DAM\\proyectoGit\\java\\acceso_ficheros\\lista-compra.bin");

        IO.println("\n\nEjercicio practico");

        AccesoDirecto.ejercicio5();
        AccesoDirecto.leerEjercicio5("C:\\Users\\1DAM\\proyectoGit\\java\\acceso_ficheros\\ejercicio5.bin");
    }
}
