package org.example;

import javax.persistence.EntityManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String [] args) {
        EntityManager em = CRUD.conectar();

        if (CRUD.insertar(em)) System.out.println("Inserción OK");
        else System.out.println("Inserción KO");

        System.out.println(CRUD.leer(em));
        //System.out.println(CRUD.leer(em));
    }
}
