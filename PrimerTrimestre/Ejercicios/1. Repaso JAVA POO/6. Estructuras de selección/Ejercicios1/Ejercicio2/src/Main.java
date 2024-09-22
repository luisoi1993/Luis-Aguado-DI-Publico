/*Pedir por teclado un entero y guardarlo en una variable llamada a.
Comprobar si “a” es par o menor que 10 o menor que 100. De ser par,
 se incrementa en una unidad “a”; de no ser par, si es menor que 10,
 se decrementa “a” en una unidad; de no ser par, ni ser menor que 10,
 si es menor que 100, se duplica el valor de “a” y se incrementa en una unidad;
 de no ser par, ni menor que 10, ni menor que 100, entonces se le asigna a “a” el
 valor de 0. Al final del bloque mostrar el valor de la por pantalla*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;

        System.out.println("Digite el valor de a: ");
        a = entrada.nextInt();

        if(a % 2 == 0){
            a++;
        }
        else{
            if(a < 10){
                a--;
            }
            else{
                if(a < 100){
                    a = a * 2;
                    a++;
                }
                else{
                    a = 0;
                }
            }
        }

        System.out.println(a);
    }
}