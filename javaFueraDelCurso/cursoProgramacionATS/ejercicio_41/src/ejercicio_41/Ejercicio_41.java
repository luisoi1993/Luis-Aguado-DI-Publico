/*
 Pedir un numero N, introducir N sueldos, y mostrar el sueldo maximo
 */
package ejercicio_41;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,sueldo,sueldoMaximo=0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de sueldos: "));
        
        for(int i=1;i<=numero;i++){
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Digite el sueldo numero : "+i));
            
            if(sueldo>sueldoMaximo){
                sueldoMaximo = sueldo;
            }
        }
        
        System.out.println("El sueldo maximo es : "+sueldoMaximo);
    }
    
}
