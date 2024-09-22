/*
 pedir 10 numeros y escribir la suma total
 */
package ejercicio_31;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero , suma=0;
        
        for(int i =1;i<=10;i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "+i));
            suma = suma+numero;
        }
        
        JOptionPane.showInputDialog(null,"EL resultao es :"+suma);
    }
    
}
