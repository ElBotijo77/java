package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora c;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        c = new Calculadora();
        System.out.println("Configurando para cada test");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        c = null;
        System.out.println("Finalizando para cada test");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Configurando para todo el conjunto de pruebas");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Finalizando para todo el conjunto de pruebas");
    }

    @org.junit.jupiter.api.Test
    public void suma() {
        int obtenido = c.suma(3, 7);
        int esperado =  10;
        assertEquals(esperado, obtenido);
    }

    @org.junit.jupiter.api.Test
    public void resta() {
        int obtenido = c.resta(7, 4);
        int esperado =  3;
        assertEquals(esperado, obtenido);
    }

    @org.junit.jupiter.api.Test
    public void division() {
        int obtenido = c.division(6, 3);
        int esperado =  2;
        assertEquals(esperado, obtenido);
    }

    @org.junit.jupiter.api.Test
    public void divisionPorCero() {
        int obtenido = c.division(6, 0);
        int esperado = -999999;
        assertEquals(esperado, obtenido);
    }

    @org.junit.jupiter.api.Test
    public void multiplicacion() {
        int obtenido = c.multiplicacion(2, 3);
        int esperado = 6;
        assertEquals(esperado, obtenido);
    }

    @org.junit.jupiter.api.Test
    public void esMayor() {
//        boolean obtenido = c.esMayor(4, 2);
//        boolean esperado = true;
//        assertEquals(esperado, obtenido);

        assertTrue(c.esMayor(4, 2));
    }

    @org.junit.jupiter.api.Test
    public void sumaDouble() {
        double obtenido = c.suma(3.0d, 7.0d);
        double esperado =  10.0d;
        assertEquals(esperado, obtenido);
    }

    @org.junit.jupiter.api.Test
    public void sumaTriple() {
        int obtenido = c.suma(3, 7, 3);
        int esperado =  13;
        assertEquals(esperado, obtenido);
    }

    @org.junit.jupiter.api.Test
    public void factorial() {
        int obtenido = c.factorial(4);
        int esperado =  24;
        assertEquals(esperado, obtenido);
    }

    @org.junit.jupiter.api.Test
    public void factorialCero() {
        int obtenido = c.factorial(0);
        int esperado =  1;
        assertEquals(esperado, obtenido);
    }

    @org.junit.jupiter.api.Test
    public void factorialNegativo() {
        int obtenido = c.factorial(-4);
        int esperado =  -999999;
        assertEquals(esperado, obtenido);
    }
}