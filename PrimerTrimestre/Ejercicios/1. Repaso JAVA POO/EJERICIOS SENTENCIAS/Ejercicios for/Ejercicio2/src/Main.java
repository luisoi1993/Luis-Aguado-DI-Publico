/*Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de
dicho número con el formato: 5 x 3 = 15
(desde 0 hasta 10 en líneas distintas)*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do{
            System.out.println("Digite un numero: ");
            numero = entrada.nextInt();
        }while(numero < 0 || numero > 10);

        for(int i = 0;i < 11; i++){
            System.out.println(numero + "  x " + i + "  = " + (numero * i));
        }
    }
}