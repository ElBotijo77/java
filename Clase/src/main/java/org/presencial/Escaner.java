package org.presencial;

import java.util.Scanner;

public class Escaner {
    public static int escanear(int n){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();
        return i;
    }

    public String escanear(String s){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        return str;
    }

    public float escanear(Float f){
        Scanner sc = new Scanner(System.in);
        float str = sc.nextFloat();
        sc.close();
        return str;
    }

    public double escanear(double d){
        Scanner sc = new Scanner(System.in);
        double str = sc.nextDouble();
        sc.close();
        return str;
    }
}
