/*
 Un obrero necesita calcular su salario semanal , el cual se obtiene de la 
siguiente manera: si trabajas 40 horas o menos se le paga 16$ por hora,
si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40
horas y 20$ por cada hora extra
 */
package ejercicio_12;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horasTrabajadas;
        float salarioTotal;
        
        horasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de horas trabajadas"));
        
        if(horasTrabajadas <=40){
            salarioTotal=horasTrabajadas * 16;
        }
        else{
            salarioTotal = (40*16) + ((horasTrabajadas-40) *20);
        }
        
        JOptionPane.showMessageDialog(null,"El salario total es "+salarioTotal);
    }
    
}
