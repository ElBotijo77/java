package org.example;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccesoDirecto {


// Esribe el String s dentro del fichero en la posicion 0
// Con .length()/2 le decimos que el fichero pesa 20 bytes entre 2, por lo que leerá todos los caracteres

    public static void escribir(String fichero)
    {
        try {
            File f = new File(fichero);
            f.delete();
            RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
            String s = "0123456789";
            raf.writeChars(s);              //raf, escribe como caracteres
            raf.seek(0);
            for (int i=0;i<raf.length()/2;i++)
                System.out.print(raf.readChar());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribir2(String fichero)
    {

        try {
            System.out.println("\nLectura2");
            RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
            raf.seek(4*2);          //Siempre poner *2 directamente ya que unicode pesa x2. Esos son los bytes
            raf.writeChars("*");
            raf.writeChars("*");

            raf.seek(0);
            for (int i=0;i<raf.length()/2;i++)
                System.out.print(raf.readChar());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribir3(String fichero)
    {

        try {
            System.out.println("\nLectura3");
            File f = new File(fichero);
            RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
            String s = "ABCDEFG";
            raf.writeChars(s);

            raf.seek(0);
            for (int i=0;i<raf.length()/4;i++)
                System.out.print(raf.readChar());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribeCorreo(String fichero){
        System.out.println("\nEscritura 4");

        try{
            File file = new File("correo.txt");
            RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
            String s = "luis19luis@atlantida.es9.5";
            raf.seek(0);
            raf.writeChars("luis");
            raf.writeInt(19);
            raf.writeChars("luis@atlantida.es");
            raf.writeFloat(9.5F);

            for(int i=0; i<raf.length()/2; i++){
                if(s.matches("\\d")) raf.writeChars(String.valueOf(s.charAt(i*2)));
                if(!s.matches("\\d")) raf.writeInt(Integer.parseInt(String.valueOf(s.charAt(i*2))));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
