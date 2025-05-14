public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
                new PagoEfectivo(200.0),
                new PagoTarjeta(250.0, 300.0),
                new PagoTransferencia(50.0)
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("✅ Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("❌ Fallo de autenticación. Pago no válido.");
            }
            System.out.println();
        }
    }
}
