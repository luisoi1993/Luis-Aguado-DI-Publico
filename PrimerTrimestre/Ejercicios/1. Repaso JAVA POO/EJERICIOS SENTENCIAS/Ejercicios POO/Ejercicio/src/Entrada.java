import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer datos de la primera persona (p1)
        System.out.println("Introduce el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el apellido:");
        String apellido = scanner.nextLine();
        System.out.println("Introduce el dni:");
        String dni = scanner.nextLine();
        System.out.println("Introduce la edad:");
        int edad = scanner.nextInt();
        System.out.println("Introduce el peso:");
        double peso = scanner.nextDouble();
        System.out.println("Introduce la altura en cm:");
        int altura = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.println("Introduce el género (hombre/mujer):");
        String genero = scanner.nextLine();

        // Crear la persona p1 con todos los datos
        Persona p1 = new Persona(nombre, apellido, dni, edad, peso, altura, genero);

        // Crear una persona con solo nombre y apellido
        Persona p2 = new Persona("Ana", "Pérez");

        // Crear una persona sin datos asociados
        Persona p3 = new Persona();

        // Mostrar los datos de todas las personas
        System.out.println("Persona 1:");
        p1.mostrarEstadoFisico();

        System.out.println("Persona 2:");
        p2.mostrarEstadoFisico();

        System.out.println("Persona 3:");
        p3.mostrarEstadoFisico();

        // Modificar la edad de todas las personas a 20
        p1.setEdad(20);
        p2.setEdad(20);
        p3.setEdad(20);
    }
}
