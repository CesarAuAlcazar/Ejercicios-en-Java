package org.example;

import java.util.Scanner;

public class A02_MultiplicaTresNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dígame un número");
        int numero = teclado.nextInt();
        System.out.println("Dígame otro número");
        int numero2 = teclado.nextInt();
        System.out.println("Dígame otro número");
        int numero3 = teclado.nextInt();

        int suma = numero + numero2 + numero3;

        System.out.println("La suma de " + numero + ", "+ numero2 + " y " + numero3 + " = " + (suma));
    }
}
