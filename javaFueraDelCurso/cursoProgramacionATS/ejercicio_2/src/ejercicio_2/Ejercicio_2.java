/*
 hacer un programa que calcule e imprima el salario semanal de un empleado
a partir de sus horas semanales trabajadas y de su salario por hora
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float horas ,dinerohora, total;
        
        System.out.println("Digite el numero de horas");
        horas = entrada.nextFloat();
        System.out.println("Digite el dinero que recibes cada hora");
        dinerohora=entrada.nextFloat();
        
        total=horas*dinerohora;
        
        System.out.println("el dinero total es :"+total);
    }
    
}
