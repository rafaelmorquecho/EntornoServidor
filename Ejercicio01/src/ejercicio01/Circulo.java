/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author Rafa
 */
public class Circulo {

    private double radio;
    private String color;

    public Circulo() {
        this.radio = 1.0;
        this.color = "rojo";
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.color = "rojo";
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(radio, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo [ radio = " + radio + ", color = " + color + " ]";
    }
}
