package org.example;

import java.io.*;

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

    //Practica, copia eso en un fichero para despues leerlo
    //RandomAcessFile es menos eficiente, va saltando de uno a otro

    String p1 = "1 Carlos 19 9.5";
    String p2 = "2 Illo 18 3.5";

    public void leerDatos(String ruta){
        IO.println("Ejercicio 5");

        try{
            File f = new File(ruta);
            //Borra el contenido para poner el nuevo
            f.delete();
            // Permite crear un acceso directo al fichero, con escritura, lectura, etc
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            //Le decimos que escriba caracteres
            raf.writeChar('\u5330');



        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //Escribir lista compra, alternativa a RandomAccessFile con una mas facil lectura
    //Aprender esta forma para el EXAMEN

    public static void escribirListaCompra(){

        try{

            FileOutputStream fos = new FileOutputStream("lista-compra.bin");
            DataOutputStream dos = new DataOutputStream(fos);

            //Introducimos a mano la lista de la compra
            //Para cadenas variables se debe poner UTF
            dos.writeUTF("pan");
            dos.writeFloat(2.5f);
            dos.writeUTF("leche");
            dos.writeFloat(1.0f);
            dos.writeUTF("pollo");
            dos.writeFloat(5.5f);

            //Cerramos los flujos
            fos.close();
            dos.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //Ahora creamos un metodo para leer un archivo
    public static void leerListaCompra(String fichero){
        IO.println("\n\nLectura lista de la compra");
        try{

            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            //Mientras hayan bytes seguirá leyendo
            while(dis.available() > 0){
                IO.println("Producto: " + dis.readUTF() + ", precio: " + dis.readFloat());
            }

            fis.close();
            dis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    //EJERCICIO PRACTICO

    public static void ejercicio5(){
        try{

            FileOutputStream fos = new FileOutputStream("ejercicio5.bin");
            DataOutputStream dos = new DataOutputStream(fos);

            //Elemento 1
            dos.writeInt(1);
            dos.writeUTF("Illo");
            dos.writeInt(19);
            dos.writeFloat(9.5f);

            //Elemento 2
            dos.writeInt(2);
            dos.writeUTF("Ismail");
            dos.writeInt(18);
            dos.writeFloat(3.5f);

            //Elemento 3
            dos.writeInt(7);
            dos.writeUTF("Aaa");
            dos.writeInt(21);
            dos.writeFloat(6.3f);

            //Elemento 4
            generaUsuarios(4, "Tekno", 432, 10);
            generaUsuarios(4, "Tekno", 4334, 40);

            fos.close();
            dos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void leerEjercicio5(String ruta){
        try {

            FileInputStream fis = new FileInputStream(ruta);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0){
                IO.println(dis.readInt() + " " + dis.readUTF() + " " + dis.readInt() + " " + dis.readFloat());
            }

            fis.close();
            dis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void generaUsuarios(int id, String nombre, int numero, float nota){
        try{

            FileOutputStream fos = new FileOutputStream("ejercicio5.bin", true);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(id);
            dos.writeUTF(nombre);
            dos.writeInt(numero);
            dos.writeFloat(nota);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
