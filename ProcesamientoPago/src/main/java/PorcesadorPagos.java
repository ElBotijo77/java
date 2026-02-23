public class PorcesadorPagos {

 public static void procesador(iMetodoPago procesarPago, double importe){
     if(importe < 0) throw new CobroIncorrecto("Cobro no realizado, no puede tener un numero negativo");
 }
}
