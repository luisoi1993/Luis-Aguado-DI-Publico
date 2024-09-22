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
  public static void main(String[]args){
      Scanner entrada = new Scanner(System.in);
      int seleccion=0;
      float numero1,numero2;
      boolean comparacion1 = false, comparacion2=false;
      
      System.out.println("Digite los valores del primer conjunto de dos numeros: ");
      System.out.println("Digite el valor del primer numero: ");
      numero1=entrada.nextFloat();
      System.out.println("Digite el valor del segundo numero: ");
      numero2=entrada.nextFloat();
      Numero n1 = new Numero(numero1,numero2);
      
      System.out.println("Digite los valores del segundo cojunto de dos numeros: ");
      System.out.println("Digite el valor del primer numero: ");
      numero1=entrada.nextFloat();
      System.out.println("Digite el valor del segundo numero: ");
      numero2=entrada.nextFloat();
      Numero n2 = new Numero(numero1,numero2);
      
      System.out.println("");
      while(seleccion != 5){
          System.out.println("Eliga el numero de una de las opciones");
          System.out.println("1.Sumar dos numeros: ");
          System.out.println("2.Multiplicar dos numeros: ");
          System.out.println("3.Dividir dos numeros: ");
          System.out.println("4.Comparar si los dos conjuntos de numeros son iguales: ");
          System.out.println("5.Salir del programa.");
          seleccion = entrada.nextInt();
          float resultado1,resultado2;
          switch(seleccion){
              case 1: resultado1= n1.getNumero1()+n2.getNumero1();
                      resultado2 = n1.getNumero2()+n2.getNumero2();
                      System.out.println("El resultado de la  primera suma es: "+resultado1+"\nEl resultado de la segunda suma es: "+resultado2);
                      break;
                      
              case 2: resultado1= n1.getNumero1()*n2.getNumero1();
                      resultado2 = n1.getNumero2()*n2.getNumero2();
                      System.out.println("El resultado de la  primera multiplicacion es: "+resultado1+"\nEl resultado de la segunda multiplicacion es: "+resultado2);
                      break;
                      
              case 3: resultado1= n1.getNumero1()/n2.getNumero1();
                      resultado2 = n1.getNumero2()/n2.getNumero2();
                      System.out.println("El resultado de la  primera division es: "+resultado1+"\nEl resultado de la segunda division es: "+resultado2);
                      break;
                      
              case 4: if(n1.getNumero1()==n2.getNumero1()){
                         comparacion1=true;
                        }
                      if(n2.getNumero2()==n2.getNumero2()){
                          comparacion2= true;
                      }
                      if(comparacion1==true && comparacion2==true){
                          System.out.println("Los dos conjuntos de numeros son iguales: ");
                      }
                      else{
                          System.out.println("No son iguales");
                      }
          }
      }
    }
}
