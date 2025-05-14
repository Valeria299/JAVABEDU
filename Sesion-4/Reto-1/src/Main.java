public class Main {
    public static void main(String[] args) {
        // Creando dos facturas con el mismo folio, pero diferentes clientes/totales
        Factura factura1 = new Factura("VAC005", "Valeria Alvarez", 1500.0);
        Factura factura2 = new Factura("VAC005", "Andrómeda S.A de C.V", 1500.0);

        // Mostrando las facturas con toString()
        System.out.println(factura1);
        System.out.println(factura2);

        // Comparando si son iguales con equals()
        System.out.println("¿Las facturas son iguales?: " + factura1.equals(factura2));
    }
}