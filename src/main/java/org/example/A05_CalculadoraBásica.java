package org.example;

import java.util.Scanner;

public class A05_CalculadoraBásica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;
        System.out.println("El resultado de la suma del número " + num1 + " más el número " + num2 + "es: " + suma);
        double resta = num1 - num2;
        System.out.println("El resultado de la resta del número " + num1 + " menos el número " + num2 + "es: " + resta);
        double multiplicacion = num1 * num2;
        System.out.println("El resultado de la multiplicación del número " + num1 + " por el número " +num2 + "es: " + multiplicacion);
        double division = num1 / num2;
        System.out.println("El resultado de la división del número " + num1 + " entre el número " +num2 + "es: " + division);
        double mod = num1 % num2;
        System.out.println("El resto de la división del número " + num1 + " entre el número " +num2 + "es: " + mod);

        sc.close();




    }
}
