/*
 hacer un programa que pase de kg a otra unidad de medida de masa, mostrar en
pantalla un menu con las opciones posibles
 */
package ejercicio_21;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kg,opcion,resultado;
        
        kg=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de kg"));
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Escoga una opcion: \n"
                + "1. Pasar a hg\n"
                + "2.Pasar a dag\n"
                + "3.Pasar a gr\n"));
        
        switch(opcion){
            case 1:resultado = kg*10;
                  JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
                  
            case 2:resultado = kg*100;
                  JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
            
            case 3:resultado = kg*1000;
                  JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
        
    }
        
        
    }
    
}
