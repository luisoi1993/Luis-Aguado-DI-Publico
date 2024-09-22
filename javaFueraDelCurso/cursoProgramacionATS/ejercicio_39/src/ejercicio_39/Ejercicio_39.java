/*
 Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce 
el precio por litro. Solo existen tres productos con precios
1-0,6 litro
2- 3 $litro
3- 1,25 $/litro
 */
package ejercicio_39;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejercicio_39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int codigo, litros,litrosArticulo1=0,conteoMas600=0,codigoLitro;
        float precioLitro=0,importeFactura,facturacionTotal=0;
        
        for(int i=1;i<=5;i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo nº"+i+"\nDigite el codigo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo nº"+i+"\nDigite el numero de litros"));
            codigoLitro = Integer.parseInt(JOptionPane.showInputDialog("Articulo nº"+i+"\nDigite el codigo de precio de litro (de 0 a 3)"));
            
          switch (codigoLitro) {
              case 1:
                  precioLitro=0.6f;
                  break;
              case 2:
                  precioLitro=3;
                  break;
              case 3:
                  precioLitro=1.25f;
                  break;
              default:
                  JOptionPane.showMessageDialog(null, "Solo se pueden elegir codigos de 0 a 3");
                  break;
          }
            importeFactura = (float) litros * precioLitro;
            facturacionTotal +=importeFactura;
            
            if(codigo == 1){
                litrosArticulo1 += litros;
            }
            
            if(importeFactura > 600){
                conteoMas600++;
            }
        }
        
        System.out.println("Resumen de ventas");
        System.out.println("Facturacion total"+facturacionTotal);
        System.out.println("Cantidad de litros vendidos del articuo 1"+litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600: "+conteoMas600);
    }
    
}
