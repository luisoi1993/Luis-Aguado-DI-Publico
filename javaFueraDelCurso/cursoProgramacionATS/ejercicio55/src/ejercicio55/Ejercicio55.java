/*
 leer 10 enteros ordenados crecientemente. Leer n y buscarlo en la tabla. Se debe 
mostrar la posicion en que se encuentra. si no esta, indicarlo con un mensaje.
 */
package ejercicio55;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],numero;
        boolean creciente = true;
        
        arreglo = new int[10];
        
        do{
            System.out.println("Rellene el arreglo: ");
            for(int i=0;i<10;i++){
                System.out.println(i+". Digite un numero: ");
                arreglo[i]=entrada.nextInt();
            }
            
            for(int i=0;i<9;i++){
              if(arreglo[i] < arreglo[i+1]){
                  creciente = true;
              }  
              if(arreglo[i]>arreglo[i+1]){
                  creciente = false;
                  break;
              }
            }
            if(creciente == false){
                System.out.println("\nEl arreglo esta desordenado, digite nuevamente: ");
            }
        }while(creciente == false);
        
        System.out.println("\nDigite el numero a buscar en el arreglo: ");
        numero = entrada.nextInt();
        
        int i=0;
        
        while(i<10 && arreglo[i]<numero){
            i++;
        }
        
        if(i==10){
            System.out.println("\nNumero no encontrado");
        }
        else{
            if(arreglo[i]== numero){
                System.out.println("\nNumero encontrado, en la posicion: "+i);
            }
            else{
                System.out.println("\n numero no encontrado");
            }
        }
    }
    
}
