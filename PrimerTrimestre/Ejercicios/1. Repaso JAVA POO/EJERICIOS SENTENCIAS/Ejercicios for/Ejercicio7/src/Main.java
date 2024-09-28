/*Pedir 10 números. Mostrar la media de los números positivos,
la media de los números negativos y la cantidad de ceros */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
        float totalPositivos = 0, totalNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite el número: " + (i + 1));
            numero = entrada.nextInt();

            if (numero > 0) {
                totalPositivos += numero;
                contadorPositivos++;
            } else if (numero < 0) {
                totalNegativos += numero;
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        if (contadorPositivos > 0) {
            System.out.println("La media de los números positivos es: " + (totalPositivos / contadorPositivos));
        } else {
            System.out.println("No se introdujeron números positivos.");
        }

        if (contadorNegativos > 0) {
            System.out.println("La media de los números negativos es: " + (totalNegativos / contadorNegativos));
        } else {
            System.out.println("No se introdujeron números negativos.");
        }

        System.out.println("El número total de ceros es: " + contadorCeros);
    }
}
