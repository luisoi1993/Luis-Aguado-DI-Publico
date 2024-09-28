/*Leer números enteros hasta introducir un 0. El programa obtendrá
la suma de todos
los números positivos.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;

        do{
            System.out.println("Digite un numero: ");
            numero = entrada.nextInt();

            if(numero > 0){
                suma = numero + suma;
            }
        }while(numero != 0);

        System.out.println(suma);
    }
}