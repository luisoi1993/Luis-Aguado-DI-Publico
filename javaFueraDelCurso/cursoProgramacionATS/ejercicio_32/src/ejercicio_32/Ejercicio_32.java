/*
 Diseñar un programa que muestre el producto de los 10 primeros numeros impares
 */
package ejercicio_32;

/**
 *
 * @author luis
 */
public class Ejercicio_32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long producto = 1;
        
        for(int i=1;i<=20; i+=2){
            producto *=i;
        }
        
        System.out.println("El producto es "+producto);
                
    }
    
}
