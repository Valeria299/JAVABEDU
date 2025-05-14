class Vuelo {
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;

    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            System.out.println("✅ Reserva realizada con éxito.");
            return true;
        } else {
            System.out.println("⚠️ Asiento ya reservado.");
            return false;
        }
    }

    public boolean reservarAsiento(String nombre, String pasaporte) {
        return reservarAsiento(new Pasajero(nombre, pasaporte));
    }

    public void cancelarReserva(boolean confirmar) {
        if (confirmar) {
            if (asientoReservado != null) {
                System.out.println("❌ Cancelando reserva...");
                asientoReservado = null;
            } else {
                System.out.println("️ No hay reserva para cancelar.");
            }
        } else {
            System.out.println("✅ Reserva mantenida.");
        }
    }

    public String obtenerItinerario() {
        String pasajeroInfo = (asientoReservado != null) ? asientoReservado.getNombre() : "[Sin reserva]";
        return String.format("✈️ Itinerario del vuelo:\nCódigo: %s\nDestino: %s\nSalida: %s\nPasajero: %s",
                codigoVuelo, destino, horaSalida, pasajeroInfo);
    }
}