/*Realizar un programa que lea por teclado 10 números y los sume.
Al final del proceso mostrará la suma total*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite el numero " + (i+1));
            numero = entrada.nextInt();
            suma = numero + suma;
        }

        System.out.println("La suma total es: " + suma);

    }
}