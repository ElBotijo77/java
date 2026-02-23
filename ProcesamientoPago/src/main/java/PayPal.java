public class PayPal extends MetodosPago implements iMetodoPago{
    @Override
    public void procesarPago(double importe) {
        IO.println("Paypal de " + importe);
    }

    @Override
    public String obtenerTipo() {
        return "Tipo: Paypal";
    }

    @Override
    public boolean requiereAutenticacion() {
        return true;
    }


}
