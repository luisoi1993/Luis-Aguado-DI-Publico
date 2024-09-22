package ejercicio_57;

import java.util.Scanner;

public class Ejercicio_57 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo1[] = new int[10];
        int arreglo2[] = new int[10];
        boolean orden;

        // Llenar el primer arreglo
        do {
            orden = true; // Reiniciar el estado de orden para el siguiente intento
            System.out.println("Primer arreglo");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + " Digite un numero: ");
                arreglo1[i] = entrada.nextInt();
            }

            for (int i = 0; i < 9; i++) {
                if (arreglo1[i] > arreglo1[i + 1]) {
                    orden = false;
                    System.out.println("Tienes que digitar los numeros de forma ascendente.");
                    break;
                }
            }
        } while (!orden);

        // Llenar el segundo arreglo
        do {
            orden = true; // Reiniciar el estado de orden para el siguiente intento
            System.out.println("Segundo arreglo");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + " Digite un numero: ");
                arreglo2[i] = entrada.nextInt();
            }

            for (int i = 0; i < 9; i++) {
                if (arreglo2[i] > arreglo2[i + 1]) {
                    orden = false;
                    System.out.println("Tienes que digitar los numeros de forma ascendente.");
                    break;
                }
            }
        } while (!orden);

        // Fusionar los dos arreglos en uno tercero
        int arreglo3[] = new int[20];
        int contador1 = 0, contador2 = 0, i = 0;

        while (contador1 < 10 && contador2 < 10) {
            if (arreglo1[contador1] < arreglo2[contador2]) {
                arreglo3[i] = arreglo1[contador1];
                contador1++;
            } else {
                arreglo3[i] = arreglo2[contador2];
                contador2++;
            }
            i++;
        }

        // Copiar los elementos restantes del primer arreglo, si hay
        while (contador1 < 10) {
            arreglo3[i] = arreglo1[contador1];
            contador1++;
            i++;
        }

        // Copiar los elementos restantes del segundo arreglo, si hay
        while (contador2 < 10) {
            arreglo3[i] = arreglo2[contador2];
            contador2++;
            i++;
        }

        // Mostrar el arreglo fusionado
        System.out.println("Arreglo fusionado: ");
        for (i = 0; i < 20; i++) {
            System.out.print(arreglo3[i] + " ");
        }
        System.out.println();
    }
}
