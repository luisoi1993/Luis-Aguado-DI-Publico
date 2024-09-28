/*- Existen dos tipos de tareas para poder registrar en la aplicación: TareasOcio y TareasTrabajo. Las características de dichas tareas son:
    - Comunes:
        - id: número único
        - titulo
        - descripción
        - fecha: definido como String
        - prioridad: Enum con las siguientes posibilidades: Baja, Media, Alta
        - completada: boolean que por defecto está marcado como false*/

public abstract class Tarea {
    private int numero;
    private String titulo;
    private String descripcion;
    private String fecha;
    private Prioridad prioridad;

    public Tarea(int numero, String titulo, String descripcion, String fecha, Prioridad prioridad) {
        this.numero = numero;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.prioridad = prioridad != null ? prioridad : Prioridad.BAJA;
    }

    public enum prioridad(){
        BAJA , MEDIA , ALTA
    }

    public int getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "Numero: " + numero + ", Título: " + titulo + ", Descripcion: " + descripcion + ", Fecha: " + fecha + " Prioridad: " + prioridad;
    }
}
