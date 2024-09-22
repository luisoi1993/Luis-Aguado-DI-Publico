/*Realizar un menú con 4 posibilidades, donde cada vez que se pulse
una opción aparezca el mensaje "Pulsada la opción 1". Tras mostrar
el mensaje se volverá a mostrar el menú con su correspondiente ejecución.
La 4 posibilidad parará la ejecución con el mensaje "saliendo ...".
En el caso de introducir un número que no esté entre 1 y 4 aparecerá
el mensaje "número no contemplado*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("Eliga una opción: ");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();

            switch(opcion){
                case 1 :
                    System.out.println("Pulsada la opción 1");
                    break;
                case 2 :
                    System.out.println("Pulsada la opción 2");
                    break;
                case 3 :
                    System.out.println("Pulsada la opción 3");
                    break;
                case 4 :
                    System.out.println("saliendo ...");
                    break;
                default:
                    System.out.println("número no contemplado");
            }
        }while(opcion != 4);
    }
}