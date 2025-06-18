package org.example;

import java.util.Scanner;

public class A11_RangoDeValores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de x menor: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el valor de x mayor: ");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            double y = i * i -2 * i + 1;
            System.out.println("El valor de y, para la función y = x * x -2 * x + 1, donde x es " + i + " es igual a: " + y);
        }
    }
}
