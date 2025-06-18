package org.example;

import java.util.Scanner;

public class A09_OperacionesEquivalentes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el primer numero: ");
        int num3 = sc.nextInt();

        double resultado = Double.parseDouble (String.valueOf((num1 + num2) * num3));
        double resultado2 = Double.parseDouble (String.valueOf((num1 * num3 + num3 * num2)));

        System.out.println("El resultado de la operación (a+b)*c es igual a: " + resultado);
        System.out.println("El resultado de la operación a * c + b * c es igual a: " + resultado2);

        sc.close();
    }
}
