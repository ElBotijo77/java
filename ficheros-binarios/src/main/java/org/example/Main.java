package org.example;

import java.io.File;
import java.util.ArrayList;

public class Main {
    static void main() {

        String fichero = "datosClase.bin";
        String directo = "accesoDirecto.bin";
        String contenido = "Falta de Buffer: Estás usando FileWriter directamente. Como comentamos, esto escribe carácter a carácter en el disco. En un examen, añade un BufferedWriter para ganar puntos";

        //--------------------BINARIO----------------------------
        //ManejoDatosBinarios.escrituraBinaria(fichero, "Illo Martin", 10, 9.5F);
        //ManejoDatosBinarios.escrituraBinaria(fichero, "Illo Martinez", 8, 7.5F);
        //ManejoDatosBinarios.lecturaBinaria(fichero);


        //---------------------PLANO---------------------------
        //ManejoDatosTexto.escribirTextoPlano("archivoPlano", contenido);
        //ManejoDatosTexto.leeTextoPlano("C:\\Users\\Sk\\.git\\java-clase\\ficheros-binarios\\archivoPlano.txt");


        //----------------------CONVERSION PLANO A BINARIO--------------------------
        //EXTRA: CONVERSION BINARIO A PLANO
        //ArrayList<String> st = ManejoDatosTexto.conversorBinario(fichero);
        //ManejoDatosTexto.escribeTextoPlano("copiaTextoPlano");

        //-----------------------ACCESO DIRECTO-------------------------
        AccesoDirecto.escrituraDirecta(directo, contenido);
        AccesoDirecto.lecturaDirecta(directo);

        File multiplesDatos = new File("multiplesDatos.bin");
        //leerLista.escribeRafTomates(multiplesDatos);
        leerLista.modificaPrecio(multiplesDatos, 2, 0.0F);
        leerLista.leeArchivoDirecto(multiplesDatos);
    }
}
