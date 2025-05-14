import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        // Definir saldo inicial con inferencia de tipo
        var saldo = 1000.0;
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            // Leer opción
            while (!scanner.hasNextInt()) {
                System.out.println("Opción inválida. Por favor, introduce un número.");
                scanner.next();
            }
            opcion = scanner.nextInt();

            // Manejar opciones con switch
            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + saldo);
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito exitoso. Saldo actualizado: $" + saldo);
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Fondos insuficientes. No se realizó el retiro.");
                        continue;
                    }
                    saldo -= retiro;
                    System.out.println("Retiro exitoso. Saldo actualizado: $" + saldo);
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
