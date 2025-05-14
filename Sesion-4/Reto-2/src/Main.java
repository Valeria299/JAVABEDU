public class Main {
    public static void main(String[] args) {

        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("PEAV030129V99", 6000);

        CuentaFiscal cuenta = new CuentaFiscal("PEAV030129V99", 6500.0);

        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() + " por $" + declaracion.montoDeclarado());
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + cuenta.getRfc() + ", saldo disponible: $" + cuenta.getSaldoDisponible());

        System.out.println("✅ ¿RFC válido para esta cuenta?: " + cuenta.validarRFC(declaracion));
    }
}