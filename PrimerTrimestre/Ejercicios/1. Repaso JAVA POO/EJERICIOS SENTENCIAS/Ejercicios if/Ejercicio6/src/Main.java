/*Pedir el día, mes y año de una fecha e indicar si la fecha es
 correcta.
 Con meses de 28, 30 y 31 días. Sin años bisiestos.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, anio;

        System.out.println("Digite el día: ");
        dia = entrada.nextInt();
        System.out.println("Digite el número del mes: ");
        mes = entrada.nextInt();
        System.out.println("Digite el año: ");
        anio = entrada.nextInt();

        if (anio < 0 || anio > 2024) {
            System.out.println("El año es incorrecto.");
        } else {
            if (mes < 1 || mes > 12) {
                System.out.println("El mes es incorrecto.");
            } else {
                if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)) {
                    System.out.println("Este mes no puede tener más de 30 días.");
                } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia < 1 || dia > 31)) {
                    System.out.println("Este mes no puede tener más de 31 días.");
                } else if (mes == 2 && (dia < 1 || dia > 28)) {
                    System.out.println("Febrero no puede tener más de 28 días.");
                } else {
                    System.out.println("La fecha es correcta.");
                }
            }
        }
    }
}
