package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreacionFichero {

    public void crea(String str){

        File file = new File("datos.txt");
        String cadena = "";

        try {
            if(file.createNewFile()) IO.println("Archivo creado: " + file.getName() );
            else IO.println("El archivo ya existe");

            FileWriter writer = new FileWriter("datos.txt");
            FileReader read = new FileReader("datos.txt");

            writer.write(str);
            writer.append("\ns");
            writer.flush();

            cadena = read.readAllAsString();
            writer.close();

        } catch (IOException e) {
            IO.println("Algo malo ha ocurrido");
            throw new RuntimeException(e);
        }
        IO.println(cadena);
    }
}
