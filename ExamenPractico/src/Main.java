import java.util.ArrayList;
import java.util.List;

public class Main {

    /*Crearemos una coleccion de tipo Pais*/

    public static void main(String[] args) {

        List<Pais> lista = new ArrayList<Pais>(4);

        lista.add(new Pais("España", 47000000, 1.5f));
        lista.add(new Pais("Alemania", 84000000, 4.2f));
        lista.add(new Pais("Japon", 125000000, 5f));
        lista.add(new Pais("Brasil", 215000000, 2.1f));

        //Mostramos informacion principal

        System.out.println("El numero total de paises es de " + lista.size() + ". A continuacion se " +
                "mostrarán los nombres de los paises componentes: ");

        //Con este bucle mostraremos los nombres de todos los paises

        for(int i=0; i<lista.size(); i++){
            if(i < lista.size()-1) System.out.print(lista.get(i).getNombre() + ", ");
            else System.out.print("y " + lista.get(i).getNombre() + "\n");
        }

        //Se guarda el index del pais con mayor PIB, para despues poder acceder a todas sus propiedades

        int indexMayorPIB = masRico(lista);

        System.out.println("El PIB mas alto es de " + lista.get(indexMayorPIB).getNombre() + " con un total de "
                        + lista.get(indexMayorPIB).getPib() + " billones");

    }

    /*Creamos un metodo estatico que compruebe el pais mas rico pasandole por paramentro una lista
    * Devolvera la posicion del pais que cumpla las caracteristicas*/

    public static int masRico(List<Pais> list){
        float mayor = 0;
        float pibActual = 0;
        int index = 0;

        for(int i=0; i<list.size(); i++){
            pibActual = list.get(i).getPib();
            if(pibActual > mayor) {
                mayor = pibActual;
                index = i;
            }
        }
        return index;
    }
}
