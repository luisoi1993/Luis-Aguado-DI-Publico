/*
 Pedir numeros hasta que se tecle uno negativo y mostrar cuantos numeros se 
han introducido
 */
package ejercicio_25;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, cont=0;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while(numero >=0){
            cont++;
          numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));  
        }
        
        if(numero<0){
            JOptionPane.showMessageDialog(null,"Has tecleado "+cont);
        }
    }
    
}
