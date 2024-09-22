/*
 Pedir una nota de 0 a 10 y mostrarla de la forma: insuficiente, sifuciente, bien
notable y sobresaliente
 */
package ejercicio_19;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        
        nota=Integer.parseInt(JOptionPane.showInputDialog("Digite la nota: "));
        
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:JOptionPane.showMessageDialog(null,"Insuficiente");
                    break;
            case 5:JOptionPane.showMessageDialog(null,"Suficiente");
                    break;
            case 6:JOptionPane.showMessageDialog(null,"bien");
                    break;
            case 7:
            case 8: JOptionPane.showMessageDialog(null, "bien");
                    break;
            case 9: 
            case 10:
                    JOptionPane.showMessageDialog(null, "sobresaliente");
                    break;
        }
        
        
    }
    
}
