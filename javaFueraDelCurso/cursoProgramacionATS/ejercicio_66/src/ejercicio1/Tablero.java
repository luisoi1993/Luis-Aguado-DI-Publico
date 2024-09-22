/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author luis
 */
import java.util.Scanner;

public class Tablero {
    private int ancho;
    private int alto;
    private Posicion posicion;

    public Tablero(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.posicion = new Posicion(0, 0); // Posición inicial en (0, 0)
    }

    public void mover(String direccion) {
        switch (direccion.toUpperCase()) {
            case "ARRIBA":
                if (posicion.y < alto - 1) posicion.moverArriba();
                break;
            case "ABAJO":
                if (posicion.y > 0) posicion.moverAbajo();
                break;
            case "IZQUIERDA":
                if (posicion.x > 0) posicion.moverIzquierda();
                break;
            case "DERECHA":
                if (posicion.x < ancho - 1) posicion.moverDerecha();
                break;
            default:
                System.out.println("Movimiento no válido.");
                return;
        }
        System.out.println("Movimiento: " + direccion);
        System.out.println("Nueva posición: " + posicion);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el ancho y alto del tablero:");
        int ancho = scanner.nextInt();
        int alto = scanner.nextInt();

        Tablero tablero = new Tablero(ancho, alto);

        String direccion;
        do {
            System.out.println("Introduce la dirección (ARRIBA, ABAJO, IZQUIERDA, DERECHA) o 'SALIR' para terminar:");
            direccion = scanner.next();
            if (!direccion.equalsIgnoreCase("SALIR")) {
                tablero.mover(direccion);
            }
        } while (!direccion.equalsIgnoreCase("SALIR"));

        scanner.close();
    }
}
