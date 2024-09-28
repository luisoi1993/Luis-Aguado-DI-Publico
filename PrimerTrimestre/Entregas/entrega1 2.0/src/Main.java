import controller.Gestor;
import model.*;
import utils.Prioridad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gestor gestor = new Gestor();
        int opcion = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        do {
            System.out.println("1. Agregar tarea/reunión");
            System.out.println("2. Listar tareas");
            System.out.println("3. Borrar tareas");
            System.out.println("4. Modificar tarea");
            System.out.println("5. Agregar asistente a reunión");
            System.out.println("6. Reprogramar evento/reunión");
            System.out.println("7. Buscar asistente");
            System.out.println("8. Ver reprogramados");
            System.out.println("9. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Vas a agregar una tarea o reunión");
                    System.out.println("1. Tarea sencilla");
                    System.out.println("2. Evento");
                    System.out.println("3. Reunión");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    System.out.print("Introduce el título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Introduce la descripción: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Introduce la prioridad (1-baja 2-media 3-alta): ");
                    int prioridad = scanner.nextInt();

                    switch (tipo) {
                        case 1:
                            gestor.agregarTarea(new TareaSencilla(titulo, descripcion, Prioridad.values()[prioridad - 1]));
                            break;
                        case 2:
                            System.out.print("Introduce la ubicación: ");
                            String ubicacion = scanner.nextLine();
                            System.out.print("Introduce la fecha (formato yyyy-MM-dd): ");
                            try {
                                Date fechaEvento = sdf.parse(scanner.nextLine());
                                gestor.agregarTarea(new Evento(TareaSencilla.contadorId++, titulo, descripcion, Prioridad.values()[prioridad - 1], fechaEvento, ubicacion));
                            } catch (ParseException e) {
                                System.out.println("Formato de fecha inválido.");
                            }
                            break;
                        case 3:
                            System.out.print("Introduce la ubicación: ");
                            String ubicacionReunion = scanner.nextLine();
                            System.out.print("Introduce la fecha (formato yyyy-MM-dd): ");
                            try {
                                Date fechaReunion = sdf.parse(scanner.nextLine());
                                System.out.print("Es importante (true/false): ");
                                boolean importante = scanner.nextBoolean();
                                gestor.agregarTarea(new Reunion(TareaSencilla.contadorId++, titulo, descripcion, Prioridad.values()[prioridad - 1], fechaReunion, ubicacionReunion, importante));
                            } catch (ParseException e) {
                                System.out.println("Formato de fecha inválido.");
                            }
                            break;

                    }
                    break;

                case 2:
                    System.out.println("1. Todas las tareas");
                    System.out.println("2. Por prioridad");
                    System.out.println("3. Completadas");
                    System.out.println("4. No completadas");
                    int opcionListado = scanner.nextInt();
                    int valorPrioridad = -1;
                    if (opcionListado == 2) {
                        System.out.print("Dime el valor que quieres buscar 1-baja 2-media 3-alta: ");
                        valorPrioridad = scanner.nextInt();
                    }
                    gestor.listarTareas(opcionListado, valorPrioridad);
                    break;

                case 3:
                    System.out.print("Indica el ID de la tarea que quieres borrar: ");
                    int idBorrado = scanner.nextInt();
                    gestor.borrarTarea(idBorrado);
                    break;

                case 4:
                    System.out.print("Indica el ID de la tarea que quieres modificar: ");
                    int idModificar = scanner.nextInt();
                    scanner.nextLine(); // Consumir nueva línea
                    System.out.print("Introduce la nueva descripción: ");
                    String nuevaDescripcion = scanner.nextLine();
                    gestor.actualizarTarea(idModificar, nuevaDescripcion);
                    break;

                case 5:
                    System.out.print("Indica el ID de la reunión: ");
                    int idReunion = scanner.nextInt();
                    scanner.nextLine(); // Consumir nueva línea
                    System.out.print("Introduce el nombre del asistente: ");
                    String nombreAsistente = scanner.nextLine();
                    gestor.agregarAsistenteAReunion(idReunion, new Persona(nombreAsistente));
                    break;

                case 6:
                    System.out.print("Indica el ID del evento/reunión: ");
                    int idReprogramar = scanner.nextInt();
                    System.out.print("Introduce la nueva fecha (formato yyyy-MM-dd): ");
                    try {
                        Date nuevaFecha = sdf.parse(scanner.next());
                        gestor.reprogramarEvento(idReprogramar, nuevaFecha);
                    } catch (ParseException e) {
                        System.out.println("Formato de fecha inválido.");
                    }
                    break;

                case 7:
                    scanner.nextLine();
                    System.out.print("Introduce el nombre del asistente: ");
                    String asistenteBuscado = scanner.nextLine();
                    gestor.buscarAsistente(asistenteBuscado);
                    break;

                case 8:
                    gestor.verReprogramados();
                    break;

                case 9:
                    System.out.println("Saliendo del sistema.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 9);
    }
}
