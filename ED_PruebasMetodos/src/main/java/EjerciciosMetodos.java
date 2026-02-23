public class EjerciciosMetodos {


    public static boolean esImpar(long n) {
        return n % 2 != 0;
    }

    public static int calcularFactorial(int n) {
        if (n < 0) return 0;
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static int multiplicarArray(int[] array) {
        if (array.length == 0) return 0;
        int prod = 1;
        for (int n : array) prod *= n;
        return prod;
    }

    public static int contarApariciones(int[] array, int n) {
        int cont = 0;
        for (int x : array) if (x == n) cont++;
        return cont;
    }

    public static int productoImpares(int[] array) {
        if (array.length == 0) return 0;
        int prod = 1, hayImpar = 0;
        for (int x : array) {
            if (x % 2 != 0) { prod *= x; hayImpar = 1; }
        }
        return hayImpar == 1 ? prod : 0;
    }

    public static int productoNegativos(int[] array) {
        int prod = 1, hayNeg = 0;
        for (int x : array) {
            if (x < 0) { prod *= x; hayNeg = 1; }
        }
        return hayNeg == 1 ? prod : 0;
    }

    public static int productoElementosPares(int[] array) {
        if (array.length == 0) return 0;
        int prod = 1;
        for (int i = 0; i < array.length; i += 2) prod *= array[i];
        return prod;
    }

    public static int contarMayoresQueUmbral(int[] array, int n) {
        int cont = 0;
        for (int x : array) if (x > n) cont++;
        return cont;
    }

    public static int sumaCuadradosPositivos(int[] array) {
        int suma = 0;
        for (int x : array) suma += (x * x);
        return suma;
    }

    public static int calcularRango(int[] array) {
        if (array.length == 0) return 0;
        int max = array[0], min = array[0];
        for (int x : array) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        return max - min;
    }

    public static int sumaHastaNegativo(int[] array) {
        int suma = 0;
        for (int x : array) suma += x;
        return suma;
    }

    public static boolean sonTodosPositivos(int[] array) {
        for (int x : array) if (x < 0) return false;
        return true;
    }

    public static int buscarPrimerPar(int[] array) {
        for (int x : array) if (x % 2 == 0) return x;
        return -1;
    }
}
