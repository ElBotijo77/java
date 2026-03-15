package org.example;

import java.util.ArrayList;

public class Main {
    static void main() {

        String fichero = "datosClase.bin";

        //ManejoDatosBinarios.escrituraBinaria(fichero, "Illo Martin", 10, 9.5F);
        //ManejoDatosBinarios.escrituraBinaria(fichero, "Illo Martinez", 8, 7.5F);
        //ManejoDatosBinarios.lecturaBinaria(fichero);

        String contenido = "Falta de Buffer: Estás usando FileWriter directamente. Como comentamos, esto escribe carácter a carácter en el disco. En un examen, añade un BufferedWriter para ganar puntos";

        ManejoDatosTexto.escribirTextoPlano("archivoPlano", contenido);
        ManejoDatosTexto.leeTextoPlano("C:\\Users\\Sk\\.git\\java-clase\\ficheros-binarios\\archivoPlano.txt");


        //EXTRA: CONVERSION BINARIO A PLANO
        //ArrayList<String> st = ManejoDatosTexto.conversorBinario(fichero);
        //ManejoDatosTexto.escribeTextoPlano("copiaTextoPlano");
    }
}
