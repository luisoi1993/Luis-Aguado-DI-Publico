/*Hágase un programa que lea dos enteros y compruebe si el primero es o
 no mayor que el segundo. En la salida se mostrará “El primero es mayor
  que el segundo” o “El primero no es mayor que el segundo”.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite el valor del primer número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite el valor del segundo número: ");
        num2 = entrada.nextInt();

        if (num1 == num2) {
            System.out.println("Los dos números son iguales.");
        } else if (num1 > num2) {
            System.out.println("El primero es mayor que el segundo.");
        } else {
            System.out.println("El primero no es mayor que el segundo.");
        }
    }
}
