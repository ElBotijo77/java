package org.example;

import java.util.*;

public class Main {
    static void main() {

        //ArrayList
        List<Integer> arrayEnteros = new ArrayList<>();
        arrayEnteros.add(22);
        arrayEnteros.add(77);
        arrayEnteros.add(11);
        System.out.println("ArrayList actual: " + arrayEnteros);
        System.out.println("Primer elemento: " + arrayEnteros.get(0));
        System.out.println("Último elemento: " + arrayEnteros.get(arrayEnteros.size() - 1));

        //Añadir en posición
        arrayEnteros.add(1, 99);
        System.out.println("Tercer elemento: " + arrayEnteros.get(2));
        System.out.println("ArrayList actual: " + arrayEnteros);

        //Eliminar elemento
        arrayEnteros.remove(0);
        System.out.println("Tercer elemento: " + arrayEnteros.get(2));
        System.out.println("ArrayList actual: " + arrayEnteros);

        //Ordenar ArrayList asc
        arrayEnteros.sort(Integer::compareTo);
        System.out.println("ArrayList ordenada: " + arrayEnteros);

        //Ordenar ArrayList desc
        arrayEnteros.sort(Comparator.reverseOrder());
        System.out.println("ArrayList ordenada descendente: " + arrayEnteros);

        //Array 3D
        ArrayList<ArrayList<ArrayList>> array3D = new ArrayList<>();
        array3D.add(new ArrayList<>());
        array3D.add(new ArrayList<>());
        array3D.get(0).add(new ArrayList<>());
        array3D.get(0).add(new ArrayList<>());
        array3D.get(1).add(new ArrayList<>());
        array3D.get(1).add(new ArrayList<>());
        array3D.get(1).add(new ArrayList<>());
        array3D.get(0).get(0).add("Cadena1");
        array3D.get(0).get(1).add(true);
        array3D.get(1).get(0).add("Cadena2");
        array3D.get(1).get(1).add(123);
        array3D.get(1).get(2).add('ç');
        System.out.println(array3D);


        //Recorrer array
        for (int i = 0; i < arrayEnteros.size(); i++)
            System.out.println(arrayEnteros.get(i));

        for (int j = arrayEnteros.size(); j > 0; j--) {
            System.out.println(arrayEnteros.get(j - 1));
        }

        for (int elemento : arrayEnteros) {
            System.out.println(elemento);
        }

        //Usar lambda
        arrayEnteros.forEach((elemento) -> {
            System.out.println(elemento);
        });

        //Función flecha (lambda) optimizada
        arrayEnteros.forEach(System.out::println);

        //Iterador
        Iterator<Integer> iterador = arrayEnteros.iterator();
        while (iterador.hasNext()) System.out.println(iterador.next());

        System.out.println("Iterator");
        //Iterar sobre los elementos restantes si se han lanzado varios next()
        Iterator<Integer> iterador2 = arrayEnteros.iterator();
        iterador2.forEachRemaining(System.out::println);


        System.out.println("List Iterator");

        //Iterador propio de List
        ListIterator<Integer> listIterador = arrayEnteros.listIterator(arrayEnteros.size());
        while (listIterador.hasPrevious()) System.out.println(listIterador.previous());

    }
}
