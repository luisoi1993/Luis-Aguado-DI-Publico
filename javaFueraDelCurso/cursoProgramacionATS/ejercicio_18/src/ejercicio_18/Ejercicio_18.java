/*
 construir un programa que simule el funcionamiento de una calculadora que puede
realizar las cuatro operaciones aritmeticas basicas (suma , resta, producto y division)
con valores numericos enteros. El usuario debe especificar la operacion con el primer
parametro de la linea de comandos : S o s
para la suma, R o r para la resta, P ,p M o m para el producto Y D o d para la division;
 */
package ejercicio_18;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1,numero2,suma,resta,mult,div;
        char operacion;
        
        numero1= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        operacion = JOptionPane.showInputDialog("Digite la operacion que va a digitar").charAt(0);
        
        switch(operacion){
            case 's':
            case 'S': suma = numero1+numero2;
                      JOptionPane.showMessageDialog(null, "La suma es: "+suma);
                      break;
                      
            case 'r':
            case 'R': resta = numero1-numero2;
                      JOptionPane.showMessageDialog(null, "La resta es: "+resta);
                      break;
                      
            case 'm':
            case'M':
            case 'p':
            case 'P': mult= numero1*numero2;
                      JOptionPane.showMessageDialog(null, "La multiplacion es: "+mult);
                      break;
            case 'd':
            case 'D':
                      div= numero1/numero2;
                      JOptionPane.showMessageDialog(null, "La division  es: "+div);
                      break;
            default: JOptionPane.showMessageDialog(null, "Error se equivoco de operacion:");break;
                      
        }
        
        
        
    }
    
}
