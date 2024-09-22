/*
 crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla
 */
package ejercicio_60;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        
        System.out.println("Digite la matriz");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matriz ["+i+"] ["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        
        System.out.println("\nMatriz original: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        int aux;
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                aux= matriz[i][j];
                matriz[i][j]= matriz[j][i];
                matriz[j][i]= aux;
            }
        }
        
        System.out.println("\n La matriz traspuesta es : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
