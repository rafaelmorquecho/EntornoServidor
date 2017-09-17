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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Movil m1 = new PuntoMovil(5, 6, 10 ,10);
        System.out.println(m1);
        m1.moverIzquierda();
        System.out.println(m1);
        Movil m2 = new CirculoMovil(2, 1, 2, 2, 20);
        System.out.println(m2);
        m2.moverDerecha();
        System.out.println(m2);
    }

}
