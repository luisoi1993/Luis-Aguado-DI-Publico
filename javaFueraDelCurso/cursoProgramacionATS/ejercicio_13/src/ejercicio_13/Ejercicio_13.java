/*
 Leer 5 elementos numericos que se introduciran ordenados de forma creciente.
Estos los guardaremos en una tabla de tamaño 10. Leer un numero N, e insentarlo
en el lugar adecuado para que la tabla continue ordenada
 */
package ejercicio_13;

import javax.swing.JOptionPane;
/**
 *
 * @author luis
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1"));
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2"));
        
        if(num1%2==0 && num2%2==0 ){
            JOptionPane.showMessageDialog(null,"Los dos son pares");
        }
        
       else if(num1%2!=0 && num2!=0){
            JOptionPane.showMessageDialog(null,"Los dos son impares");
        }
        
       else{
           JOptionPane.showMessageDialog(null, "Uno es par y el otro impar");
       }
        
    }
    
}
