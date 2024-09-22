/*
 construir un programa que calcule y muestre por pantalla las raices de la
ecuacion de segundo grado de coeficientes reales
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a = (Math.random()*100), b=(Math.random()*100), c = (Math.random()*100),resultadoP,resultadoN;
        
        resultadoP=(- b Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        resultadoN=(- b - Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        
        System.out.println("El resultado positivo es: "+resultadoP);
        System.out.println("El resultado negativo es: "+resultadoN);
    }
    
}
