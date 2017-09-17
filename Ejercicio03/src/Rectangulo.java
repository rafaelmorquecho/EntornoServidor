/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class Rectangulo extends Figura {

    private double ancho;
    private double largo;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public Rectangulo(double ancho, double largo, String color, boolean relleno) {
        super(color, relleno);
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public double getArea() {
        return ancho * largo;
    }

    @Override
    public double Perimetro() {
        return ancho * 2 + largo * 2;
    }

    @Override
    public String toString() {
        return "Rectangulo[" + "ancho=" + ancho + ", largo=" + largo + super.toString() + " ]";
    }

}
