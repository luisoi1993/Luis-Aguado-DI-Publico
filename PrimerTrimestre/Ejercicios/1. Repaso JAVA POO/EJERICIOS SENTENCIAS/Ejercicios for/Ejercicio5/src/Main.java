/*Dado dos enteros entre 0 y 5 (la base y el exponente), obtener la
 potencia del primero elevado al segundo sin utilizar el método
 “pow”. Por ejemplo, base = 3 y exponente = 5, 35=3x3x3x3x3=243.
 Casos particulares: 00 = Error y n0 = 1. No se puede utilizar la libreria Math */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base, exponente, resultado = 1;

        System.out.println("Digite la base: ");
        base = entrada.nextInt();
        System.out.println("Digite el exponente: ");
        exponente = entrada.nextInt();

        if(base == 0 && exponente == 0){
            System.out.println("Error: 0^0 no está definido.");
        } else {
            for(int i = 0; i < exponente; i++){
                resultado *= base;
            }

            System.out.println(base + "^" + exponente + " = " + resultado);
        }
    }
}
