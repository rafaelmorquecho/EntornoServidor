/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author Rafa
 */
public class Estudiante extends Persona {

    private String programa;
    private int year;
    private double cuota;

    public Estudiante(String nombre, String direccion, String programa,
            int year, double cuota) {
        super(nombre, direccion);
        this.programa = programa;
        this.year = year;
        this.cuota = cuota;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + super.toString() + "programa=" + programa + ", "
                + "year=" + year + ", cuota=" + cuota + '}';
    }

}
