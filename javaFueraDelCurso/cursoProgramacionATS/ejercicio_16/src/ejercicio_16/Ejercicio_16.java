/*
Pedir el dia mes y año de una fecha e indicar si la fecha es correcta.
suponiendo que todos los meses tienen 30 dias
 */
package ejercicio_16;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes , año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        
        if((dia>=1) &&(dia<=30)){
           if((mes>=1)&&(mes<=12)){
               if(año !=0){
                   JOptionPane.showMessageDialog(null,"Fecha correcta");
               }
               else{
               JOptionPane.showMessageDialog(null,"Año incorrecto");
           }
               
           }
           else{
               JOptionPane.showMessageDialog(null , "El mes es incorrecto: ");
           }
        }
        else{
            JOptionPane.showMessageDialog(null,"La fechha es incorrecta el dia es incorrecto");
        }
    }
    
}
