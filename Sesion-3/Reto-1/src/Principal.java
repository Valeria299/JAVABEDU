public class Principal {
    public static void main(String[] args) {
        // Creando pasajero y vuelo
        Pasajero pasajero1 = new Pasajero("Valeria Alvarez", "V2909");
        Vuelo vuelo1 = new Vuelo("UV209", "Colombia", "14:30");

        // Reservando asiento
        vuelo1.reservarAsiento(pasajero1);
        System.out.println(vuelo1.obtenerItinerario());

        // Cancelando reserva (opcional)
        vuelo1.cancelarReserva(false); // Esto mantendría la reserva
        System.out.println(vuelo1.obtenerItinerario());

        // Cancelando reserva (confirmado)
        vuelo1.cancelarReserva(true);  // Esto la cancelaría
        System.out.println(vuelo1.obtenerItinerario());

        // Reservando nuevamente con nombre y pasaporte
        vuelo1.reservarAsiento("Cristian Torre", "C0505");
        System.out.println(vuelo1.obtenerItinerario());
    }
}