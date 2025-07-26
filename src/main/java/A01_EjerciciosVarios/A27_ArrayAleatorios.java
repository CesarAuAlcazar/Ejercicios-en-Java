package A01_EjerciciosVarios;

import java.util.Random;

public class A27_ArrayAleatorios {
    public static void main(String[] args) {

        int [] aleatorios = new int[100];

        for (int i = 0; i < aleatorios.length; i++) {

            aleatorios[i] = new Random().nextInt(100);

        }
        for (int ele : aleatorios) {
            System.out.print(ele + ", ");
        }
        // System.out.println(aleatorios.length);
    }
}
