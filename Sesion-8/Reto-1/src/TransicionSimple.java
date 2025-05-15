public class TransicionSimple implements TransicionHistoria {
    @Override
    public void cambiarEscena(String nuevaEscena) {
        System.out.println("📖 Transición a escena: " + nuevaEscena);
    }
}
