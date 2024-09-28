package model;

import java.util.ArrayList;
import java.util.Date;
import utils.Prioridad;

public class Evento extends Tarea {
    private Date fecha;
    private String ubicacion;
    private ArrayList<Persona> asistentes;
    private boolean reprogramado;

    public Evento(int id, String titulo, String descripcion, Prioridad prioridad, Date fecha, String ubicacion) {
        super(id, titulo, descripcion, prioridad);
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.asistentes = new ArrayList<>();
        this.reprogramado = false;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
        this.reprogramado = true;
    }

    public void agregarAsistente(Persona persona) {
        asistentes.add(persona);
    }

    public boolean isReprogramado() {
        return reprogramado;
    }

    public ArrayList<Persona> getAsistentes() {
        return asistentes;
    }

    @Override
    public String toString() {
        return super.toString() + ", Evento{" + "fecha=" + fecha + ", ubicacion='" + ubicacion + '\'' + ", reprogramado=" + reprogramado + '}';
    }
}
