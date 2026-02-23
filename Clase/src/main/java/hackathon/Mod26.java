package hackathon;

import java.util.*;

public class Mod26 {

    /*
    *  Transcripción poética: archivo #RSPN-01

        Horizontes verdes susurran con calma,
        Vientos suaves acarician colinas dormidas.

        Con el sol despiertan los sueños olvidados,
        Hojas bailan mientras la brisa pasa.

        Otro día nace sobre los prados tranquilos,
        Al fin la luz revela secretos escondidos.

        Inmensos campos guardan memorias antiguas,
        Unidos los ecos cantan a España.
        Brilla la esperanza sobre la tierra.
    * */

    /*" Transcripción poética: archivo #RSPN-01\n" +
            "\n" +
            "Horizontes verdes susurran con calma,\n" +
            "Vientos suaves acarician colinas dormidas.\n" +
            "\n" +
            "Con el sol despiertan los sueños olvidados,\n" +
            "Hojas bailan mientras la brisa pasa.\n" +
            "\n" +
            "Otro día nace sobre los prados tranquilos,\n" +
            "Al fin la luz revela secretos escondidos.\n" +
            "\n" +
            "Inmensos campos guardan memorias antiguas,\n" +
            "Unidos los ecos cantan a España.\n" +
            "Brilla la esperanza sobre la tierra.";*/

    public static void main(String[] args){
        String str = "Horizontes verdes susurran con calma " +
                    "Vientos suaves acarician colinas dormidas. " +

                    "Con el sol despiertan los sueños olvidados, " +
                    "Hojas bailan mientras la brisa pasa. " +

                    "Otro día nace sobre los prados tranquilos, " +
                    "Al fin la luz revela secretos escondidos. " +

                    "Inmensos campos guardan memorias antiguas, " +
                    "Unidos los ecos cantan a España. " +
                    "Brilla la esperanza sobre la tierra. ";


        IO.println(solution(str));
        IO.println(mapeo(solution(str), str));

    }

    public static List<String> solution(String str){
        List<String> lista = new ArrayList<String>();
        List<Character> especial = List.of(' ', '.', ',');
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for (int i=0; i<str.length(); i++){
            if(!especial.contains(str.charAt(i))){
                sb.append(str.charAt(i));
                n = str.length();
            }
            else{
                lista.add(new String(sb));
                sb.delete(0, n);
            }
        }

        lista.removeIf(String::isEmpty);

        for(String x: lista){
            sb.append(x);
        }
        lista.add(new String(sb));
        return lista;


    }

    public static String mapeo(List<String> lista, String copia){
        IO.println("Solucion: ");
        IO.println(lista.getLast().charAt(69));
        IO.println(lista.getLast().charAt(115));
        IO.println(lista.getLast().charAt(112));
        IO.println(lista.getLast().charAt(97));
        IO.println(lista.getLast().charAt(164));
        IO.println(lista.getLast().charAt(97));


        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int tamano = lista.getLast().length();
        String str = lista.getLast();
        IO.println(lista.getLast());

        IO.println("Muestra las mayusculas");
        String mayus = "";

        for (int i=0; i<str.length(); i++){
            int valor = (int)str.charAt(i);
            if(valor<90) mayus = mayus + str.charAt(i);
        }

        mayus = mayus.toLowerCase();

        IO.println(mayus);

        //str = str.toLowerCase();

        for (int i=0; i<tamano; i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            IO.println("Valor: " + entry.getKey() + " Key: " + entry.getValue());
        }

        int ascii = 97;

       // IO.println("\n\nE: " + (map.get('E') + 97 ));

        IO.println("\nNumero de ocurrrenias: \n" + "e: " + map.get('e'));
        IO.println("s: " + map.get('s'));
        IO.println("p: " + map.get('p'));
        IO.println("a: " + map.get('a'));
        IO.println("ñ: " + map.get('n'));
        IO.println("a: " + map.get('a'));

        IO.println("\nPosicion segun ocurrencias: \n" + "E: " + copia.charAt(map.get('E')));
        IO.println("s: " + copia.charAt(map.get('s')));
        IO.println("p: " + copia.charAt(map.get('p')));
        IO.println("a: " + copia.charAt(map.get('a')));
        IO.println("ñ: " + copia.charAt(map.get('ñ')));
        IO.println("a: " + copia.charAt(map.get('a')));

        return "";
    }

}
