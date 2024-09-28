/*Pedir 10 sueldos. Mostrar su suma, media y cuantos hay
mayores de 1000€.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sueldo, suma = 0, mayoresMil = 0;
        float media;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite el sueldo: " + (i + 1));
            sueldo = entrada.nextInt();
            suma += sueldo;

            if (sueldo > 1000) {
                mayoresMil++;
            }
        }

        media = (float) suma / 10;

        System.out.println("La suma total es: " + suma);
        System.out.println("La media es: " + media);
        System.out.println("El número de sueldos mayores de mil es: " + mayoresMil);
    }
}
