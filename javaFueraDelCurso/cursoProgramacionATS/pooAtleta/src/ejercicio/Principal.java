/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Principal {
     public static int indiceAtletaMRapido(Atleta atletas[]){
         int tiempo;
         int indice=0;
         
         tiempo = atletas[0].getTiempo();
         for(int i=1;i<atletas.length;i++){
             if(atletas[i].getTiempo() < tiempo){
                 tiempo=atletas[i].getTiempo();
                 indice = i;
             }
         }
         return indice;
     }
     
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero , tiempo;
        String nombre;
        int numeroAtletas,atletaRapido;
        
        System.out.println("Digite el numero de corredores: ");
        numeroAtletas=entrada.nextInt();
        
        Atleta atletas[] = new Atleta[numeroAtletas];
        
       for(int i=0;i<numeroAtletas;i++){
           entrada.nextLine();
           System.out.println("Digite el numero del atleta "+(i+1));
           numero=entrada.nextInt();
           entrada.nextLine();
           System.out.println("Digite el nombre del atleta "+(i+1));
           nombre=entrada.nextLine();
           System.out.println("Digite el tiempo en segundos del atleta: "+(i+1));
           tiempo=entrada.nextInt();
           
           atletas[i]= new Atleta(numero,nombre,tiempo);
       } 
       
       atletaRapido = indiceAtletaMRapido(atletas);
       
        System.out.println("\nEl atleta mas rapido es: ");
        System.out.println(atletas[atletaRapido].mostrarDatos());
        
       
    }
}
