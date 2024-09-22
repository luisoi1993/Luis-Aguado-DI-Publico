/*
 crear una matriz de tmaño 7x7 y rellenarla de forma que los elementos de la 
diagonal principal sean 1 y el resto 0
 */
package ejercicio_61;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][]= new int[7][7];
        int diagonal =0;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(j==diagonal){
                    matriz[i][j]=1;
                    
                }
                else{
                    matriz[i][j]=0;
                }
                
            }
            diagonal++;
        }
        
        System.out.println("Mostramos el resultado: ");
        
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
    
}
