import java.util.ArrayList;
import java.util.Scanner;

public class GestorMultimedia {
    private ArrayList<Multimedia> coleccion;

    public GestorMultimedia() {
        coleccion = new ArrayList<>();
    }

    // Añadir un elemento multimedia a la colección
    public void añadirMultimedia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué tipo de multimedia deseas añadir? (1) Libro, (2) Video, (3) Audio");
        int tipo = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        System.out.println("Introduce el identificador:");
        String id = sc.nextLine();

        // Comprobar si ya existe un elemento con el mismo ID
        if (existeMultimedia(id)) {
            System.out.println("Ya existe un elemento con ese identificador.");
            return;
        }

        System.out.println("Introduce el título:");
        String titulo = sc.nextLine();

        System.out.println("Introduce el autor:");
        String autor = sc.nextLine();

        System.out.println("Introduce el tamaño:");
        double tamaño = sc.nextDouble();
        sc.nextLine(); // Limpiar el buffer

        System.out.println("Introduce el formato:");
        String formato = sc.nextLine();

        switch (tipo) {
            case 1: // Libro
                System.out.println("Introduce el ISBN:");
                String isbn = sc.nextLine();
                System.out.println("Introduce el número de páginas:");
                int paginas = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer
                coleccion.add(new Libro(id, titulo, autor, tamaño, formato, isbn, paginas));
                System.out.println("Libro añadido con éxito.");
                break;

            case 2: // Video
                System.out.println("Introduce el nombre del director:");
                String nombreDirector = sc.nextLine();
                System.out.println("Introduce el DNI del director:");
                String dniDirector = sc.nextLine();
                Persona director = new Persona(nombreDirector, dniDirector);

                ArrayList<Persona> actores = new ArrayList<>();
                System.out.println("Introduce el número de actores:");
                int numActores = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer

                for (int i = 0; i < numActores; i++) {
                    System.out.println("Introduce el nombre del actor " + (i + 1) + ":");
                    String nombreActor = sc.nextLine();
                    System.out.println("Introduce el DNI del actor " + (i + 1) + ":");
                    String dniActor = sc.nextLine();
                    actores.add(new Persona(nombreActor, dniActor));
                }

                coleccion.add(new Video(id, titulo, autor, tamaño, formato, director, actores));
                System.out.println("Video añadido con éxito.");
                break;

            case 3: // Audio
                System.out.println("Introduce la duración del audio (en segundos):");
                int duracion = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer

                System.out.println("Introduce el soporte:");
                String soporte = sc.nextLine();
                coleccion.add(new Audio(id, titulo, autor, tamaño, formato, duracion, soporte));
                System.out.println("Audio añadido con éxito.");
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }

    // Eliminar un elemento multimedia de la colección por su ID
    public void eliminarMultimedia(String id) {
        for (Multimedia m : coleccion) {
            if (m.getId().equals(id)) {
                coleccion.remove(m);
                System.out.println("Elemento eliminado con éxito.");
                return;
            }
        }
        System.out.println("No se encontró un elemento con ese ID.");
    }

    // Listar todos los elementos de un tipo específico
    public void listarVideos() {
        for (Multimedia m : coleccion) {
            if (m instanceof Video) {
                System.out.println(m);
            }
        }
    }

    public void listarAudios() {
        for (Multimedia m : coleccion) {
            if (m instanceof Audio) {
                System.out.println(m);
            }
        }
    }

    public void listarTodos() {
        for (Multimedia m : coleccion) {
            System.out.println(m);
        }
    }

    // Buscar por autor
    public void buscarPorAutor(String autor) {
        for (Multimedia m : coleccion) {
            if (m.getAutor().equalsIgnoreCase(autor) && m instanceof Libro) {
                System.out.println("Título: " + m.getTitulo());
            }
        }
    }

    // Buscar por actor
    public void buscarPorActor(String actor) {
        for (Multimedia m : coleccion) {
            if (m instanceof Video) {
                Video video = (Video) m;
                for (Persona p : video.getActores()) {
                    if (p.getNombre().equalsIgnoreCase(actor)) {
                        System.out.println("Título: " + m.getTitulo());
                    }
                }
            }
        }
    }

    // Buscar por director
    public void buscarPorDirector(String director) {
        for (Multimedia m : coleccion) {
            if (m instanceof Video && ((Video) m).getDirector().getNombre().equalsIgnoreCase(director)) {
                System.out.println("Título: " + m.getTitulo());
            }
        }
    }

    // Comprobar si ya existe un multimedia con el mismo ID
    public boolean existeMultimedia(String id) {
        for (Multimedia m : coleccion) {
            if (m.getId().equals(id)) {
                return true; // El ID ya existe
            }
        }
        return false; // El ID no existe
    }
}
