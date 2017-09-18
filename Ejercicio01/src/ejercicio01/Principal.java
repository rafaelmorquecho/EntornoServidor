package ejercicio01;

/**
 *
 * @author Rafa
 */
public class Principal {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        System.out.println(circulo);
        System.out.println("Area = " + circulo.getArea());

        Circulo circulo2 = new Circulo(6);
        System.out.println(circulo2);
        System.out.println("Area =" + circulo2.getArea());

        Cilindro cilindro = new Cilindro();
        System.out.println(cilindro);
        System.out.println("volumen " + cilindro.getVolumen());

        Cilindro cilindro2 = new Cilindro(4, 2);
        System.out.println(cilindro2);
        System.out.println("volumen " + cilindro2.getVolumen());

        //polimorfismo
        Circulo cilindro3 = new Cilindro(4, 3, "verde");
        System.out.println(cilindro3);

        if (cilindro3 instanceof Cilindro) {

            System.out.println("volumen " + ((Cilindro) cilindro3).getVolumen());

        }

    }
}
