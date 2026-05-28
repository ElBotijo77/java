package org.example;

import javax.persistence.*;
import javax.persistence.criteria.*;
import javax.persistence.criteria.Root;
import java.util.List;

public class CRUD {

    /**
     * Crear un nuevo Entity Manager
     * @return
     */

    // Crea la BD si no existe. Creara tantas tablas como Entidades tenga
    // Con esto ya se tiene todo listo para consultar
    public static EntityManager conectar() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                "ContactosDB");         // MODIFICAR AQUI CON EL NOMBRE QUE LE HAYAMOS PUESTO EN PERSISTENCE.XML
        EntityManager em = emf.createEntityManager();

        return em;
    }

    public static boolean insertar(EntityManager em) {
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            Direccion d1 = new Direccion("Gran Via", "GR", "GR");
            Direccion d2= new Direccion("Alcalá", "M", "M");
            Contacto c1 = new Contacto("Ana", d1);
            Contacto c2 = new Contacto("Pedro", d2);
            Contacto c3 = new Contacto("Luisa", d1);
            Contacto c4 = new Contacto("Juan", d1);
            Contacto c5 = new Contacto("Carmen", d2);

            em.persist(d1);
            em.persist(d2);
            em.persist(c1);
            em.persist(c2);
            em.persist(c3);
            em.persist(c4);
            em.persist(c5);

            et.commit();

            return true;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            et.rollback();
            return false;
        }

    }

    /**
     * Consulta todas los objetos de la entidad
     * @param em
     * @return
     */
    public static String leer(EntityManager em) {
        String salida = "";
        TypedQuery<Contacto> query
                = em.createQuery("SELECT c FROM Contacto c", Contacto.class);

        List<Contacto> contactos = query.getResultList();

        for (Contacto contacto : contactos) {
            salida = salida + contacto.toString() + "\n";
        }

        return salida;
    }


    public static String leerEstatico(EntityManager em) {
        String salida = "";
        Query query
                = em.createNamedQuery("consultarTodo");

        List<Contacto> contactos = query.getResultList();

        for (Contacto contacto : contactos) {
            salida = salida + contacto.toString() + "\n";
        }

        return salida;
    }

    public static String leerConParametros(EntityManager em) {
        String salida = "";
        TypedQuery<Contacto> query
                = em.createQuery("SELECT c FROM Contacto c WHERE c.direccion=?10", Contacto.class);

        query.setParameter(10, "GR");
        List<Contacto> contactos = query.getResultList();

        for (Contacto contacto : contactos) {
            salida = salida + contacto.toString() + "\n";
        }

        return salida;
    }

    public static String leerConParametrosNombre(EntityManager em) {
        String salida = "";
        TypedQuery<Contacto> query
                = em.createQuery("SELECT c FROM Contacto c WHERE c.direccion=:dir", Contacto.class);

        query.setParameter("dir", "GR");
        List<Contacto> contactos = query.getResultList();

        for (Contacto contacto : contactos) {
            salida = salida + contacto.toString() + "\n";
        }

        return salida;
    }

    /**
     * Buscar un contacto
     * @param em
     * @return
     */
    public static String leerConAPI(EntityManager em) {
        String salida = "";
        Contacto c = em.find(Contacto.class, 1);

        return c.toString();
    }

    /**
     * Leer varios contactos
     * @param em
     * @return
     */
    public static String leerVariosConAPI(EntityManager em) {
        String salida = "";
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Contacto> query =
                    cb.createQuery(Contacto.class);

            Root<Contacto> contactos
                    = query.from(Contacto.class);

            Predicate predicadoDir = cb.equal(contactos.get("direccion"), "GR");

            query.select(contactos).where(predicadoDir);


            List<Contacto> listaContactos = em.createQuery(query).getResultList();

            for (Contacto contacto : listaContactos) {
                salida = salida + contacto.toString() + "\n";
            }

        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

        return salida;
    }

    public static boolean  actualizarAPI(EntityManager em) {
        try {
            Contacto c = em.find(Contacto.class, 5);
            em.getTransaction().begin();
            //c.setDireccion("Z");
            em.getTransaction().commit();
            return true;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean borrarAPI(EntityManager em) {
        try {
            Contacto c = em.find(Contacto.class, 4);
            em.getTransaction().begin();
            em.remove(c);
            em.getTransaction().commit();
            return true;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


}
