/*
 Leer 5 elementos numericos que se introduciran ordenados de forma creciente.
Estos los guardaremos en una tabla de tamaño 10. Leer un numero N, e insertarlo
en el lugar adecuado para que la tabla continue ordenada
 */
package ejercicio_54;

import java.util.Scanner;

public class Ejercicio_54 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero, sitio_num = 0, j = 0;
        
        System.out.println("Llenar el arreglo");
        do {
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + " Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
           
            // Comprobar si el arreglo está ordenado de forma creciente
            creciente = true;
            for (int i = 0; i < 4; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    creciente = false;
                    break;
                }
            }
           
            if (!creciente) {
                System.out.println("El arreglo no está ordenado de forma creciente, vuelva a digitarlo");
            }
        } while (!creciente);
       
        System.out.println("\nDigite un elemento a insertar: ");
        numero = entrada.nextInt();
        
        // Encontrar la posición adecuada para insertar el número
        sitio_num = 0;
        while (sitio_num < 5 && arreglo[sitio_num] < numero) {
            sitio_num++;
        }
        
        // Desplazar los elementos para hacer espacio para el nuevo número
        for (int i = 4; i >= sitio_num; i--) {
            arreglo[i + 1] = arreglo[i];
        }
        
        // Insertar el nuevo número
        arreglo[sitio_num] = numero;
        
        System.out.print("\nEl arreglo queda: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
