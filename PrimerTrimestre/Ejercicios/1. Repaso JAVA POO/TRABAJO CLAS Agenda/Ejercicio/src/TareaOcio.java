/*TareaOcio: ubicación (string), presupuesto (double)*/

public class TareaOcio extends Tarea {
    private String ubicacion;
    private double presupuesto;

    public TareaOcio(int numero, String titulo, String descripcion, String fecha, Prioridad prioridad, String ubicacion, double presupuesto) {
        super(numero, titulo, descripcion, fecha, prioridad);
        this.ubicacion = ubicacion;
        this.presupuesto = presupuesto;
    }
}
