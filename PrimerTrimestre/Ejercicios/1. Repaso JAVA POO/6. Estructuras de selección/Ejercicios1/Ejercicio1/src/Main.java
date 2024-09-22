/*Pedir por teclado un entero y guardarlo en una variable llamada a.
Comprobar si “a” es par. De serlo, se almacena en la cadena “s”
el texto “Es par”. Al final del bloque mostrar el mensaje por pantalla*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String a = "Es par ";

        System.out.println("Digite un numero: ");
        int numero = entrada.nextInt();

        if(numero % 2 == 0){
            a = "Es par ";
            a = a + numero;
        }
        else{
            a = "Es impar ";
            a = a + numero;
        }

        System.out.println(a);

    }
}