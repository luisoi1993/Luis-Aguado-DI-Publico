/*Modificar el ejercicio anterior para calcular la tabla de
multiplicar de los números comprendidos en un rango de números pedidos.
 Por ejemplo, las tablas de los números comprendidos entre el 3
  y el 7 (3,4,5,6,7)*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int principioRango , finalRango;

        System.out.println("Digite el inicio del rango");
        principioRango = entrada.nextInt();
        System.out.println("Digite el final del rango: ");
        finalRango = entrada.nextInt();


        for(int j = principioRango;j <= finalRango ;j++){
            for(int i = 0;i < 11; i++){
                System.out.println(j + "  x " + i + "  = " + (j * i));
            }
            System.out.println();
        }

    }
}