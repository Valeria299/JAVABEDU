import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Excepción personalizada
class ConsumoCriticoException extends Exception {
    public ConsumoCriticoException(String mensaje) {
        super(mensaje);
    }
}

