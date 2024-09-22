/*
 Construir un programa para trabajar con 2 numeros complejos, implemente el
siguiente menu:
1. sumar dos numeros complejos
2.multiplicar dos numeros complejos
3. Comparar 2 numeros complejos(iguales o no)
4.Multiplicar un numero complejo por un entero
 */
package ejercicio;

/**
 *
 * @author luis
 */
public class Numero {
    private float numero1,numero2;
    
    public Numero(float numero1,float numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    
    public float getNumero1(){
        return numero1;
    }
    
    public float getNumero2(){
        return numero2;
    }
    
   
    
}
