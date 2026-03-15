package org.example;

import java.io.*;

public class ManejoDatosBinarios {
    
    public static void escrituraBinaria(String nombreFichero, String contenido, int nota, float notaMedia){

        try {
            FileOutputStream fos = new FileOutputStream(nombreFichero, true);
            DataOutputStream dos = new DataOutputStream(fos);
            
            dos.writeUTF(contenido);
            dos.writeInt(nota);
            dos.writeFloat(notaMedia);
            
            dos.flush();
            dos.close();
            
        } catch (Exception e) {
            IO.println("Algo ha salido mal. Codigo error: ");
            e.printStackTrace();
        }

    }

    public static void lecturaBinaria(String fichero){
        // Hacemos un try-whith-resources para que cierre el flujo inmediatamente
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fichero))){
            while(true){
                IO.println("Bytes displonibles: " + dis.available());
                String alumno = dis.readUTF();
                int nota = dis.readInt();
                float notaMedia = dis.readFloat();

                System.out.println(alumno + ": " + nota + ", nota media " + notaMedia);
            }
        } catch (EOFException e) {
            IO.println("Fin del fichero");
        } catch (Exception e) {
            IO.println("Algo ha salido mal. Codigo error: ");
            e.printStackTrace();
        }
    }
}
