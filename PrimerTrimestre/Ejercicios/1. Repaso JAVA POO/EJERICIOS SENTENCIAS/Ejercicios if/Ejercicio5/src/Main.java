/*5. Leer un número entero, se realizarán las siguientes acciones:
    - incrementará en 2 unidades si es par
    - en 3 unidades si es múltiplo de 3
    - en 5 unidades si es múltiplo de 5
    - en el caso de no cumplirse ninguna de las anteiores,
    se incrementará en una unidad.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite un numero: ");
        num = entrada.nextInt();

        if(num % 2 == 0){
            num = num +2;
        }
        else if(num % 3 == 0){
            num = num + 3;
        }
        else if(num % 5 == 0){
            num = num + 5;
        }
        else{
            num++;
        }
        System.out.println(num);
    }
}