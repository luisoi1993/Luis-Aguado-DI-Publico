/*
en Megaplaza se hace un 20% de descuento a los clientes cuya compra supere los 300
¿cual sera la cantidad que pagara una persona por su compra
 */
package ejercicico_11;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicico_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total ,porcentaje;
        
        total=Integer.parseInt(JOptionPane.showInputDialog("Digite el precio sin descuento"));
        
        if(total<300){
            JOptionPane.showMessageDialog(null, "El precio total es "+total);
        }
        else{
            porcentaje = (total /100) * 20;
            total= total-porcentaje;
            
            JOptionPane.showMessageDialog(null,"es total es"+total);
        }
        
    }
    
}
