/*Escribe un programa que solicite al usuario ingresar un número del
1 al 12 y muestre la estación del año correspondiente
(por ejemplo, "Primavera", "Verano", "Otoño", "Invierno") utilizando
 una sentencia switch.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite el numero del mes: (1-12)");
        numero = entrada.nextInt();

        switch(numero){
            case 3:
            case 4:
            case 5:
                System.out.println("Primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Verano");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Otoño");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Invierno");
                break;
            default:
                System.out.println("Número inválido. Por favor, ingrese un número entre 1 y 12.");
                break;
        }

    }
}