/*Hacer un programa que lea un caracter por teclado y comprueba si es una letra
mayuscula
 */
package ejercicio_10;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"Es una letra myuscula");
        }
        
        else{
            JOptionPane.showMessageDialog(null ,"Es una letra minuscula: ");
                }
    }
    
}
