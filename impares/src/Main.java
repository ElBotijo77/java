//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //Prueba de todos los ejercicios


    IO.println(esImpar(-23));
    IO.println(multiplicarArray(new int[]{7,3,1,5}));
    IO.println(productoImpares(new int[]{1,2,5,4,3}));
    IO.println(productoImpares(new int[]{7, 5, 3, 8, 4}));
    IO.println(sumaCuadradosPositivos(new int[]{2, -4, 6, -8, 10}));
    IO.println(sumaHastaNegativo(new int[]{3, 8, -2, 4, }));
    IO.println(buscarPrimerPar(new int[]{1, 3, 6, 7, 9}));
    IO.println(buscarPrimerPar(new int[]{1, 3, 5, 7, 9}));

}

//1
public static boolean esImpar(int n){
    boolean solution = false;
    int abs = Math.abs(n);

    if(abs % 2 == 0 || n == 0) return false;
    else return true;
}

//2
static int calcularFactorial(int numero) {
    int resultado = 1;
    while (numero != 0) {
        resultado = resultado * numero;
        numero--;

    }
    return resultado;
}

//3
public static long multiplicarArray(int[] arr){
    long l = 1;
    for (int n : arr) {
        l *= n;
    }
    return l;
}

//4
static int contarApariciones(int[] array, int buscado){
    int contador = 0;
    for (int j : array) {
        if (array[j] == buscado) {
            contador++;
        }
    }

    return contador;

}

//5
public static long productoImpares(int[] arr){
    long l = 1;
    int lentg = arr[arr.length - 1];

    for(int n: arr){
        if(n % 2 != 0) l *= n;
    }
    return l;
}

//6
static int productoNegativos(int[] array){
    int resultado = 1;
    for (int j : array) {
        if (array[j] < 0) {
            resultado = resultado * j;
        }
    }
    return resultado;
}

//7
public int productoElementosPares(int[] numeros) {
    int producto = 1;
    for (int i = 0; i < numeros.length; i += 2) {
        producto *= numeros[i];
    }
    return producto;
}

//8
static int contarMayoresQueUmbral(int[] array, int umbral) {
    int contador =0;
    for(int j : array) {
        if (array[j] > umbral) {
            contador++;
        }
    }
    return contador;

}

//9
public static long sumaCuadradosPositivos(int[] arr){
    long l = 0;
    for(int i=0; i<arr.length; i++){
        if (arr[i] > 0) l += (long) Math.pow(arr[i], 2);
    }
    return l;
}

//10
static int calcularRango(int[] array) {
    int valorMaximo=1;
    int valorMinimo=0;

    for(int j : array) {
        if(array[j] > valorMaximo) {
            valorMaximo = j;
        }
        if(array[j] < valorMinimo) {
            valorMinimo = j;
        }

    }

    return valorMaximo - valorMinimo;
}

//11
public static long sumaHastaNegativo(int[] arr){
    long l = 0;
    for(int i=0; i<arr.length; i++) {
        l += Math.abs(arr[i]);
        if (arr[i] < 0) break;
    }
    return l;
}

//12
static boolean sonTodosPositivos(int[] array){

    for (int j : array) {
        if (array[j] < 0 ) {
            return false;

        }

    }
    return true;
}

//13
public static int buscarPrimerPar(int[] arr) {
    int n= 0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] % 2 == 0) return arr[i];
    }
    return -1;
}