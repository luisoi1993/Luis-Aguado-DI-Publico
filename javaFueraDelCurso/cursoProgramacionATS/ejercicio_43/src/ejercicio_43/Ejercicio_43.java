/*
 pedir 5 calificaciones de alumnos y decir al final si hay suspensos
 */
package ejercicio_43;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        boolean suspenso=false;
        
        for(int i=1;i<=5;i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota"));
            
            if(numero<5){
                suspenso=true;
            }
        }
        if(suspenso==true){
            System.out.println("Hay algun suspenso: ");
        }
        else{
            System.out.println("No hay ningun suspenso: ");
        }
    }
    
}
