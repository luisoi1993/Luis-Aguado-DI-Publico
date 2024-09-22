/*
 Leer 5 numeros guardarlos en un arreglo y mostrarlos en el orden inverso al
introducido
 */
package ejercicio_45;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int []numeros = new int[5];
        
        for(int i=0;i<5;i++){
            System.out.println((i+1)+"Digite un numero: ");
            numeros[i]=entrada.nextInt();
        }
        
       System.out.println("Los números (en orden inverso):");
		 for (int i=4;i>=0;i--)
		 System.out.println(numeros[i]);
        
        
    }
    
}
