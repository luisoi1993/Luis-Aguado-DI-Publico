import controller.Gestor;
import model.Tarea;
import utils.Prioridad;

public class Entrada {
    public static void main(String[] args) {
        // Crear instancia del gestor
        Gestor gestor = new Gestor();

        // Crear algunas tareas
        Tarea tarea1 = new Tarea("Tarea 1", "Descripción de la tarea 1", 1); // Prioridad media
        Tarea tarea2 = new Tarea("Tarea 2", "Descripción de la tarea 2", 2); // Prioridad alta
        Tarea tarea3 = new Tarea("Tarea 3", "Descripción de la tarea 3", 0); // Prioridad baja

        // Agregar tareas al gestor
        gestor.agregarTarea(tarea1);
        gestor.agregarTarea(tarea2);
        gestor.agregarTarea(tarea3);

        // Listar todas las tareas
        System.out.println("Listado de todas las tareas:");
        gestor.listarTareas();

        // Listar tareas por prioridad (1 = media)
        System.out.println("\nListado de tareas con prioridad media:");
        gestor.listarTareasPorPrioridad(1);

        // Completar una tarea (completar la tarea con ID 1)
        System.out.println("\nCompletando la tarea con ID 1:");
        gestor.completarTarea(1);

        // Listar tareas completadas
        System.out.println("\nListado de tareas completadas:");
        gestor.listarTareasPorEstado(true);

        // Modificar la descripción de la tarea 2
        System.out.println("\nModificando la descripción de la tarea con ID 2:");
        gestor.modificarDescripcionTarea(2, "Nueva descripción para la tarea 2");

        // Listar todas las tareas nuevamente para ver los cambios
        System.out.println("\nListado actualizado de todas las tareas:");
        gestor.listarTareas();
    }
}
