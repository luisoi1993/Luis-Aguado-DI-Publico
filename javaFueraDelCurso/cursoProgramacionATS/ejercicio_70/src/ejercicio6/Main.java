/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author luis
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la parte real del primer número complejo:");
        double real1 = scanner.nextDouble();
        System.out.println("Ingrese la parte imaginaria del primer número complejo:");
        double imaginaria1 = scanner.nextDouble();
        NumeroComplejo num1 = new NumeroComplejo(real1, imaginaria1);
        
        System.out.println("Ingrese la parte real del segundo número complejo:");
        double real2 = scanner.nextDouble();
        System.out.println("Ingrese la parte imaginaria del segundo número complejo:");
        double imaginaria2 = scanner.nextDouble();
        NumeroComplejo num2 = new NumeroComplejo(real2, imaginaria2);

        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Sumar dos números complejos.");
            System.out.println("2. Multiplicar dos números complejos.");
            System.out.println("3. Comparar dos números complejos (iguales o no).");
            System.out.println("4. Multiplicar un número complejo por un entero.");
            System.out.println("5. Salir.");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    NumeroComplejo suma = num1.sumar(num2);
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    NumeroComplejo producto = num1.multiplicar(num2);
                    System.out.println("El producto es: " + producto);
                    break;
                case 3:
                    boolean sonIguales = num1.esIgual(num2);
                    System.out.println("Los números complejos son " + (sonIguales ? "iguales." : "diferentes."));
                    break;
                case 4:
                    System.out.println("Ingrese el entero por el cual quiere multiplicar:");
                    int entero = scanner.nextInt();
                    NumeroComplejo multiplicacionPorEntero = num1.multiplicarPorEntero(entero);
                    System.out.println("El resultado es: " + multiplicacionPorEntero);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
