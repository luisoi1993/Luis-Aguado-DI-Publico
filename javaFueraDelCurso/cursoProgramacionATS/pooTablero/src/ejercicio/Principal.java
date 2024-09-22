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
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        char respuesta='a';
        int x=0, y=0;
        Tablero t1 = new Tablero(x,y);
        
        System.out.println("Bienvenido");
        while(respuesta!='1'){
            System.out.println("La posicion es "+t1.mostrar());
            System.out.println("Si quiere subir digite s");
            System.out.println("Si quiere bajar digite b");
            System.out.println("Si quiere ir a la izquierda digite i");
            System.out.println("Si quiere ir a la derecha digite d");
            System.out.println("Digite 1 para salir del programa: ");
            respuesta=entrada.next().charAt(0);
            respuesta = Character.toLowerCase(respuesta);
            
            
            switch(respuesta){
                case 's':t1.sumary();
                         break;
                
                case 'b':t1.restary();
                        break;
                        
                case 'i':t1.restarx();
                        break;
                        
                case 'd':t1.sumarx();
                        break;
                        
                case '1':break;
               
                default: System.out.println("Diigite una letra o numero equivocado: ");
                        break;
                            
            }
        }
    }
}
