/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        Figura figura = new Circulo(25);
        System.out.println(figura);

        figura = new Rectangulo(25, 10);
        System.out.println(figura);

        figura = new Cuadrado(25);
        System.out.println(figura);

    }

}
