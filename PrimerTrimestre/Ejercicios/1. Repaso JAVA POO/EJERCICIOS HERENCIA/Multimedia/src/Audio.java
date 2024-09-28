public class Audio extends Multimedia {
    private double duracion;
    private String soporte;

    public Audio(String id, String titulo, String autor, double tamaño, String formato, double duracion, String soporte) {
        super(id, titulo, autor, tamaño, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public String toString() {
        return super.toString() + ", Duración: " + duracion + " mins, Soporte: " + soporte;
    }
}
