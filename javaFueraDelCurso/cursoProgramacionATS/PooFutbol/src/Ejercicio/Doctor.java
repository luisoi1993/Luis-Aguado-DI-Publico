/*
 la titulacion y los años de esperiencia 
 */
package Ejercicio;

/**
 *
 * @author luis
 */
public class Doctor extends Persona{
    private String titulacion;
    private String experiencia;
     
    
    public Doctor(String nombre,String apellido, int edad,String titulacion,String experiencia){
        super(nombre,apellido,edad);
        this.titulacion=titulacion;
        this.experiencia=experiencia;
    }
   
   
     
    public String getTitulacion(){
        return titulacion;
    }
    
    public String getExperiencia(){
        return experiencia;
    }
  
    
}
