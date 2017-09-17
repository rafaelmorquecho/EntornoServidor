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
public class Cilindro extends Circulo {

    private double altura;

    public Cilindro() {
        super();
        this.altura = 1.0;
    }

    public Cilindro(double altura) {
        super();
        this.altura = altura;
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public Cilindro(double radio, double altura, String color) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVolumen() {
        return getArea() * altura;
    }

    @Override
    public String toString() {
        return "Cilindro { " + super.toString() + " altura= " + altura + " }";
    }

}
