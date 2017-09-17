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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona empleado = new Empleado("pepe", "calle del pez", "escuela",
                2000);
        System.out.println(empleado);

        Persona estudiante = new Estudiante("Manolo", "calle de la sardina",
                "informatica", 2017, 50);

        System.out.println(estudiante);
    }

}
