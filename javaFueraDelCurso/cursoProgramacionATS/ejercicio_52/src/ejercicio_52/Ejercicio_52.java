/*
 Crear un programa que lea por teclado una tabla de 10 numeros enteros y la
desplace una posicion hacia abajo: el primero pasa a ser el segundo, el segundo
pasa a ser el tercero y asi sucesivamente. el ultimo pasa a ser el primero
 */
package ejercicio_52;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo;
        
        System.out.println("Llenar el arreglo");
        for(int i=0;i<10;i++){
            System.out.println(i+" Digite un numero");
            arreglo[i]=entrada.nextInt();
        }
        
        ultimo=arreglo[9];
        
        for(int i=8;i>=0;i--){
            arreglo[i+1]= arreglo[i];
        }
        
        arreglo[0] = ultimo;
        
        System.out.println("El nuvo arreglo es: ");
        for(int i=0;i<10;i++){
            System.out.println(i+" Numero: "+arreglo[i]);
        }
    }
    
}
