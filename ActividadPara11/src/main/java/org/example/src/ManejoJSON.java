package org.example.src;

import java.util.List;
import java.util.Map;

public class ManejoJSON {

    //Para la escritura de un archivo JSON utilizamos el siguiente codigo

    // 1. Defines la estructura en una línea
    public record Employee(String firstName, String lastName) {}

    // 2. Creas la lista y mapeas a JSON con ObjectMapper
    List<Employee> employees = List.of(new Employee("John", "Doe"));
    Map<String, Object> mainObj = Map.of("employees", employees);
/*
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(mainObj);


    // Para la lectura usaremos
    // El JSON de entrada
    String jsonInput = "{\"firstName\":\"John\", \"lastName\":\"Doe\"}";

    ObjectMapper mapper = new ObjectMapper();

    // Jackson lee el string y rellena el Record automáticamente
    Employee emp = mapper.readValue(jsonInput, Employee.class);

    System.out.println(emp.firstName()); // "John"
*/
}
