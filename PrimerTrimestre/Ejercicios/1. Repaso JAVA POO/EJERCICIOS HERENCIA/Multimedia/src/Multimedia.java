public abstract class Multimedia {
    private String id;
    private String titulo;
    private String autor;
    private double tamaño;
    private String formato;

    public Multimedia(String id, String titulo, String autor, double tamaño, String formato) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tamaño = tamaño;
        this.formato = formato;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", Tamaño: " + tamaño + " MB, Formato: " + formato;
    }
}
