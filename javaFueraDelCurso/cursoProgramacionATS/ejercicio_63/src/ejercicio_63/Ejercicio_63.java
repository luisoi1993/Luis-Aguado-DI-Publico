/*
 utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y trasponerla
en la segunda
 */
package ejercicio_63;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1[][]= new int[5][9];
        int matriz2[][]= new int[9][5];
        
        System.out.println("Digtar la matriz");
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                System.out.println("Digite el valor de : "+i+" "+j);
                matriz1[i][j]=entrada.nextInt();
            }
        }
        
        for(int i=0;i<9;i++){
            for(int j=0;j<5;j++){
               
                matriz2[i][j]=matriz1[j][i];
                
                
            }
        }
        
        System.out.println("Mostramos la tabla: ");
        for(int i=0;i<9;i++){
            for(int j=0;j<5;j++){
                System.out.println(i+" "+j+" "+matriz2[i][j]);
            }
        }
    }
    
}
