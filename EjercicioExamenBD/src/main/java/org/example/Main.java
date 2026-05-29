package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("1");

        CRUD crud = new CRUD();

        // Inserta los datos
        //crud.insertarLibros();

        // Mostrar todos los datos
        //crud.mostrarTodos();

        //Mostrar solo los libros de españa
        //crud.mostrarLibrosEspaña();


        //crud.actualizarCiudadEditoriales();

        //crud.borrarLibrosAntes2020();

        //crud.mostrarTodos();
        //crud.cerrarConexion();

    }
}
