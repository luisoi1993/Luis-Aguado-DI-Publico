package model;

import utils.Prioridad;

public class TareaSencilla extends Tarea {

    public static int contadorId = 1;

    public TareaSencilla(String titulo, String descripcion, Prioridad prioridad) {
        super(contadorId++, titulo, descripcion, prioridad);
    }


    public void mostrar() {
        System.out.println(this.toString());
    }
}
