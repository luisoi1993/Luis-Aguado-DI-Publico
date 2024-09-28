/*Crea un programa que permita al usuario ingresar un carácter y
determine si es una vocal o una consonante utilizando una sentencia switch.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.println("Digite una letra: ");
        letra = entrada.next().charAt(0);
        letra = Character.toLowerCase(letra);

        switch(letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal: ");
                break;
            default:
                System.out.println("Es una consonante: ");
        }
    }
}