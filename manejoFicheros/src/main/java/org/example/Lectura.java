package org.example;

import java.io.*;
import java.util.Scanner;

public class Lectura {

    StringBuilder str = new StringBuilder();

    public void leer(String ruta) {
        Scanner sc;
        StringBuilder str = new StringBuilder();
        int contador = 0 ;

        try{
            FileReader fr = new FileReader(ruta);
            sc = new Scanner(fr);

            while (sc.hasNext()){
                str.append(sc.nextLine());
                contador++;
            }

            IO.println(new String(str) + " contaor: " + contador);
            sc.close();
            str.delete(0, str.length());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public int cuentaLineas(String ruta){
        int solution = 0;

        try{
            BufferedReader rb = new BufferedReader(new FileReader(ruta));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return solution;
    }
}
