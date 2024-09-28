import java.util.ArrayList;

public class Video extends Multimedia {
    private Persona director;
    private ArrayList<Persona> actores;

    public Video(String id, String titulo, String autor, double tamaño, String formato, Persona director, ArrayList<Persona> actores) {
        super(id, titulo, autor, tamaño, formato);
        this.director = director;
        this.actores = actores;
    }

    // Getters para director y actores
    public Persona getDirector() {
        return director;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    @Override
    public String toString() {
        return super.toString() + ", Director: " + director + ", Actores: " + actores;
    }
}
