/*Crea un programa en el se defina una constante global con
el valor del número pi (3,1416) y se muestre por consola.
Se definirá un método de nombre “mostrarPI” sin datos de entrada ni salida.
        (mostrarPI)*/

public class Main {
    public static final double PI = 3.1416;
    public static void main(String[] args) {
        mostrarPI();
    }

    public static void mostrarPI(){
        System.out.println("El valor de PI es: "+PI);
    }
}