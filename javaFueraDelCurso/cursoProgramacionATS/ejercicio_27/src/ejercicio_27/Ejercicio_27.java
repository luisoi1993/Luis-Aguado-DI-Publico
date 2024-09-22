/*
 Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los 
numeros introducidos
 */
package ejercicio_27;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,suma=0;
        
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma=suma+numero;
            
        }while(numero!=0);
        
        System.out.println("La suma total de todos los numeros es: "+suma);
        
    
    }
    
}
