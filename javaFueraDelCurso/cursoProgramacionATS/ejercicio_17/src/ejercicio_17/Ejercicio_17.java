/*
 Pedir el dia mes y año de una fecha e indicar si la fecha es correcta. con meses
de 28, 30 ,31 dias. sin años bisiestos
 */
package ejercicio_17;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes , año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        //30 dias
        if((mes==4)||(mes<=6) ||(mes<=9) ||(mes<=11) ){  
            if((dia>=1) &&(dia<=30)){
                if(año !=0){
                    JOptionPane.showMessageDialog(null,"La fecha esta correcta 30");
                }
                else{
                    JOptionPane.showMessageDialog(null, "El año esta mal");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"El dia esta mal: ");
            }
        }
        else if(mes==2){
            if((dia>=1) &&(dia<=28)){
                if(año !=0){
                    JOptionPane.showMessageDialog(null,"La fecha esta correcta 28");
                }
                else{
                    JOptionPane.showMessageDialog(null, "El año esta mal");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"El dia esta mal: ");
            }
        }
        else if((mes==1)||(mes<=3) ||(mes<=5) ||(mes<=7)||(mes<=8)||(mes<=10)||(mes<=12)){
            if((dia>=1) &&(dia<=30)){
                if(año !=0){
                    JOptionPane.showMessageDialog(null,"La fecha esta correcta 31");
                }
                else{
                    JOptionPane.showMessageDialog(null, "El año esta mal");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"El dia esta mal: ");
            }
        }
        
        else{
            JOptionPane.showMessageDialog(null,"El mes esta mal: ");
        }
    }
    
}