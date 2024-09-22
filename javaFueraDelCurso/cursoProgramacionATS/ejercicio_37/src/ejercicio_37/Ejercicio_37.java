/*
pide un numero ( que debe estar entre 0 y 10) y mostar la tabla de multiplicar de
dicho numero
 */
package ejercicio_37;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,mult;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 0 al 10"));
        
        for(int i=1;i<=10;i++){
           mult=numero*i;
            System.out.println(i+" * "+numero+" : "+mult);
        }
    }
    
}
