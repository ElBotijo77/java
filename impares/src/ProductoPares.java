public class ProductoPares {

    /*. Nombre del método: productoElementosPares
    o Descripción: Método que debería devolver el producto de los
    elementos en posiciones pares de un array.
    o Entrada: Un array (por ejemplo, [7, 5, 3, 8, 4]).
    o Salida esperada: 84 (7 * 3 * 4).  */

    public static long productoImpares(int[] arr){
        long l = 1;
        for(int i=0; i<arr.length; i++){
            if (i % 2 == 0) l *= arr[i];
        }
        return l;
    }

}
