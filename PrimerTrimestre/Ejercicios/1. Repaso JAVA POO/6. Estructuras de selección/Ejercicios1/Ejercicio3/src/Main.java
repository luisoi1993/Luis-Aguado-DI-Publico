/*3. Pedir por teclado un entero y guardarlo en una variable llamada a.
 Comprobar los siguientes casos:
    1. Si es menor que 10 imprimir:
        1. Si es menor que 0 imprimir el mensaje "negativo"
        2. Si es menor que 10 imprimir el mensaje "un dígito"
    2. Si es menor que 99 imprimir el mensaje "dos dígitos"
    3. Si es mayor que 99 imprimir el mensaje "tres dígitos"*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;

        System.out.println("Digite el valor de a: ");
        a = entrada.nextInt();

        if(a < 10){
            if(a < 0){
                System.out.println("negativo");
            }
            else{
                System.out.println("un dígito");
            }
        }
        else if(a < 100){
            System.out.println("dos dígitos");
        }
        else{
            System.out.println("tres dígitos o mas");
        }
    }
}