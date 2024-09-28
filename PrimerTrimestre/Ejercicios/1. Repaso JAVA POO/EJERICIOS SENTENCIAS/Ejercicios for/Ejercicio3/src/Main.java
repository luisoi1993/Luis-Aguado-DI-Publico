/*Modificar el ejercicio anterior para calcular la tabla de
multiplicar de todos los números*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        for(int j = 0;j < 11;j++){
            for(int i = 0;i < 11; i++){
                System.out.println(j + "  x " + i + "  = " + (j * i));
            }
            System.out.println();
        }

    }
}