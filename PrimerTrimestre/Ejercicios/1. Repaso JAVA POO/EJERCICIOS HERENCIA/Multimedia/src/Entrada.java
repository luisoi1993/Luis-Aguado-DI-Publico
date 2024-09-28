import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorMultimedia gestor = new GestorMultimedia();

        int opcion;

        do {
            System.out.println("1. Añadir Multimedia");
            System.out.println("2. Eliminar Multimedia");
            System.out.println("3. Listar Todos");
            System.out.println("4. Buscar por Autor");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Lógica para agregar multimedia
                    gestor.añadirMultimedia();
                    break;
                case 2:
                    System.out.print("Ingrese ID a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    gestor.eliminarMultimedia(idEliminar);
                    break;
                case 3:
                    gestor.listarTodos();
                    break;
                case 4:
                    System.out.print("Ingrese el autor a buscar: ");
                    String autor = scanner.nextLine();
                    gestor.buscarPorAutor(autor);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
