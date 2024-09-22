/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Principal {
     public static int corredorMasRapido(Atleta corredores[]){
        float tiempo;
        int indice = 0;
        
        tiempo = corredores[0].getTiempo();
        for(int i=1;i<corredores.length;i++){
            if(corredores[i].getTiempo() < tiempo){
                tiempo = corredores[i].getTiempo();
                indice = i;
            }
        }
        
        return indice;
    }
     
     public static void main(String [] args){
         Scanner entrada = new Scanner(System.in);
         String nombre;
         int numero,tiempo;
         int numeroCorredores,indiceTiempo;
         
         System.out.println("Digite el numero de corredores: ");
         numeroCorredores=entrada.nextInt();
         
         Atleta corredores[] = new Atleta[numeroCorredores];
         
         for(int i=0;i<corredores.length;i++){
             entrada.nextLine();
             System.out.println("\nDigite las caracteristicas del corredor "+(i+1)+":");
             System.out.println("Introduzca el numero del corredor: ");
             numero=entrada.nextInt();
             entrada.nextLine();
             System.out.println("Introduzca el nombre");
              nombre=entrada.nextLine();;
             System.out.println("Introduzca el tiempo en numero de minutos: ");
             tiempo=entrada.nextInt();
             
            corredores[i] = new Atleta(numero,nombre,tiempo);
         }
         
         indiceTiempo=corredorMasRapido(corredores);
         System.out.println("\n El corredor mas rapido es: ");
         System.out.println(corredores[indiceTiempo].mostrarDatos());
         
         
     }
}
