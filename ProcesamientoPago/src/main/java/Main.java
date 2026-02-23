import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Main {


/*Una empresa necesita desarrollar un sistema que permita procesar distintos métodos de pago.

Se pide diseñar un programa en Java que cumpla los siguientes requisitos:


Crea una interfaz llamada iMetodoPago
Que declare los siguientes métodos:
void procesarPago(double importe);
String obtenerTipo();

Implementa al menos tres métodos de pago diferentes:
TarjetaCredito
PayPal
TransferenciaBancaria

Cada clase debe:
Implementar la interfaz iMetodoPago
Simular el procesamiento del pago mostrando un mensaje diferente en cada clase
Devolver su tipo en el método obtenerTipo()

Ejemplos de salida esperada:
Procesando pago con tarjeta por 150€
Pago realizado vía PayPal por 80€
Transferencia bancaria realizada por 300€

A continuación, vamos a utilizar el polimorfismo para ver como cada pago se procesa de la misma forma.

En la clase Main:
Añade objetos de los distintos tipos de pago.
Llama al método procesarPago() para cada uno.
Debe funcionar sin importar el tipo concreto del objeto.
Un par de preguntas para debatir:
¿Por qué no usamos una clase abstracta en lugar de una interfaz?
¿Qué ocurriría si añadimos un nuevo método de pago?

Y hasta aquí el ejercicio. Si queréis avanzar más, podéis intentar lo siguiente:

1 Añade un método adicional en la interfaz:
boolean requiereAutenticacion();

Cada clase debe implementar este método según esta lógica:
Tarjeta sí
PayPal sí
Transferencia no
En el Main, muestra también si el método requiere autenticación.

2 Añade una clase ProcesadorPagos que reciba un iMetodoPago como parámetro.
Lanza excepción si el importe es negativo.
Implementa excepciones personalizadas.
 */


    static void main() {

        ArrayList<MetodosPago> list = new ArrayList<MetodosPago>(3);
        String [] clases = {"TarjetaCredito", "PayPal", "TrasferenciaBancaria"};

        TarjetaCredito tarjeta = new TarjetaCredito(344);
        PayPal paypal = new PayPal();
        TransferenciaBancaria transferencia= new TransferenciaBancaria();

        list.add(tarjeta);
        list.add(paypal);
        list.add(transferencia);


        for(MetodosPago x: list){
            IO.print(x.getClass());
            if(x instanceof PayPal || x instanceof TarjetaCredito) IO.print(" requiere autentificacion");
            else IO.print(" no requiere autentificación");
            IO.println();
        }


        PorcesadorPagos.procesador(tarjeta, -1);

    }
}