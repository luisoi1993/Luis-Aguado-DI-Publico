/*
 Pedir 10 sueldos . Mostrar su suma y cuantos hay mayores de $1000
 */
package ejercicio_35;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sueldo,suma=0,mil=0;
        
        for(int i=0;i<10;i++){
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("Digite el sueldo: "));
            suma=suma+sueldo;
            if(sueldo>1000){
                mil++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "La suma de sueldos es: "+suma+" y los sueldos por encima de 1000 son: "+mil);
    }
    
}
