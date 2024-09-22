/*
 Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera
de la forma : el 1 dee a, el 1 de b , el 2 d a el dos de b
 */
package ejercicio_48;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];
        
        a = new int[10];
        b = new int[10];
        c = new int[20];
        
        System.out.println("Digite el primer arreglo: ");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+"Digite un numero: ");
            a[i]=entrada.nextInt();
        }
        
        System.out.println("Digite el segundo arreglo: ");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+"Digite un numero: ");
            b[i]=entrada.nextInt();
        }
        
        int j=0;
        for(int i=0;i<10;i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        
        System.out.println("el tercer arreglo es: ");
        for(int i=0;i<20;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
    
}
