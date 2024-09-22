/*
 Leer 10 numeros enteros, guardarlos en un arreglo. Debemos mostrarlos en el 
siguiente orden: el primero, el ultimo, el segundo, el penultimo, el tercero,
etc
 */
package ejercicio_47;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        int inicio=0,fin=9;
        
        for(int i=0;i<10;i++){
            System.out.println((i+1)+"Digite un numero: ");
            numeros[i]=entrada.nextInt();
            
        }
        
        while(inicio<=fin){
            
            System.out.println(numeros[inicio]);
            inicio++;
            System.out.println(numeros[fin]);
            fin--;
        }
    }
    
}
