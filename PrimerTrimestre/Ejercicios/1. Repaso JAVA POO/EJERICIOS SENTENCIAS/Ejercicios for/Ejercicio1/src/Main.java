/*Se leerá el número de temperaturas a introducir (de ser 0 o negativo se
establecerá a 10). Una vez introducidos todos los números por parte del usuario,
 obtener la media con dos decimales de las temperaturas introducidas por consola.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float suma = 0, media, temperatura;
        int bucle;

        System.out.println("Digite el número de repeticiones:");
        bucle = entrada.nextInt();

        if(bucle <= 0) {
            bucle = 10;  // Cambiar bucle a 10 si es 0 o negativo
        }

        for(int i = 0; i < bucle; i++) {
            System.out.println("Digite la temperatura " + (i + 1) + ":");
            temperatura = entrada.nextFloat();
            suma = suma + temperatura;
        }

        media = suma / bucle;
        media = Math.round(media * 100.0f) / 100.0f;  // Redondear a dos decimales

        System.out.println("La media es: " + media);
    }
}
