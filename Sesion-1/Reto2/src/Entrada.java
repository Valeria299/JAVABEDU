public class Entrada {
    String evento;
    double precio;

    // Constructor
    public Entrada(String evento, double precio){
        this.evento = evento;
        this.precio = precio;

    }
    // Método que muestra la información del producto en consola
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }
}
