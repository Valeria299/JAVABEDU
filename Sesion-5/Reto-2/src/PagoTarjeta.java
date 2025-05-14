public class PagoTarjeta extends MetodoPago {
    private double saldoDisponible;

    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autenticar() {
        return saldoDisponible >= monto; // Solo se autentica si hay fondos suficientes
    }

    @Override
    public void procesarPago() {
        if (autenticar()) {
            System.out.println("💳 Procesando pago con tarjeta por $" + monto);
        } else {
            System.out.println("❌ Pago rechazado. Fondos insuficientes.");
        }
    }
}
