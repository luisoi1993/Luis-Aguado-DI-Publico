package model;

import utils.Prioridad;

public abstract class Tarea {
    private int id;
    private String titulo;
    private String descripcion;
    private Prioridad prioridad;
    private boolean completada;

    public Tarea(int id, String titulo, String descripcion, Prioridad prioridad) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = false;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
    public Prioridad getPrioridad() { return prioridad; }
    public boolean isCompletada() { return completada; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setCompletada(boolean completada) { this.completada = completada; }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", titulo='" + titulo + '\'' + ", prioridad=" + prioridad + ", completada=" + completada + '}';
    }
}
