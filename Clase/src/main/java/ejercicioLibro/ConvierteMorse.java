package ejercicioLibro;

import java.util.HashMap;
import java.util.Map;

public class ConvierteMorse {


    /*Esta función convierte el número n al sistema Morse y lo devuelve en una
     cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
     Morse. Utiliza esta función en un programa para comprobar que funciona bien.
     Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
     desde el programa principal.
     1 . _ _ _ _
     2 . . _ _ _
     3 . . . _ _
     4 . . . . _
     5 . . . . .
     6 _ . . . .
     7 _ _ . . .
     8 _ _ _ . .
     9 _ _ _ _ .
     0 _ _ _ _ _*/


    public static void main(String[] args){
        IO.println(convierteEnMorse(213));
    }

    public static String convierteEnMorse(int n){
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(Math.abs(n));

        Map<Integer, String> numerosMorse = Map.of(
                1, ".____",
                2, "..___",
                3, "...__",
                4, "...._",
                5, ".....",
                6, "_....",
                7, "__...",
                8, "___..",
                9, "____.",
                0, "_____"
        );

        for(int i=0; i<str.length(); i++){
            int number = Character.getNumericValue(str.charAt(i));
            String conversion = numerosMorse.get(number);

            if(conversion != null) sb.append(conversion + " ");
        }
        return new String(sb);
    }

}
