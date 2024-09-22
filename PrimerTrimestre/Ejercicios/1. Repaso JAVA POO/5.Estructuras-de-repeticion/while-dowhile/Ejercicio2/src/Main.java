/*Generar números aleatorios entre 0 y 1000 hasta obtener un cero
(momento en el cual el programa terminará), y contabilizar cuántos de
ellos son pares. Al final del programa se mostrará cuantos
pares se han obtenido*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int pares = 0;
        int numeroAleatorio;

        System.out.println("Inicia el programa: ");

        do{
            numeroAleatorio = aleatorio.nextInt(1001);
            System.out.println(numeroAleatorio);
            if(numeroAleatorio % 2 == 0){
                pares++;
            }
        }while(numeroAleatorio != 0);

        System.out.println("El numero de pares es : " + pares);
    }
}