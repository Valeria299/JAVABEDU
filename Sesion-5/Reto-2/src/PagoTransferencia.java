import java.util.Random;

public class PagoTransferencia extends MetodoPago {
    public PagoTransferencia(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        return new Random().nextBoolean(); // Simula validación bancaria aleatoria
    }

    @Override
    public void procesarPago() {
        System.out.println("🏦 Procesando transferencia por $" + monto);
    }
}
