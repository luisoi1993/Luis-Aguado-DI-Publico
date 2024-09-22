/*
 Diseñar una aplicacion que declare una tabla de 10 elementos enteros. Leer 
mediante el teclado 8 numeros. Despues se debe pedir un numero y una posicion,
insertarlo en la posicion indicada, desplazando los que esten detras
 */
package ejercicio_51;

import java.util.Scanner;

public class Ejercicio_51 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int numero, posicion;
        
        // Leer los primeros 8 números
        for (int i = 0; i < 8; i++) {
            System.out.println((i + 1) + " Digite un numero:");
            arreglo[i] = entrada.nextInt();
        }
        
        // Pedir el número y la posición
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        System.out.println("Digite una posicion (0-9): ");
        posicion = entrada.nextInt();
        
        // Desplazar los elementos desde la posición indicada
        for (int i = 8; i > posicion; i--) {
            arreglo[i] = arreglo[i - 1];
        }
        
        // Insertar el nuevo número en la posición indicada
        arreglo[posicion] = numero;
        
        // Mostrar el arreglo final
        System.out.println("Arreglo final:");
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
