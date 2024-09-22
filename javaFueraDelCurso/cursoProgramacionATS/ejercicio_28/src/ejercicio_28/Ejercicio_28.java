/*
 Pedir numeros hasta que se introduzca uno negativo y calcular la media
 */
package ejercicio_28;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, elementos = 0,suma=0;
        float media;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero>=0){
            suma +=numero;
            elementos++;
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        
        if(elementos == 0){
            System.out.println("Error ! la divvision de 0 no existe");
        }
        else{
            media = (float) suma/elementos;
            System.out.println("La media es: "+media);
        }
    }
    
}
