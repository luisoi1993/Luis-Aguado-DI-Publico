/*
 Realizar un juego para adivinar un numero. Para ello generar un numero aleatorio
entre 0-100, y  luego ir pidiendo números indicando es mayor o es menor segun
sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta
y mostar el numero de intentos
 */
package ejercicio_26;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, aleatorio, contador=0;
        
        aleatorio = (int)(Math.random()*100);
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if(aleatorio > numero){
                System.out.println("Digite un numero mayor");
            }
            else{
                System.out.println("Digite un numero menor");
            }
            contador++;
        }while(numero !=aleatorio);
        
        System.out.println("\nGenial!! Adivinaste el numero en: "+contador+" intentos");
    }
    
}
