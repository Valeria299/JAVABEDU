import java.io.*;

public class AnalizadorDeLogs {
    private static final String ARCHIVO_LOGS = "errores.log";
    private static final String ARCHIVO_FALLOS = "registro_fallos.txt";

    public static void main(String[] args) {
        analizarArchivo();
    }

    private static void analizarArchivo() {
        int totalLineas = 0;
        int errores = 0;
        int advertencias = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_LOGS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    errores++;
                } else if (linea.contains("WARNING")) {
                    advertencias++;
                }
            }

            // Mostrar resultados
            imprimirResumen(totalLineas, errores, advertencias);

        } catch (IOException e) {
            registrarFallo(e.getMessage());
            System.out.println("❌ Error al leer el archivo. Se ha registrado en " + ARCHIVO_FALLOS);
        }
    }

    private static void imprimirResumen(int totalLineas, int errores, int advertencias) {
        double porcentajeErrores = (totalLineas > 0) ? (errores * 100.0 / totalLineas) : 0;
        double porcentajeAdvertencias = (totalLineas > 0) ? (advertencias * 100.0 / totalLineas) : 0;

        System.out.println("\n📊 Resumen del análisis:");
        System.out.println("Total de líneas leídas: " + totalLineas);
        System.out.println("Cantidad de errores: " + errores);
        System.out.println("Cantidad de advertencias: " + advertencias);
        System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
        System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeAdvertencias);
    }

    private static void registrarFallo(String mensaje) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_FALLOS))) {
            bw.write("Error detectado: " + mensaje);
        } catch (IOException e) {
            System.out.println("❌ No se pudo registrar el fallo.");
        }
    }
}