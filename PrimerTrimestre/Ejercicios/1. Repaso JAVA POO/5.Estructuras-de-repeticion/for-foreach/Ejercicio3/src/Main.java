/*Generar 100 números aleatorios entre 1 y 1000 (Math.random()*1001),
ambos incluisve, mostrar cada número generado y contabilizar cuántos
de ellos son pares.*/


public class Main {
    public static void main(String[] args) {
        int pares = 0;

        for (int i = 0; i < 100; i++) {
            // Generar un número aleatorio entre 1 y 1000
            int numero = (int) (Math.random() * 1000) + 1;
            System.out.println(numero);

            if (numero % 2 == 0) {
                pares++;
            }
        }

        System.out.println("El número de números pares es: " + pares);
    }
}
