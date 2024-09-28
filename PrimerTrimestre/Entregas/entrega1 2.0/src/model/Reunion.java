package model;

import java.util.Date;
import utils.Prioridad;

public class Reunion extends Evento {
    private boolean importante;

    public Reunion(int id, String titulo, String descripcion, Prioridad prioridad, Date fecha, String ubicacion, boolean importante) {
        super(id, titulo, descripcion, prioridad, fecha, ubicacion);
        this.importante = importante;
    }

    @Override
    public void setFecha(Date fecha) {
        super.setFecha(fecha);
    }

    public boolean isImportante() {
        return importante;
    }

    @Override
    public String toString() {
        return super.toString() + ", Reunion{" + "importante=" + importante + '}';
    }
}
