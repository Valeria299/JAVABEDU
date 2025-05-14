// Clase Principal
public class Principal {
    public static void main(String[] args) {
        // Creando facturas con y sin RFC
        Factura factura1 = new Factura(800.00, "Reparación de pantalla de celular", "null");
        Factura factura2 = new Factura(1200.00, "Reparación de pantalla de laptop", null);

        // Mostrando resúmenes
        System.out.println(factura1.getResumen());
        System.out.println();
        System.out.println(factura2.getResumen());
    }
}