
class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo); // Orden natural: alfabético
    }

    @Override
    public String toString() {
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}