/*
 una compañia de venta de carros usados, paga a su personal de ventas un salario
de 1000$ mensuales , mas una comision de $150 por cada uno, mas el 5% del valor 
de la venta  por carro. Cada mes el capturista de la empresa ingresa en la 
computadora los datos pertinentes. Hacer un programa que calcule e imprima el
salario mensual de un vendedor dado.
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float  numcoches, valorventa,totalnumcoches,totalvalorventa,total;
        
        System.out.println("digite el numero de coches vendidos: ");
        numcoches=entrada.nextFloat();
        
        System.out.println("digite el valor total de todos los coches: ");
        valorventa=entrada.nextFloat();
        
        totalnumcoches= numcoches * 150;
        
        totalvalorventa=valorventa /100 *5;
        
        total =1000+totalnumcoches+totalvalorventa;
        
        System.out.println("El salaario del empleado es : "+total+"$");
        
                
                
                
                
                
                
                
    }
    
}
