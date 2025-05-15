import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision(String opcion1, String opcion2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🔹 Elige una opción: 1) " + opcion1 + "  2) " + opcion2);
        int eleccion = scanner.nextInt();
        return (eleccion == 1) ? opcion1 : opcion2;
    }
}
