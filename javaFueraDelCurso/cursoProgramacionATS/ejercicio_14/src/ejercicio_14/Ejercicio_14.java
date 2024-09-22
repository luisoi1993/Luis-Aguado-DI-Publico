/*
 Pedir tres numeros y monstrarlos ordenados de mayor a menor
 */
package ejercicio_14;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3;
        
        n1= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero. "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if((n1>n2) && (n2>n3)){
            JOptionPane.showMessageDialog(null , "orden "+n1+" "+n2+" "+n3);
        }
        
        else if((n1>n2) && (n3>n2)){
            JOptionPane.showMessageDialog(null , "orden "+n1+" "+n3+" "+n2);
        }
        
        else if((n2>n1) && (n1>n3)){
            JOptionPane.showMessageDialog(null , "orden "+n2+" "+n1+" "+n3);
        }
        
        else if((n2>n3) && (n3>n1)){
            JOptionPane.showMessageDialog(null , "orden "+n2+" "+n3+" "+n1);
        }
        
        else if((n3>n1) && (n1>n2)){
            JOptionPane.showMessageDialog(null , "orden "+n3+" "+n1+" "+n2);
        }
        
        else{
            JOptionPane.showMessageDialog(null , "orden "+n3+" "+n2+" "+n1);
        }
    }
    
}
