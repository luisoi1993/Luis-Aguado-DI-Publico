/*
 Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden
introducido
 */
package ejercicio_44;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio_44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        
        System.out.println("Guardando los datos en el arreglo: ");
        for(int i=0;i<5;i++){
            System.out.println((i+1)+"Digite un numero: ");
            numeros[i]=entrada.nextFloat();
        }
        
        System.out.println("\nImprimir los elementos del arreglo");
        for(float i:numeros){
            System.out.println(i);
        }
    }
    
}
