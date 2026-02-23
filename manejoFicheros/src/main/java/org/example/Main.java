package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

    String str = "Este ejemplo demuestra el uso de FileWriter para escribir la cadena \\\"¡Hola, mundo!\\\" en example.txt. " +
            "La declaración try-with-resources garantiza que FileWriter se cierre automáticamente";

        CreacionFichero cr = new CreacionFichero();
        cr.crea(str);

        Lectura le = new Lectura();

        le.leer("C:/Users/1DAM/IdeaProjects/manejoFicheros/datos.txt");

    }
}
