package controller;

import model.Tarea;

import java.util.ArrayList;
import java.util.Objects;

public class Gestor {

    private ArrayList<Tarea> tareas;

    public Gestor(){
        this.tareas =new ArrayList();
    }

    // CREAR LOS METODOS QUE PERMITAN
        // Agregar tareas -> con IDs unicos
        // Listar tareas
            // todas
            // por prioridad
            // completadas - no completadas
        // completar tareas
            // indicas el id y cambias el estado,
            // siempre que el estado no este completado
        // Modificar tareas
            // indicas el id y modificas la descripcion
    // Agregar tarea con ID único

    /*
   private Tarea buscarTarea(int id){
       for(Tarea item: tareas){
           if(item.getId() == id){
               return item;
           }
       }
   }
*/


    public void agregarTarea(Tarea tarea) {
        int nuevoId = tareas.size() + 1;
        tarea.setId(nuevoId);
        tareas.add(tarea);
    }


    // Listar todas las tareas
    public void listarTareas() {
        for (Tarea tarea : tareas) {
            System.out.println(tarea.getTitulo());
        }
    }

    // Listar tareas por prioridad
    public void listarTareasPorPrioridad(int prioridad) {
        for (Tarea tarea : tareas) {
            if (tarea.getPrioridad().getValor() == prioridad) {
                System.out.println(tarea.getTitulo());
            }
        }
    }

    // Listar tareas completadas o no completadas
    public void listarTareasPorEstado(boolean completada) {
        for (Tarea tarea : tareas) {
            if (tarea.isCompletada() == completada) {
                System.out.println(tarea.getTitulo());
            }
        }
    }

    // Completar una tarea por ID
    public void completarTarea(int id) {
        for (Tarea tarea : tareas) {
            if (tarea.getId() == id && !tarea.isCompletada()) {
                tarea.setCompletada(true);
                System.out.println("Tarea completada: " + tarea.getTitulo());
                break;
            }
        }
    }

    // Modificar la descripción de una tarea por ID
    public void modificarDescripcionTarea(int id, String nuevaDescripcion) {
        for (Tarea tarea : tareas) {
            if (tarea.getId() == id) {
                tarea.setDescripcion(nuevaDescripcion);
                System.out.println("Descripción modificada para la tarea: " + tarea.getTitulo());
                break;
            }
        }
    }
}