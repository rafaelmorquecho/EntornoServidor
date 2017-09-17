/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

/**
 *
 * @author Rafa
 */
public class PuntoMovil implements Movil {

    int x;
    int y;
    int velocidadX;
    int velocidadY;

    public PuntoMovil(int x, int y, int velocidadX, int velocidadY) {
        this.x = x;
        this.y = y;
        this.velocidadX = velocidadX;
        this.velocidadY = velocidadY;
    }

    @Override
    public String toString() {
        return "PuntoMovil{" + "x=" + x + ", y=" + y + ", velocidadX=" + velocidadX + ", velocidadY=" + velocidadY + '}';
    }

    @Override
    public void subir() {
        y = y + 1*velocidadY;
    }

    @Override
    public void bajar() {
        y = y - 1 * velocidadY;
    }

    @Override
    public void moverIzquierda() {
        x = x - 1 * velocidadX;
    }

    @Override
    public void moverDerecha() {
        x = x + 1 * velocidadX;
    }

}
