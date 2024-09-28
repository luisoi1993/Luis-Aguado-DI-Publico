/*Desarrolla un programa que reciba un número entero y,
utilizando una sentencia switch, determine si es par o impar*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,esPar;

        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        esPar = numero % 2;

        switch(esPar){
            case 0:
                System.out.println("El numero es par: ");
                break;
            default:
                System.out.println("El numero es impar: ");
                break;
        }
    }
}