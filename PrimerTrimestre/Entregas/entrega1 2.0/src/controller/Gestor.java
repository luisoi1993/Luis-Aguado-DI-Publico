package controller;

import model.Tarea;
import model.Evento;
import model.Reunion;
import model.Persona;

import java.util.ArrayList;
import java.util.Date;

public class Gestor {
    private ArrayList<Tarea> tareas;

    public Gestor() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void borrarTarea(int id) {
        Tarea tarea = buscarTareaPorId(id);
        if (tarea != null) {
            tareas.remove(tarea);
            System.out.println("Tarea eliminada");
        } else {
            System.out.println("Tarea no encontrada");
        }
    }

    public void actualizarTarea(int id, String descripcion) {
        Tarea tarea = buscarTareaPorId(id);
        if (tarea != null) {
            tarea.setDescripcion(descripcion);
            System.out.println("Tarea actualizada");
        }
    }

    public void listarTareas(int tipo, int valor) {
        boolean found = false;
        for (Tarea tarea : tareas) {
            if (tipo == 1) {
                System.out.println(tarea);
                found = true;
            } else if (tipo == 2 && tarea.getPrioridad().getValor() == valor) {
                System.out.println(tarea);
                found = true;
            } else if (tipo == 3 && tarea.isCompletada()) {
                System.out.println(tarea);
                found = true;
            } else if (tipo == 4 && !tarea.isCompletada()) {
                System.out.println(tarea);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No se encontraron tareas para mostrar.");
        }
    }


    public void agregarAsistenteAReunion(int id, Persona persona) {
        Tarea tarea = buscarTareaPorId(id);
        if (tarea instanceof Reunion) {
            ((Reunion) tarea).agregarAsistente(persona);
            System.out.println("Asistente agregado");
        } else {
            System.out.println("No se encontró la reunión.");
        }
    }

    public void reprogramarEvento(int id, Date nuevaFecha) {
        Tarea tarea = buscarTareaPorId(id);
        if (tarea instanceof Evento) {
            ((Evento) tarea).setFecha(nuevaFecha);
            System.out.println("Evento reprogramado");
        }
    }

    public void verReprogramados() {
        for (Tarea tarea : tareas) {
            if (tarea instanceof Evento && ((Evento) tarea).isReprogramado()) {
                System.out.println(tarea);
            }
        }
    }

    public void buscarAsistente(String nombre) {
        for (Tarea tarea : tareas) {
            if (tarea instanceof Evento) {
                Evento evento = (Evento) tarea;
                for (Persona asistente : evento.getAsistentes()) {
                    if (asistente.getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println("Asistente encontrado en " + evento.getTitulo());
                        return;
                    }
                }
            }
        }
        System.out.println("Asistente no encontrado.");
    }

    private Tarea buscarTareaPorId(int id) {
        for (Tarea tarea : tareas) {
            if (tarea.getId() == id) {
                return tarea;
            }
        }
        return null;
    }
}
