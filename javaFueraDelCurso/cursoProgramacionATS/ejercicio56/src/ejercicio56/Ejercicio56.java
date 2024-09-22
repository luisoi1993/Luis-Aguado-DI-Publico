/*
 queremos desarollar una aplicacion que nos ayude a gesttionar las notas de 
un centro educativo. cada grupo esta compuesto por 5 alumnos. Se pide leer las notas
del primer , segundo y tercer trimestre de un grupo. Debemos mostrar al final
la nota media del grupo en cada trimestre y la media del alumno que se encuentra
en la poscion n
 */
package ejercicio56;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int posicion;
       int primerTrimestre[] = new int[5];
       int segundoTrimestre[] = new int[5];
       int tercerTrimestre[] = new int[5];
       
        System.out.println("Las notas del primer trimestre: ");
        for(int i =0;i<5;i++){
            do{
                System.out.println((i+1)+"Digite una nota entre 0 y 10");
                primerTrimestre[i]=entrada.nextInt();
            }while(primerTrimestre[i]<0 || primerTrimestre[i] >10);
        }
        
        
        
         System.out.println("Las notas del segundo trimestre: ");
        for(int i =0;i<5;i++){
            do{
                System.out.println((i+1)+"Digite una nota entre 0 y 10");
                segundoTrimestre[i]=entrada.nextInt();
            }while(segundoTrimestre[i]<0 || segundoTrimestre[i] >10);
        }
        
         System.out.println("Las notas del tercer trimestre: ");
        for(int i =0;i<5;i++){
            do{
                System.out.println((i+1)+"Digite una nota entre 0 y 10");
                tercerTrimestre[i]=entrada.nextInt();
            }while(tercerTrimestre[i]<0 || tercerTrimestre[i] >10);
        }
        System.out.println("Digite el numero del alumno de 0 a 4");
        posicion=entrada.nextInt();
        
        
        int notaMedia=0,notaMedia2=0,notaMedia3=0,notaPosicion=0;
        
        for(int i=0;i<5;i++){
            notaMedia=notaMedia+primerTrimestre[i];
            notaMedia2=notaMedia2+segundoTrimestre[i];
            notaMedia3=notaMedia3+tercerTrimestre[i];
        }
        notaMedia=notaMedia/5;
        notaMedia2=notaMedia2/5;
        notaMedia3=notaMedia3/5;
        
        notaPosicion=(primerTrimestre[posicion]+segundoTrimestre[posicion]+tercerTrimestre[posicion])/3;
        
        System.out.println("La nota media del primer trimestre es: "+notaMedia);
        System.out.println("La nota media del segundo trimestre es: "+notaMedia2);
        System.out.println("La nota media de tercer trimestre es: "+notaMedia3);
        System.out.println("La nota del alumno de la posicion "+posicion+" es: "+notaPosicion);
        
    }
    
}
