/*
 Construir un programa que permita dirigir el movimiento de un 
objeto dentro de un tablero y actualice su posicion dentro del
mismo.Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA, DERECHA
Tras cada movimiento el programa mostrara la nueva direccion elegida
y las coordenadas de situacion del objeto dentro del tablero
 */
package ejercicio;

/**
 *
 * @author luis
 */
public class Tablero {
    //atributos
    private int x;
    private int y;

    
    public Tablero(int x,int y){
        this.x=x;
        this.y=y;
        
    }
    
    public void sumarx(){
        x++;
    }
    
    public void restarx(){
        x--;
    }
    
    public void sumary(){
        y++;
    }
    
    public void restary(){
        y--;
    }
    
    public String mostrar(){
        return "X: "+x+"Y: "+y; 
    }
    
}
