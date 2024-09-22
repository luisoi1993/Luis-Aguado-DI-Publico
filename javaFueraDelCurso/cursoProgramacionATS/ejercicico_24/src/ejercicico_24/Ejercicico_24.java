/*
 Leer numeros hasta que se introduzca un 0. Para cada uno indicar si es par o impar
 */
package ejercicico_24;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicico_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while(numero!=0){
            if(numero %2 ==0){
                System.out.println("El numero "+numero+" es par");
            }
            else{
                System.out.println("El numero "+numero+" Es impar");
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
    }
    
}
