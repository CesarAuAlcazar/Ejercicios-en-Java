package A01_EjerciciosVarios;

import java.util.Scanner;

public class A13_ValorDoble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de un lado: ");
        int lado1 = sc.nextInt();
        System.out.println("Ingrese el valor de otro lado: ");
        int lado2 = sc.nextInt();

        double perímetro = ((lado1 * 2) + (lado2 * 2));
        double area = lado1 * lado2;
        double diagonal = Math.sqrt((lado1 * lado1) + (lado2 * lado2));

        System.out.println("El perímetro del cuadrado con base " + lado1 + " y altura " + lado2 + " es igual a: " + perímetro);
        System.out.println("El área del cuadrado con base" + lado1 + " y altura " + lado2 + " es igual a: " + area);
        System.out.println("La diagonal del cuadrado con base " + lado1 + " y altura " + lado2 + " es igual a: " + diagonal);
        sc.close();
    }
}
