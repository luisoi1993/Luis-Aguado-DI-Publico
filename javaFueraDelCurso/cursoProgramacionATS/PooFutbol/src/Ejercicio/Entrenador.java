/*

 */
package Ejercicio;

/**
 *
 * @author luis
 */
public class Entrenador extends Persona {
   private String estrategia;
   
   public Entrenador(String nombre,String apellido,int edad,String estrategia){
       super(nombre,apellido,edad);
       this.estrategia=estrategia;
   }
     
   public String getEstrategia(){
       return estrategia;
   }
    
    
    
}
