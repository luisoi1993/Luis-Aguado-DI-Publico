/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Principal {
    public static void main(String [] args){
        Cuadrilatero c1;
        float lado1 , lado2;
    
        lado1= Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2: "));
        
        if (lado1 == lado2){
            c1 = new Cuadrilatero(lado1);
        }
        else{
            c1 = new Cuadrilatero(lado1,lado2);
        }
        
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());
    }
    
    
}
