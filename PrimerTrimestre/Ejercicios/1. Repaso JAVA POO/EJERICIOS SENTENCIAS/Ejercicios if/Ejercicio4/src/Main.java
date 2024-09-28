/*Se lee un número entero. Dicho número se incrementará en una
unidad si es par, y se decrementará en una
unidad si es impar. Se muestra por consola el nuevo valor del número.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();

        if(numero % 2 == 0){
            numero++;
        }
        else{
            numero--;
        }

        System.out.println(numero);
    }
}