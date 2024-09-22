/*
 Crear un programa para simular un equipo de futbol (futbolista,entrenador , doctor), para lo cual tendremos lo siguiente:
-una super clase Persona , que tendra los siguientes datos: nombre, apellido ,edad

-la sub clase Futbolista tendra los siguientes datos : dorsal y posicion

-la sub clase Entrenador tendra de dato la estretagia que utiliza.

-La sub clase Doctor, la titulacion y los años de esperiencia 

Hcer un menu donde se tengan las siguientes opciones: viaje de equipo
, entrenamiento, partido de furbol, planificar entrenamiento, entrevista ,
curar lesion
 */
package Ejercicio;

/**
 *
 * @author luis
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    
    public Persona(String nombre, String apellido,int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void viajar(){
        System.out.println(nombre+" esta viajando");
    }
    
    public void entrevista(){
        System.out.println(nombre+"esta haciendo una entrevista");
    }

       
}
