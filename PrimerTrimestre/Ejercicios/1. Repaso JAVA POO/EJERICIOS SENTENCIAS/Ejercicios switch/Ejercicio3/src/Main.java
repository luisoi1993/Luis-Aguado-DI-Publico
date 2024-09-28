/*Realiza un programa que pida al usuario ingresar un carácter que
represente una operación matemática (+, -, *, /) y dos números. Luego,
utiliza una sentencia switch para realizar la operación correspondiente
y mostrar el resultado.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, resultado = 0;
        char operacion;

        System.out.println("Digite un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Digite el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Digite la operacion: (+, -, *, /) ");
        operacion = entrada.next().charAt(0);

        switch (operacion){
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;

        }

        System.out.println(num1 + " " + " "+ operacion + " " + num2 + " " + resultado );
    }
}