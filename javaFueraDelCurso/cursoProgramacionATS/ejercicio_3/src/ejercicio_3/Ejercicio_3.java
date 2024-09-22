/*
 guillermo tiene n dolares. Luis tiene la mitad de lo que posee guillermo.
juan tiene la mitad de lo que poseen luis y guillermo juntos. Hacer un programa
que calcule e imprima la cantidad de dinero que tienen entre los tres 
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
4        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan , total;
        
        System.out.println("Digite la cantidad de dinero que tiene guillermo");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2;
        juan = (guillermo+luis)/2;
        
        total = guillermo+luis+juan;
        
        System.out.println("\nLa cantidad de dinero enre los 3 es :"+total);
    }
    
}
