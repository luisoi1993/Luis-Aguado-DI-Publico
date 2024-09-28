/*Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0.
 El programa mostrará cada uno de los datos generados y obtendrá
 el mayor de los números generados.*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int aleatorio , numMaximo = 0;

        do{
            aleatorio = random.nextInt(101);
            System.out.println(aleatorio);
            if(numMaximo < aleatorio){
                numMaximo = aleatorio;
            }
        }while(aleatorio != 0);

        System.out.println(numMaximo);
    }
}