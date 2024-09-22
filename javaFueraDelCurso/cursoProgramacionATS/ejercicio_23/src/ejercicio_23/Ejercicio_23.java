/*
 Leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta 
que se introduzca 0
 */
package ejercicio_23;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while(numero!=0){
            if(numero>0){
                JOptionPane.showMessageDialog(null,"El nunmero es positivo "+numero);
                numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            }
            else{
                JOptionPane.showMessageDialog(null,"El nunmero es negativo "+numero);
                numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            }
        }
    }
    
}
