public class TransferenciaBancaria extends MetodosPago implements iMetodoPago{

    @Override
    public void procesarPago(double importe) {
        IO.println("Tranfesencia por " + importe);
    }

    @Override
    public String obtenerTipo() {
        return "";
    }

    @Override
    public boolean requiereAutenticacion() {
        return true;
    }
}
