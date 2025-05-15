import java.nio.file.*;
import java.io.IOException;

public class RegistroSimulacion {
    private static final Path rutaArchivo = Paths.get("config/parametros.txt");

    public static void main(String[] args) {
        guardarParametros();
        verificarExistencia();
        leerParametros();
    }

    // Guardar los parámetros en el archivo
    private static void guardarParametros() {
        try {

            Files.createDirectories(rutaArchivo.getParent());

            String parametros = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;


            Files.writeString(rutaArchivo, parametros);
            System.out.println("✅ Archivo de parámetros guardado correctamente.");
        } catch (IOException e) {
            System.out.println("❌ Error al guardar los parámetros: " + e.getMessage());
        }
    }

    // Método para verificar la existencia del archivo
    private static void verificarExistencia() {
        if (Files.exists(rutaArchivo)) {
            System.out.println("📂 El archivo de parámetros existe.");
        } else {
            System.out.println("⚠️ El archivo de parámetros no fue encontrado.");
        }
    }

    // Método para leer y mostrar el contenido del archivo
    private static void leerParametros() {
        try {
            String contenido = Files.readString(rutaArchivo);
            System.out.println("\n📄 Contenido del archivo:\n" + contenido);
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }
    }
}
