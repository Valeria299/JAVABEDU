import java.util.Optional;

class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = (rfc != null && !rfc.isEmpty()) ? Optional.of(rfc) : Optional.empty();
    }

    public String getResumen() {
        return String.format("📄 Factura generada:\nDescripción: %s\nMonto: $%.2f\nRFC: %s",
                descripcion, monto, rfc.orElse("[No proporcionado]"));
    }
}