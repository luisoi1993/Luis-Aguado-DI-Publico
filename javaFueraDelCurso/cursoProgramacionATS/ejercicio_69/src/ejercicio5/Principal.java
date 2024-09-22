/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Principal {
    public static double mayorArea(Triangola_Isoceles triangulos[]){
        double area;
        
        area = triangulos[0].obtenerArea();
        for(int i=1;i<triangulos.length;i++){
            if(triangulos[i].obtenerArea()>area){
                area = triangulos[i].obtenerArea();
            }
        }
        
        return area;
    }
    
   public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        double base,lado;
        int nTriangulos;
    
         System.out.println("Digite el numero de triangulos a ingresar: ");
         nTriangulos = entrada.nextInt();
         
         Triangola_Isoceles triangulos[] = new Triangola_Isoceles[nTriangulos];
         
         for(int i=0;i<triangulos.length;i++){
             System.out.println("\nDigite los valores para el triangulo "+(i+1)+":");
             System.out.println("Introduzca la base: ");
             base=entrada.nextDouble();
             System.out.println("Introduzca el lado: ");
             lado=entrada.nextDouble();
             
             triangulos[i] = new Triangola_Isoceles(base,lado);
             
             System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
             System.out.println("El area del triangulo es: "+triangulos[i].obtenerArea());
         }
         
         System.out.println("\nEL area del triangulo de mayor superficie es: "+mayorArea(triangulos));
         
   }
    
    
}
