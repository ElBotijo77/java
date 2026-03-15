package org.example;

import java.io.*;
import java.util.ArrayList;


public class ManejoDatosTexto {

    public static void escribirTextoPlano(String archivo, String texto){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivo + ".txt"))){
            for(int i=0; i<5; i++){
                bw.write(texto);
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void leeTextoPlano(String archivo){
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String line = "";
            while ((line = br.readLine()) != null){
                IO.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------


    // Metodo que propone una conversion de texto BINARIO a PLANO a traves de un ARRAYLIST
    public static void escribeTextoPlano(String fichero){
        ArrayList<String> conversion = conversorBinario("C:\\Users\\Sk\\.git\\java-clase\\ficheros-binarios\\datosClase.bin");

        try {
            FileWriter fw = new FileWriter(fichero + ".txt");
            int count = 0;
            for(String x: conversion){
                if(count < 3){
                    fw.write(x + " ");
                    count++;
                } else {
                    fw.write(x + "\n");
                    count = 0;
                }
            }
            
            fw.flush();
            fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Con este metodo convertimos el archivo binario y guardamos los elementos en un Array para
    //manejar el mismo archivo y pasarlo a texto plano
    public static ArrayList<String> conversorBinario(String file){
        ArrayList<String> lista = new ArrayList<String>();

        try(DataInputStream dis = new DataInputStream(new FileInputStream(file))){
            while (true){
                String alumno = dis.readUTF();
                int nota = dis.readInt();
                float notaMedia = dis.readFloat();

                lista.add(alumno);
                lista.add(String.valueOf(nota));
                lista.add(String.valueOf(notaMedia));
            }
        } catch (EOFException e) {
            IO.println("Conversion realizada con exito");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return lista;
    }
}
