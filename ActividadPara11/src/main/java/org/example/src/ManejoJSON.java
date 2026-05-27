package org.example.src;

import org.example.model.Producto;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.Map;

public class ManejoJSON {

    // Record estático para que pueda usarse sin instancia de la clase externa
    public static record Producto(int id, String nombre, String marca, String categoria, int cantidad) {}

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper(); // Una sola instancia, reutilizable

        try {
            //Escritura del archivo JSON
            List<Producto> productos = List.of(
                    new Producto(1, "Auriculares Wave Pro", "SoundMax", "Electrónica", 15),
                    new Producto(2, "Botella Térmica Arctic", "HydroPlus", "Hogar", 30),
                    new Producto(3, "Teclado Mecánico Thunder", "KeyForce", "Informática", 8),
                    new Producto(4, "Zapatillas Runner X", "MoveFit", "Deporte", 20),
                    new Producto(5, "Cafetera Express Mini", "CoffeeLux", "Electrodomésticos", 5),
                    new Producto(6, "Mochila Urban Pack", "TravelGo", "Accesorios", 12),
                    new Producto(7, "Lámpara LED Smart", "BrightHome", "Iluminación", 18),
                    new Producto(8, "Tablet VisionTab 10", "TechNova", "Electrónica", 7),
                    new Producto(9, "Silla Ergonómica Flex", "ComfortSeat", "Muebles", 10),
                    new Producto(10, "Ratón Gaming Nitro", "GameCore", "Informática", 25)
            );

            Map<String, Object> mainObj = Map.of("productos", productos);

            String json = mapper.writeValueAsString(mainObj);
            //System.out.println("JSON generado: " + json);

            //Lectura del archivo JSON
            try {

                // Lectura del JSON
                Map<String, List<Producto>> data = mapper.readValue(
                        json,
                        new com.fasterxml.jackson.core.type.TypeReference<Map<String, List<Producto>>>() {}
                );

                List<Producto> productosLeidos = data.get("productos");

                for (Producto p : productosLeidos) {
                    System.out.println(p);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
