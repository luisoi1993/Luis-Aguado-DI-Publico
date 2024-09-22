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
    public static double mayorArea(Isoceles triangulos[]){
        double area;
        area = triangulos[0].obtenerArea();
        for(int i=1;i<triangulos.length;i++){
            if(triangulos[i].obtenerArea()>area){
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }
    
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int numeroTriangulos;
        double base, lado;
        
        System.out.println("Digite el numero de triangulos isoceles que quiere usar: ");
        numeroTriangulos=entrada.nextInt();
        
        //creamos los objetos para los triangulos isoceles
        Isoceles triangulos[] = new Isoceles[numeroTriangulos];
        
        System.out.println("Empezamos a digitar la informacion de los triangulos isoceles: ");
        for(int i=0;i<numeroTriangulos;i++){
            System.out.println("Digite las cracteristicas del triangulo isoceles: "+(i+1));
            System.out.println("Digite el valor de los lados: ");
            lado = entrada.nextDouble();
            System.out.println("Digite el valor de la base: ");
            base=entrada.nextDouble();
            
            triangulos[i]= new Isoceles(lado,base);
            
            
            
        }
        
        for(int i=0;i<numeroTriangulos;i++){
            System.out.println("Los datos de los triangulos son: ");
            System.out.println(triangulos[i].mostrarDatos());
        }
        
        System.out.println("El triangulo isoceles con mayor area es: "+mayorArea(triangulos));
        
        
    }
}
