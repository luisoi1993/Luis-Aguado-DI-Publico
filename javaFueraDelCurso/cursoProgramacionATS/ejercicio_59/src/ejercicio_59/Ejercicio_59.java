/*
 Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma
 */
package ejercicio_59;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][]= new int[3][3];
        int matriz2[][] = new int[3][3];
        int matriz3[][] = new int[3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Digite la posicion "+i+" "+j);
                matriz[i][j]=entrada.nextInt();
            }
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Digite la posicion "+i+" "+j);
                matriz2[i][j]=entrada.nextInt();
            }
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               matriz3[i][j]=matriz[i][j]+matriz2[i][j];
                
            }
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("posicion "+i+" "+j+" "+matriz3[i][j]);
                
            }
        }
        
        
    }
    
}
