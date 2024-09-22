/*
 pedir un numero entre 0 y 99999 y decir cuantas cifras tiene
 */
package ejercicio_15;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        
        if(numero<10){
            JOptionPane.showMessageDialog(null, "El numero tiene una cifras");
        }
        
        else if(numero<100 && numero>9){
            JOptionPane.showMessageDialog(null, "El numero tiene dos cifras");
        }
        
        else if(numero<1000 && numero>99){
            JOptionPane.showMessageDialog(null, "El numero tiene tres cifras");
        }
        
        else if(numero<10000 && numero>999){
            JOptionPane.showMessageDialog(null, "El numero tiene tres cifras");
        }
        
        else if(numero<100000 && numero>9999){
            JOptionPane.showMessageDialog(null, "El numero tiene cuatro cifras");
        }
        
        else if(numero<100000 && numero>99999){
            JOptionPane.showMessageDialog(null, "El numero tiene cinco cifras");
        }
        
        else{
            JOptionPane.showInputDialog(null, "El numero no es valido");
        }
    }
    
}
