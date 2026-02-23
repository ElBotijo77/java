import java.io.Serial;
import java.io.Serializable;

public class TarjetaCredito extends MetodosPago implements iMetodoPago, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    double importe = 0;

    public TarjetaCredito(double importe){
        this.importe = importe;
    }
    @Override
    public void procesarPago(double importe) {
        IO.println("Tarjeta de credito usada por " + importe);
    }

    @Override
    public String obtenerTipo() {
        return "Tipo: Tarjeta credito";
    }

    @Override
    public boolean requiereAutenticacion() {
        return false;
    }
}
