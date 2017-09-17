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
public class Empleado extends Persona {

    private String colegio;
    private double sueldo;

    public Empleado(String nombre, String direccion, String colegio,
            double sueldo) {
        super(nombre, direccion);
        this.colegio = colegio;
        this.sueldo = sueldo;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + "colegio=" + colegio + ", sueldo=" + sueldo + '}';
    }
    
    

}
