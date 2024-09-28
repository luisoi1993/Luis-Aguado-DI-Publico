/*Calcúlese el mínimo común múltiplo de dos números entre 1 y 100.
 Para obtener el mcm se tomará uno de los valores introducidos y se irá
  multiplicando por 1, 2, 3, etc, hasta que el valor obtenido sea múltiplo
  del otro número, que sería el valor buscado. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;

        do{
            System.out.println("Digite el valor del primer numero: ");
            num1 = entrada.nextInt();

        }while(num1 < 1 || num1 > 100);

        do{
            System.out.println("Digite el valor del segundo numero: ");
            num2 = entrada.nextInt();

        }while(num2 < 1 || num2 > 100);

        int mcm = num1; // Comenzar con el primer número
        int multiplier = 1;

        // Encontrar el mcm multiplicando num1 por 1, 2, 3, etc.
        while (mcm % num2 != 0) {
            multiplier++;
            mcm = num1 * multiplier; // Multiplicar num1 por el multiplicador
        }

        // Mostrar el resultado
        System.out.println("El mínimo común múltiplo de " + num1 + " y " + num2 + " es: " + mcm);
    }
}