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
public class CirculoMovil implements Movil {

    private double radio;
    private PuntoMovil centro;

    public CirculoMovil(int x, int y, int velociadX, int velocidadY, double radio) {
        this.radio = radio;
        this.centro = new PuntoMovil(x, y, velociadX, velocidadY);
    }

    @Override
    public String toString() {
        return "CirculoMovil{" + "radio=" + radio + ", centro=" + centro + '}';
    }

    @Override
    public void subir() {
        centro.y = centro.y + 1 * centro.velocidadY;
    }

    @Override
    public void bajar() {
        centro.y = centro.y - 1 * centro.velocidadY;
    }

    @Override
    public void moverIzquierda() {
        centro.x = centro.x - 1 * centro.velocidadX;
    }

    @Override
    public void moverDerecha() {
        centro.x = centro.x + 1 * centro.velocidadX;

    }

}
