/*
 Construir un programa que permita dirigir el movimiento de un objeto dentro de
un tablero y actualice su posicion dentro del mismo. Los movimientos posibles
son ARRIBA, ABAJO, IZQUIERDA Y DERECHA. Tras cada moviento el programa mostrara
la nueva direccion elegida y las coordenadas de situacion del objeto dentro del
tablero.
 */
package ejercicio1;

/**
 *
 * @author luis
 */
public class Posicion {
    int x;
    int y;

    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moverArriba() {
        y++;
    }

    public void moverAbajo() {
        y--;
    }

    public void moverIzquierda() {
        x--;
    }

    public void moverDerecha() {
        x++;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
