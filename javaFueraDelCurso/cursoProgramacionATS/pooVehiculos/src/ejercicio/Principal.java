/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Principal {
    public static int indiceCocheMBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for(int i=1;i<coches.length;i++){
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        
        return indice;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String marca,modelo;
        float precio;
        int numeroVehiculos,indiceBarato;
        
        System.out.print("Digite la cantidad de vehiculos: ");
        numeroVehiculos=entrada.nextInt();
        
        //creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        
        for(int i=0;i<coches.length;i++){
            entrada.nextLine();
            System.out.println("\nDigite las caracteristicas del coche "+(i+1)+":");
            System.out.println("Introduzca Marca: ");
            marca=entrada.nextLine();
            System.out.println("Introduzca Modelo: ");
            modelo=entrada.nextLine();
            System.out.println("Introduzca precio: ");
            precio = entrada.nextFloat();
            
            coches[i] = new Vehiculo(marca,modelo,precio);
        }
        
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
        
    }
}
