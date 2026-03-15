package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class leerLista {

    private static final int TAMAÑO_REGISTRO = 24;

    public static void leerLista(String fichero)
    {

        try {
            File f = new File(fichero);
            RandomAccessFile raf = new RandomAccessFile(fichero, "r");
            //Leer registros
            //Nombre
            for(int i = 0; i<10;i++)
                System.out.print(raf.readChar());

            System.out.print(": ");

            //Precio
            System.out.println(raf.readFloat());

            //Nombre
            for(int i = 0; i<10;i++)
                System.out.print(raf.readChar());

            System.out.print(": ");

            //Precio
            System.out.println(raf.readFloat());

            //Nombre
            for(int i = 0; i<10;i++)
                System.out.print(raf.readChar());

            System.out.print(": ");

            //Precio
            System.out.println(raf.readFloat());

            raf.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void leerLista(String fichero, int pos)
    {

        try {
            File f = new File(fichero);
            RandomAccessFile raf = new RandomAccessFile(fichero, "r");
            //Saltar a registro
            raf.seek(pos * TAMAÑO_REGISTRO);
            //Leer registros
            //Nombre
            for(int i = 0; i<10;i++)
                System.out.print(raf.readChar());

            System.out.print(": ");

            //Precio
            System.out.println(raf.readFloat());

            raf.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribir(String fichero)
    {

        try {
            File f = new File(fichero);
            f.delete();
            RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
            String s = "0123456789\uD83E\uDDE1";
            raf.writeChars(s);
            raf.seek(0);
            for (int i=0;i<raf.length()/2;i++)
                System.out.print(raf.readChar());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //-------------------Metodos propios-------------------

    static final int TAMANO = 28;

    public static void escribeRafTomates(File file){
        try(RandomAccessFile raf = new RandomAccessFile(file, "rw")){

            //Escribrimos en el archivo
            raf.writeChars(caracteresFijos("Illo1"));
            raf.writeInt(10);
            raf.writeFloat(4.5F);

            //Escribrimos en el archivo
            raf.writeChars(caracteresFijos("Illo2"));
            raf.writeInt(2321);
            raf.writeFloat(34.5F);

            //Escribrimos en el archivo
            raf.writeChars(caracteresFijos("Illo3"));
            raf.writeInt(-34);
            raf.writeFloat(423.523F);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void modificaPrecio(File file, int position, float nuevoPrecio){
        try(RandomAccessFile raf = new RandomAccessFile(file, "rw")){
            raf.seek((position * TAMANO) + 20 + 4);
            raf.writeFloat(nuevoPrecio);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void leeArchivoDirecto(File file){
        try(RandomAccessFile raf = new RandomAccessFile(file, "rw")){
            while(raf.getFilePointer() < raf.length()){
                for (int i=0; i<20/2; i++){
                    IO.print(raf.readChar());           //GUARDAR EN VARIABLE PARA HACER .TRIM()
                }
                IO.println(" Unidades: " + raf.readInt());
                IO.println(" Precio: " + raf.readFloat());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //Devuleve siempre 10 caracteres
    public static String caracteresFijos(String nombre){
        StringBuilder sb = new StringBuilder(nombre);
        sb.setLength(10);
        return new String(sb);
    }
}
