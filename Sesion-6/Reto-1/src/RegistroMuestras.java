import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {

        List<String> listaMuestras = new ArrayList<>();
        listaMuestras.add("Homo sapiens");
        listaMuestras.add("Mus musculus");
        listaMuestras.add("Arabidopsis thaliana");
        listaMuestras.add("Homo sapiens");


        Set<String> especiesUnicas = new HashSet<>(listaMuestras);


        Map<String, String> idInvestigador = new HashMap<>();
        idInvestigador.put("M-001", "Dra. Alvarez");
        idInvestigador.put("M-002", "Dr. Ruiz");
        idInvestigador.put("M-003", "Dr. Torre");

        // Paso 4: Mostrar resultados en consola
        System.out.println("📥 Lista completa de muestras en orden:");
        for (String muestra : listaMuestras) {
            System.out.println("- " + muestra);
        }

        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println("\n🧑‍🔬 Relación de ID de muestra → investigador:");
        for (Map.Entry<String, String> entry : idInvestigador.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " → " + entry.getValue());
        }


        String idBusqueda = "M-002";
        System.out.println("\n🔍 Buscando investigador para ID " + idBusqueda + "...");
        if (idInvestigador.containsKey(idBusqueda)) {
            System.out.println("✅ Investigador responsable: " + idInvestigador.get(idBusqueda));
        } else {
            System.out.println("❌ No se encontró un investigador para ese ID.");
        }
    }
}