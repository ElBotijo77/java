package ejercicioLibro;

public class EsPrimo {

    //Devuelve verdadero si el número que se pasa como parámetro
    // es primo y falso en caso contrario.

    public static void main(String[] args){

        IO.println(esPrimo(9));
    }

    public static boolean esPrimo(int num){
        if(num<0) return false;
        if(num % 2 == 0 && num != 2) return false;

        int n = (int)Math.sqrt(num);

        for(int i=3; i<=n; i+=2){
            if(num % i == 0 || num == 1) {
                return false;
            }
        }
        return true;
    }
}
