public class Principal {
    public static void main(String[] args) {
        // Crear un objeto de tipo Producto utilizando el constructor
        Entrada entrada1 = new Entrada("Celular", 9999.99);
        Entrada entrada2 = new Entrada("Reloj", 899.99);

        // Llamar al método para mostrar la información del producto
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
    }
}