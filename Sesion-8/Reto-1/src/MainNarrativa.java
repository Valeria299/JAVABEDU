public class MainNarrativa {
    public static void main(String[] args) {

        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();


        dialogo.mostrarDialogo("Bienvenido al juego. Estas en la entrada de una cabaña solitaria en el bosque...");
        String eleccion = decision.tomarDecision("Abres la puerta", "Buscas otro lugar");

        transicion.cambiarEscena(eleccion);
        dialogo.mostrarDialogo("Has elegido: " + eleccion);
        dialogo.mostrarDialogo("Pronto te darás cuenta de lo que pasará...");
    }
}
