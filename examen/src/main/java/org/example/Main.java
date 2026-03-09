package org.example;

import javax.swing.*;
import java.io.*;

public class Main {
    static void main(){

        // Programa que lee por pantalla el nombre de un fichero de texto, escribe 20 líneas y las muestra por pantalla

        String file = JOptionPane.showInputDialog("Di el fichero que quieres leer");
        String contenido = "El mundo de las bases de datos es un pilar fundamental en el desarrollo de software moderno, permitiendo que la información se almacene de forma estructurada y segura. Al trabajar con sistemas relacionales, entender la diferencia entre los comandos DDL y DML es vital para evitar desastres en producción. Como hemos visto, un simple ALTER TABLE puede cambiar la arquitectura de manera irreversible, mientras que un DELETE permite retractarse si se usa dentro de una transacción activa. La integridad referencial, gestionada a través de las claves foráneas, actúa como una red de seguridad que impide que los datos se vuelvan inconsistentes o \"huérfanos\".\n" +
                "\n" +
                "Dominar herramientas como IntelliJ IDEA también marca una diferencia en la productividad diaria, permitiendo gestionar múltiples microservicios en ventanas independientes. No se trata solo de escribir código, sino de entender cómo interactúan las capas de persistencia con la lógica de negocio. Un error común es subestimar el poder de un GROUP BY al intentar equilibrar cargas de trabajo entre empleados, lo que puede llevar a resultados sesgados. La optimización de consultas no solo mejora el rendimiento, sino que garantiza que la experiencia del usuario sea fluida y rápida. Al final del día, un buen desarrollador es aquel que cuida tanto la sintaxis de su SQL como la configuración de su entorno de trabajo.\n";

        /*Escribe y lee un fichero BINARIO
        escribe(file, contenido);
        leerFichero(file);
        */

        //Con esto generamos un TXT
        generaTxt(file, contenido);

    }

    public static void leerFichero(String file){
        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0){
                IO.println(dis.readUTF());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void escribe(String fichero, String contenido){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(generaFichero(fichero));
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF(contenido);

        } catch (Exception e) {
            IO.println("Fichero no encontrado o vacio.");
            throw new RuntimeException(e);
        }
    }

    public static File generaFichero(String fichero){
        try{
            File file = new File(fichero);
            return file;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //Con esto creamos un archivo de texto, el otro generaba un archivo binario

    public static void generaTxt(String file, String contenido){
        try {
            PrintWriter pf = new PrintWriter(file + ".txt");
            BufferedReader bf = new BufferedReader(new FileReader(file + ".txt"));

            pf.println(contenido);
            pf.flush();         //Nos aseguramos de que se escriben los datos antes de leerlo

            String linea;
            String textoCompleto = "";

            while((linea = bf.readLine()) != null){
                IO.println(linea);
                textoCompleto += linea;
            }

            JOptionPane.showMessageDialog(null, contenido, "Contenido", JOptionPane.ERROR_MESSAGE);
            bf.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
