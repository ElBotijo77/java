package ejercicioLibro;

public class ConviertePalotes {

    /* public static String convierteEnPalotes(int n)
     Esta función convierte el número n al sistema de palotes y lo devuelve en una
     cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | |- | | | | | |
     |-- | |- |- | | | en el sistema de palotes. Utiliza esta función en un programa
     para comprobar que funciona bien. Desde la función no se debe mostrar nada
     por pantalla, solo se debe usar print desde el programa principal.*/

    public static void main(String[] args) {

        IO.println(convierteEnPalotes(470213));

    }

    public static String convierteEnPalotes(int n){
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(n);
        int digits = str.length();
        int count = 0;

        for(int i=0; i<digits; i++){
            count = (int) str.charAt(i) -48;
            for(int j=0; j<count; j++){
                sb.append("| ");
            }
            if(i != digits - 1) sb.append("- ");
        }
        return new String(sb);
    }

}
