/*
 Hcer un menu donde se tengan las siguientes opciones: viaje de equipo
, entrenamiento, partido de furbol, planificar entrenamiento, entrevista ,
curar lesion

viajar , entrevista , entrenamiento , partido
 */
package Ejercicio;

/**
 *
 * @author luis
 */
public class Futbolista extends Persona {
    private int dorsal;
    private String posicion;
     
    public Futbolista(String nombre,String apellido,int edad,int dorsal,String posicion){
        super(nombre,apellido,edad);
        this.dorsal=dorsal;
        this.posicion=posicion;
    }
    
    
    public int getDorsal(){
        return dorsal;
    }
    public String getPosicion(){
        return posicion;
    }
    
    public void entrenamiento(){
        System.out.println(nombre+"esta entrenando:");
    }
    
    public void partido(){
        System.out.println("esta jugando un partido: ");
    }
    
}
