package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CRUD {

    private EntityManagerFactory emf;
    private EntityManager em;

    public CRUD() {
        emf = Persistence.createEntityManagerFactory("BibliotecaPU");
        em = emf.createEntityManager();
    }

    // INSERTAR LOS 5 LIBROS
    public void insertarLibros() {

        em.getTransaction().begin();

        em.persist(new Libro("9780135166307", "Effective Java", 2018,
                new Editorial("Addison-Wesley", "Boston", "Estados Unidos")));

        em.persist(new Libro("9781492078005", "Learning Java", 2021,
                new Editorial("O'Reilly Media", "Sebastopol", "Estados Unidos")));

        em.persist(new Libro("9788441540934", "Programación en Java", 2019,
                new Editorial("Anaya Multimedia", "Madrid", "España")));

        em.persist(new Libro("9788426729958", "Java para Todos", 2017,
                new Editorial("Marcombo", "Barcelona", "España")));

        em.persist(new Libro("9788499640884", "Desarrollo de Aplicaciones con Java", 2022,
                new Editorial("Ra-Ma", "Madrid", "España")));

        em.getTransaction().commit();

        System.out.println("Libros insertados correctamente.");
    }

    // MOSTRAR TODOS LOS LIBROS
    public void mostrarTodos() {

        List<Libro> lista = em.createQuery(
                "SELECT l FROM Libro l",
                Libro.class
        ).getResultList();

        System.out.println("\nTODOS LOS LIBROS:");

        for (Libro l : lista) {
            System.out.println(l);
        }
    }

    // MOSTRAR LIBROS DE EDITORIALES ESPAÑOLAS
    public void mostrarLibrosEspaña() {

        List<Libro> lista = em.createQuery(
                        "SELECT l FROM Libro l WHERE l.editorial.pais = :pais",
                        Libro.class
                ).setParameter("pais", "España")
                .getResultList();

        System.out.println("\nLIBROS DE EDITORIALES ESPAÑOLAS:");

        for (Libro l : lista) {
            System.out.println(l);
        }
    }

    // ACTUALIZAR CIUDAD DE EDITORIALES ESPAÑOLAS
    public void actualizarCiudadEditoriales() {

        em.getTransaction().begin();

        List<Libro> libros = em.createQuery(
                        "SELECT l FROM Libro l WHERE l.editorial.pais = :pais",
                        Libro.class
                )
                .setParameter("pais", "España")
                .getResultList();

        for (Libro l : libros) {
            l.getEditorial().setCiudad("Madrid");
        }

        em.getTransaction().commit();

        System.out.println("Editoriales actualizadas: " + libros.size());
    }

    // BORRAR LIBROS ANTERIORES A 2020
    public void borrarLibrosAntes2020() {

        em.getTransaction().begin();

        int eliminados = em.createQuery(
                        "DELETE FROM Libro l WHERE l.anio < :anio"
                )
                .setParameter("anio", 2020)
                .executeUpdate();

        em.getTransaction().commit();

        System.out.println("\nLibros eliminados: " + eliminados);
    }

    // CERRAR CONEXIÓN
    public void cerrarConexion() {
        em.close();
        emf.close();
    }
}