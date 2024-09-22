/*Crea un método que admita como parámetros dos números y muestre
por consola su suma.*/

public class Main {
    public static void main(String[] args) {
        sumarNumeros(5, 8);
    }

    public static void sumarNumeros(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es: " + resultado);
    }
}
