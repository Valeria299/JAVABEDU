import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Set<Integer> registrosCPU = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.print("🔹 Ingresa el consumo de CPU (%): ");
                String entrada = scanner.nextLine();

                // Entrada numérica
                try {
                    int consumo = Integer.parseInt(entrada);

                    // Rango y duplicados
                    if (consumo < 0 || consumo > 100) {
                        System.out.println("⚠️ Error: El valor debe estar entre 0% y 100%.");
                        continue;
                    }
                    if (!registrosCPU.add(consumo)) {
                        System.out.println("⚠️ Advertencia: Registro duplicado.");
                        continue;
                    }

                    // Lanzar excepción si el consumo es crítico (>95%)
                    if (consumo > 95) {
                        throw new ConsumoCriticoException("❗ Alerta: Consumo crítico detectado (" + consumo + "%).");
                    }

                    System.out.println("✅ Registro aceptado: " + consumo + "%");

                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: Ingresa un valor numérico.");
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                }

                // Pregunta al usuario
                System.out.print("🔄 ¿Ingresar otro consumo? (s/n): ");
                String continuar = scanner.nextLine();
                if (!continuar.equalsIgnoreCase("s")) {
                    break;
                }
            }
        } finally {
            scanner.close();
            System.out.println("\n📊 Monitoreo finalizado.");
        }
    }
}
