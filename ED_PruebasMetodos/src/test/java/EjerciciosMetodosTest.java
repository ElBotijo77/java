import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EjerciciosMetodosTest {

    @Test
    void esImpar_casosVarios() {
        assertTrue(EjerciciosMetodos.esImpar(1));
        assertFalse(EjerciciosMetodos.esImpar(2));
        assertFalse(EjerciciosMetodos.esImpar(0));
        assertTrue(EjerciciosMetodos.esImpar(-1));
        assertFalse(EjerciciosMetodos.esImpar(-2));
    }

    @Test
    void calcularFactorial_casosVarios() {
        assertEquals(0, EjerciciosMetodos.calcularFactorial(1)); //Prueba de error 1
        assertEquals(2, EjerciciosMetodos.calcularFactorial(2));
        assertEquals(1, EjerciciosMetodos.calcularFactorial(0));
        assertEquals(0, EjerciciosMetodos.calcularFactorial(-1));
        assertEquals(0, EjerciciosMetodos.calcularFactorial(-2));
    }

    @Test
    void multiplicarArray_casosVarios() {
        assertEquals(0, EjerciciosMetodos.multiplicarArray(new int[]{}));
        assertEquals(80, EjerciciosMetodos.multiplicarArray(new int[]{1, 2, 5, 8}));
        assertEquals(0, EjerciciosMetodos.multiplicarArray(new int[]{0, 2, 5, 8}));
        assertEquals(-100, EjerciciosMetodos.multiplicarArray(new int[]{1, 2, 5, -10}));
    }

    @Test
    void contarApariciones_casosVarios() {
        assertEquals(0, EjerciciosMetodos.contarApariciones(new int[]{}, 5));
        assertEquals(0, EjerciciosMetodos.contarApariciones(new int[]{10, 5, 4, 8}, 11));
        assertEquals(1, EjerciciosMetodos.contarApariciones(new int[]{10, 5, 4, 8}, 10));
        assertEquals(1, EjerciciosMetodos.contarApariciones(new int[]{10, 5, -4, 8}, -4));
    }

    @Test
    void productoImpares_casosVarios() {
        assertEquals(-55, EjerciciosMetodos.productoImpares(new int[]{10, -5, 4, 8, 11}));
        assertEquals(0, EjerciciosMetodos.productoImpares(new int[]{}));
        assertEquals(0, EjerciciosMetodos.productoImpares(new int[]{10, 4, 8}));
    }

    @Test
    void productoNegativos_casosVarios() {
        assertEquals(0, EjerciciosMetodos.productoNegativos(new int[]{10, 5, 4, 8}));
        assertEquals(0, EjerciciosMetodos.productoNegativos(new int[]{}));
        assertEquals(40, EjerciciosMetodos.productoNegativos(new int[]{10, -5, 4, -8}));
        assertEquals(0, EjerciciosMetodos.productoNegativos(new int[]{10, -5, 4, -8, 0})); //Prueba de error 2
    }

    @Test
    void productoElementosPares_casosVarios() {
        assertEquals(40, EjerciciosMetodos.productoElementosPares(new int[]{10, -5, 4, -8}));
        assertEquals(0, EjerciciosMetodos.productoElementosPares(new int[]{0, -5, 4, -8}));
        assertEquals(-40, EjerciciosMetodos.productoElementosPares(new int[]{10, -5, -4, -8}));
    }

    @Test
    void contarMayoresQueUmbral_casosVarios() {
        assertEquals(4, EjerciciosMetodos.contarMayoresQueUmbral(new int[]{10, 5, 4, 8}, 0));
        assertEquals(0, EjerciciosMetodos.contarMayoresQueUmbral(new int[]{}, 10));
        assertEquals(0, EjerciciosMetodos.contarMayoresQueUmbral(new int[]{10, 5, 4, 8}, 11));
        assertEquals(4, EjerciciosMetodos.contarMayoresQueUmbral(new int[]{10, 5, 4, 8}, -10));
    }

    @Test
    void sumaCuadradosPositivos_casosVarios() {
        assertEquals(0, EjerciciosMetodos.sumaCuadradosPositivos(new int[]{}));
        assertEquals(205, EjerciciosMetodos.sumaCuadradosPositivos(new int[]{10, 5, 4, 8}));
        assertEquals(205, EjerciciosMetodos.sumaCuadradosPositivos(new int[]{-10, 5, 4, -8}));
    }

    @Test
    void calcularRango_casosVarios() {
        assertEquals(6, EjerciciosMetodos.calcularRango(new int[]{10, 5, 4, 8}));
        assertEquals(0, EjerciciosMetodos.calcularRango(new int[]{0, 0}));
        assertEquals(18, EjerciciosMetodos.calcularRango(new int[]{-10, 5, 4, 8}));
    }

    @Test
    void sumaHastaNegativo_casosVarios() {
        assertEquals(27, EjerciciosMetodos.sumaHastaNegativo(new int[]{10, 5, 4, 8}));
        assertEquals(7, EjerciciosMetodos.sumaHastaNegativo(new int[]{-10, 5, 4, 8}));
        assertEquals(11, EjerciciosMetodos.sumaHastaNegativo(new int[]{10, 5, 4, -8}));
    }

    @Test
    void sonTodosPositivos_casosVarios() {
        assertTrue(EjerciciosMetodos.sonTodosPositivos(new int[]{10, 5, 4, 8}));
        assertFalse(EjerciciosMetodos.sonTodosPositivos(new int[]{10, -5, 4, 8}));
    }

    @Test
    void buscarPrimerPar_casosVarios() {
        assertEquals(10, EjerciciosMetodos.buscarPrimerPar(new int[]{10, 5, 4, 8}));
        assertEquals(-10, EjerciciosMetodos.buscarPrimerPar(new int[]{-10, 5, 4, 8}));
    }
}