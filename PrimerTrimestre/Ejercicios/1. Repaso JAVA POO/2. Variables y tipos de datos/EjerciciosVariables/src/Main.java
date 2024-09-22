/*1. Declara una variable entera llamada "edad" con un valor inicial de 25.
2. Declara una variable booleana llamada "esVerdadero" con un valor inicial de true.
3. Declara una variable de cadena llamada "nombre" con un valor inicial de "Juan".
4. Declara una variable de doble precisión llamada "pi" con un valor inicial de 3.1416.
5. Declara una constante de entero llamada "MAX_EDAD" con un valor de 100. */

public class Main {
    public static void main(String[] args) {
        int edad = 25;
        boolean esVerdadero = true;
        String nombre = "Juan";
        Double pi = 3.1416;
        final int MAX_EDAD = 100;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Es verdadero: " + esVerdadero);
        System.out.println("Valor de pi: " + pi);
        System.out.println("Máxima edad permitida: " + MAX_EDAD);
    }
}