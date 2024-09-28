public class Libro extends Multimedia {
    private String ISBN;
    private int numeroPaginas;

    public Libro(String id, String titulo, String autor, double tamaño, String formato, String ISBN, int numeroPaginas) {
        super(id, titulo, autor, tamaño, formato);
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + ", ISBN: " + ISBN + ", Páginas: " + numeroPaginas;
    }
}
