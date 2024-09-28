/*3. Determinar si un número natural de 4 dígitos (entre 1000 y 9999)
es capicúa. Se comprobará previamente que el número introducido tiene 4 dígitos.
En la salida se mostrará uno de los siguientes mensajes:
    1. “El número no tiene 4 dígitos”;
    2. “Es capicúa”
    3. “No es capicúa”.
    - * Un número es capicúa cuando se lee igual de izquierda a derecha que de
    derecha a izquierda*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite un numero (entre 1000 y 9999): ");
        numero = entrada.nextInt();

        if(numero < 1000 || numero > 9999){
            System.out.println("El número no tiene 4 dígitos");
        }
        else {
            // Invertir el número
            int original = numero;
            int invertido = 0;

            while(numero != 0) {
                int digito = numero % 10;
                invertido = invertido * 10 + digito;
                numero /= 10;
            }

            if(original == invertido) {
                System.out.println("Es capicúa");
            } else {
                System.out.println("No es capicúa");
            }
        }
    }
}