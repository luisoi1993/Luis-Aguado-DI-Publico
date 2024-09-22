/*
 Construir un programa para una competencia de atletismo, el programa debe 
gestionar una serie de atletas caracterizados por su numero de atleta, nombre
y tiempo de carrera , al final el prigrama debe mostrar los datos del atleta
ganador de la carrera.
 */
package ejercicio;

/**
 *
 * @author luis
 */
public class Atleta {
    //atributos
    private int numero;
    private String nombre;
    private int tiempo;
    
    //clases
    public Atleta(int numero,String nombre, int tiempo){
        this.numero=numero;
        this.nombre=nombre;
        this.tiempo=tiempo;
        
    }

    
    public int getTiempo(){
        return tiempo;
    }
    
    public String mostrarDatos(){
        return "Numero: "+numero+"\nNombre: "+nombre+"\nTiempo es segundos: "+tiempo+"\n";
    }
     

   
    
    
}
