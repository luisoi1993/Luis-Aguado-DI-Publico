/*Realiza un programa que lee enteros pares hasta introducir un impar.
El programa cuenta el número de positivos de los números leído y lo mostrará
cuando se introduzca un impar*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int positivos = 0;

        System.out.println("Introduce números enteros. El programa se detendrá al introducir un número impar.");
        do{
            System.out.println("Digite un número: ");
            numero = entrada.nextInt();
            if(numero > 0){
                positivos++;
            }

        }while(numero % 2 == 0);

        System.out.println("Cantidad de números positivos introducidos: " + positivos);
    }
}