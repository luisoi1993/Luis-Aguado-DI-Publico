/*
 Pedir un numero y calcular su factorial
 */
package ejercicio_33;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, mult=1;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        for(int i =1;i<=numero;i++){
            mult = mult*i;
        }
        
        JOptionPane.showMessageDialog(null,"El resultado es "+mult);
        
        
    }
    
}
