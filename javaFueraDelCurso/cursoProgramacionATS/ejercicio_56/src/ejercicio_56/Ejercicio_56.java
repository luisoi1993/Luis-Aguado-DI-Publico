/*
 Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares de la
primera, y a continuacion los elementos impares
 */
package ejercicio_56;

import java.util.Scanner;

public class Ejercicio_56 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int conteo_pares = 0, conteo_impares = 0;

        System.out.println("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " Digite un numero: ");
            arreglo[i] = entrada.nextInt();

            if (arreglo[i] % 2 == 0) {
                conteo_pares++;
            } else {
                conteo_impares++;
            }
        }

        int par[] = new int[conteo_pares];
        int impar[] = new int[conteo_impares];

        // Reiniciar los contadores para usarlos como índices
        conteo_pares = 0;
        conteo_impares = 0;

        for (int i = 0; i < 10; i++) {
            if (arreglo[i] % 2 == 0) {
                par[conteo_pares] = arreglo[i];
                conteo_pares++;
            } else {
                impar[conteo_impares] = arreglo[i];
                conteo_impares++;
            }
        }

        System.out.println("\nArreglo pares: ");
        for (int i = 0; i < par.length; i++) {
            System.out.print(par[i] + " - ");
        }
        System.out.println("");

        System.out.println("\nArreglo impares: ");
        for (int i = 0; i < impar.length; i++) {
            System.out.print(impar[i] + " - ");
        }
        System.out.println("");

        // Crear un arreglo final que contenga primero los pares y luego los impares
        int resultado[] = new int[10];
        int index = 0;

        for (int i = 0; i < par.length; i++) {
            resultado[index] = par[i];
            index++;
        }
        for (int i = 0; i < impar.length; i++) {
            resultado[index] = impar[i];
            index++;
        }

        System.out.println("\nArreglo final con pares e impares: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " - ");
        }
        System.out.println("");
    }
}
