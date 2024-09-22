/*
 hacer un programa que lea un numero entero y muestre si el numero es multiplo 
de 10
 */
package ejercicio_9;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero%10 == 0){
            JOptionPane.showMessageDialog(null,"El numero "+numero+"es multiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero no es multiplo de 10");
        }
    }
    
}
