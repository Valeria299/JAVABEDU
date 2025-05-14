import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        // Calcular el total sin descuento
        var totalSinDescuento = precioUnitario * cantidad;

        // Aplicar descuento si el total supera los $500.00
        boolean aplicaDescuento = totalSinDescuento > 500;
        var descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;
        var totalAPagar = totalSinDescuento - descuento;

        // Mostrar resumen
        System.out.println("\nMedicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalAPagar);

        // Cerrar el scanner
        scanner.close();
    }
}
