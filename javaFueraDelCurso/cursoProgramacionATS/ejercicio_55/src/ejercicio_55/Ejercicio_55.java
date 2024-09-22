/*
 leer por teclado una tabla de 10 elementos numericos enteros y una posicion
entre 0 y 9. Eliminar el elemento situado en la posicion dada sin dejar huecos
 */
package ejercicio_55;

import java.util.Scanner;

public class Ejercicio_55 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int posicion;
        
        // Leer 10 números enteros
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        // Leer la posición a borrar (debe estar entre 0 y 9)
        do {
            System.out.println("Digite la posicion a borrar entre 0 y 9");
            posicion = entrada.nextInt();
        } while (posicion < 0 || posicion > 9);
        
        // Desplazar los elementos para eliminar el elemento en la posición dada
        for (int i = posicion; i < 9; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        
        // Llenar el último elemento con un valor específico, opcionalmente
        arreglo[9] = 0; // O cualquier otro valor que indique que el espacio está vacío
        
        // Mostrar el arreglo después de la eliminación
        System.out.println("El arreglo después de eliminar el elemento es:");
        for (int i = 0; i < 9; i++) { // Imprimir solo los primeros 9 elementos
            System.out.println(arreglo[i]);
        }
    }
}
