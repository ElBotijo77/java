package paquete.clase;
import org.presencial.Externa;

public class Main {

    //Hoy se ha dado solo teoria, mirando las consecuencias de elementos con diferentes AMBITOS.
    //Un ejemplo es que si se declara una variable dentro de un bucle, fuera de el Java no sabe que existe

    public static void main(String[] args){
        Externa externa;    //Clase creada en otro package, de ahi que haya que importar con ruta import org.presencial.Externa;
        Interna interna;

        for(int i=1; i<=10; i++){            //Bucle básico que muestra 10 primeros numeros
            IO.println(i);
        }
        //IO.println("Valor de i: " + i)       Error, porque i se ha declarado en el for


        //Palabra clave var
        var variable = 9;
        IO.println(((Object)variable).getClass().getName());  //Casting para comprobar de que tipo (int, double, etc) es la variable var
        boolean bool = (variable > 5);

        //Conversiones implicitas

        byte b = 1;                             //No se pierde nunca informacion al convertir un tipo de dato en su mayor, al reves si
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        char ch = (char) s;                     //Requiere casting EXPLICITO, debemos poner el dato que queremos que termine entre parentesis al principio
                                                // Se puede se short a char cogiedno el valor que determina el short (65=A, 91 = a) de la tabla ASCII

        Integer miInt = 0;                      //Wrapper, clase envoltorio para poder manejar el entero como un Objeto


    }
}



