/*
 leer los datos correspondientes a dos tablas de 12 elementos numericos y
mezclarlos en una tecera de la forma: 3 de la tabla a, 3 de la b , otros 3 dee a
otros 3 de b
 */
package ejercicio_49;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];
        
        a = new int[12];
        b = new int[12];
        c = new int[24];
        
        System.out.println("Primer arreglo: ");
        for(int i=0;i<12;i++){
            System.out.println("Digite un numero: ");
            a[i]=entrada.nextInt();
        }
        
        System.out.println("Segundo arreglo: ");
        for(int i=0;i<12;i++){
            System.out.println("Digite un numero: ");
            b[i]=entrada.nextInt();
        }
        
        int j=0, ai=0,bi=0;
        for(int i=0;i<4;i++){
            c[j]=a[ai];
            j++;
            ai++;
            
            c[j]=a[ai];
            j++;
            ai++;
            
            c[j]=a[ai];
            j++;
            ai++;
            
            c[j]=b[bi];
            j++;
            bi++;
            
             c[j]=b[bi];
            j++;
            bi++;
            
             c[j]=b[bi];
            j++;
            bi++;
            
        }
        
        System.out.println("Mostramos el tercer arreglo: ");
        for(int i=0;i<24;i++){
            System.out.println(c[i]);
        }
    }
    
}
