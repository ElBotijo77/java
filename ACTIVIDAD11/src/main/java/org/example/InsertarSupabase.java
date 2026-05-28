package org.example;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;
import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

public class InsertarSupabase {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("supabasePU");

    // Clase auxiliar (DTO) para que Jackson no choque con JPA
    public static class PedidoInput {
        public int idProducto;
        public int unidades;
    }

    public void procesarPedidoJson(String rutaArchivo) {
        ObjectMapper mapper = new ObjectMapper();
        EntityManager em = emf.createEntityManager();

        try {
            // 1. Leer el archivo JSON de forma segura con Jackson
            List<PedidoInput> items = mapper.readValue(new File(rutaArchivo), new TypeReference<List<PedidoInput>>() {});

            em.getTransaction().begin();

            // 2. Procesar cada ítem del JSON
            for (PedidoInput item : items) {
                // Buscamos si el producto existe en Supabase
                Producto prod = em.find(Producto.class, item.idProducto);

                if (prod != null) {
                    Pedido nuevoPedido = new Pedido(2, LocalDateTime.now(), new Producto());
                    //nuevoPedido.setProducto(prod);
                    //nuevoPedido.setUnidadesPedidas(item.unidades);
                    //nuevoPedido.setFechaPedido(LocalDateTime.now());

                    em.persist(nuevoPedido); // Guarda en Supabase
                } else {
                    System.out.println("Producto con ID " + item.idProducto + " no encontrado. Saltando...");
                }
            }

            em.getTransaction().commit();
            System.out.println("¡Pedido procesado e insertado en Supabase con éxito!");

        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}