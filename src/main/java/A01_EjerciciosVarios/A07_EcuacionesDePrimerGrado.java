package A01_EjerciciosVarios;

import java.util.Scanner;

public class A07_EcuacionesDePrimerGrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para despejar x: ");
        int num1 = sc.nextInt();

        System.out.println("El resultado para la ecuación -6 + x *  5 es igual a " + (-6 + num1 * 5));
        System.out.println("El resultado para la ecuación (13 - 2) * x es igual a " + ((13 - 2) * num1));
        System.out.println("El resultado para la ecuación (x + (-2)) * (20 /10) es igual a " + ((num1+ (-2)) * (20 / 10)));
        System.out.println("El resultado para la ecuación (12 + x) / (5 - 4) es igual a " + ((12 + num1) / (5 - 4)));
        sc.close();

    }
}
