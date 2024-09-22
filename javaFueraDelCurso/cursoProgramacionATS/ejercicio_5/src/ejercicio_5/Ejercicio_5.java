/*La calificacion final de un estudiante de informatica se calcula con  base
a las calificaciones de cuatro aspectos de su rendimiento academico:participacion
, primer examen parcial, segundo examen parcial y examen final. Sabiendo que 
las calificaciones anteriores entran a la calificacion final con ponderaciones
del 10%, 25%  y 40%. Hacer un programa que calcule e imprima la calificacion final
obtenida por un estudiante

 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
        
        System.out.println("Digite la nota de participacion: ");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del primer examen parcial: ");
        primerExamen=entrada.nextFloat();
        System.out.println("Digite la nota del segundo examen parcial: ");
        segundoExamen=entrada.nextFloat();
        System.out.println("Digite la nota del examen final: ");
        examenFinal=entrada.nextFloat();
        
        participacion  *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;
        
        notaFinal= participacion + primerExamen + segundoExamen + examenFinal;
        
        System.out.println("\n la nota final es "+notaFinal);
        
    }
    
}
