/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado, String color, boolean relleno) {
        super(color, relleno);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double Perimetro() {
        return Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return "Cuadrado [ " + "lado=" + lado + super.toString() + " ] ";
    }

}
