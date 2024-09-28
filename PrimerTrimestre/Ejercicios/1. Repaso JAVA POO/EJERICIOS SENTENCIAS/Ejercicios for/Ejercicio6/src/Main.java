/*Mostrar todos los números pares comprendidos entre dos dados*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite el primer número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite el segundo número: ");
        num2 = entrada.nextInt();

        // Asegurarse de que num1 sea menor o igual que num2
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Números pares entre " + num1 + " y " + num2 + ":");
        boolean hayPares = false;

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                hayPares = true;
            }
        }

        if (!hayPares) {
            System.out.println("No hay números pares en este rango.");
        }
    }
}
