/*
 Crear un programa que lea por teclado una tabla de 10 numeros enteros y desplace
n posiciones en el arreglo(n es digitado por el usuario)
 */
package ejercicio_53;

/**
 *
 * @author luis
 */

    import java.util.Scanner;
public class Ejercicio_53 {





    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int n;

        // Leer los 10 números
        System.out.println("Digite 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        // Pedir el número de posiciones a desplazar
        System.out.print("Digite el número de posiciones a desplazar: ");
        n = entrada.nextInt();

        // Asegurarse de que n no sea mayor que el tamaño del arreglo
        n = n % 10;

        // Desplazar el arreglo n posiciones
        int[] arregloTemporal = new int[10];

        for (int i = 0; i < 10; i++) {
            arregloTemporal[(i + n) % 10] = arreglo[i];
        }

        // Copiar el arreglo temporal al arreglo original
        System.arraycopy(arregloTemporal, 0, arreglo, 0, 10);

        // Mostrar el arreglo desplazado
        System.out.println("Arreglo desplazado:");
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
