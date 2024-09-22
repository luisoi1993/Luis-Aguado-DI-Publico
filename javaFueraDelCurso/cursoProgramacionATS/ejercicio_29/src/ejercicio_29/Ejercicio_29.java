/*
 Pedir un numero N y mostrar todos los numeros del 1 al N
 */
package ejercicio_29;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        for(int i=1;i<=numero;i++){
            System.out.println(i);
        }
    }
    
}
