/*
 Hacer un programa para calcular el area de poligonos 
(triangulos y Rectangulos) el programa debe ser capaz de almacenar
en un arreglo N triangulos y rectangulos, y al final mostrar el area
y los datos de cada uno.Para ello se tendra lo siguiente:

-Una super clase llamada Poligono.
-Una sub clase llamada Rectangulo.
-Una sub clase llamada Triangulo.
 */
package ejercicio;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
   static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
   static Scanner entrada = new Scanner(System.in);
   
   
   public static void main(String[] args){
         llenarPoligono();
         
         mostrarResultados();
   }
   
   public static void llenarPoligono(){
        char respuesta;
       int opcion;
       do{
          do{
           System.out.println("Digite que poligono desea");
           System.out.println("1. Triangulo");
           System.out.println("2. Rectangulo");
           System.out.print("Opcion: ");
           opcion = entrada.nextInt();  
          }while(opcion<1 || opcion>2);
           
           switch(opcion){
               case 1: llenarTriangulo();
                      break;
                      
               case 2: llenarRectangulo();
                       break;
           }
           
           System.out.print("\nDesea introducir otro poligono(s/n): ");
           respuesta = entrada.next().charAt(0);
           System.out.println("");
       }while(respuesta=='s' || respuesta=='S');
       
    }
   
    public static void llenarTriangulo(){
          double lado1,lado2,lado3;
          
          System.out.print("\nDigite el lado1 del triangulo: ");
          lado1=entrada.nextDouble();
          System.out.print("Digite el lado2 del triangulo: ");
          lado2=entrada.nextDouble();
          System.out.print("Digite el lado3 del triangulo: ");
          lado3=entrada.nextDouble();
          
          Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
          
          poligono.add(triangulo);
       }
    
    public static void llenarRectangulo(){
        double lado1,lado2;
        
        System.out.print("\nDigite el lado1 del rectangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del rectangulo: ");
        lado2= entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        poligono.add(rectangulo);
    }
    
    public static void mostrarResultados(){
        for(Poligono poli: poligono){
            System.out.println(poli.toString());
            System.out.println("Area= "+poli.area());
            System.out.println("");
        }
    }
}
