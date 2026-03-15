package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccesoDirecto {

    static int longitud = 0;
    
    public static void escrituraDirecta(String direccion, String contenido){
        try(RandomAccessFile raf = new RandomAccessFile(direccion, "rw")){
            raf.seek(0);
            raf.writeChars(contenido);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void lecturaDirecta(String direccion){
        try(RandomAccessFile raf = new RandomAccessFile(direccion, "rw")){
            while(raf.getFilePointer() < raf.length()){
                IO.print(raf.readChar());
            }
        }catch (IOException e){
            e.printStackTrace();   
        }
    }
}
