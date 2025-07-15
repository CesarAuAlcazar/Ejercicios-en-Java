package org.example;

import java.util.Scanner;

public class A40_Multiplicaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");

        // Uso de try-finally para que el scanner se cierre con error

        try {
            int numero = sc.nextInt();
            if (numero < 0) {
                System.out.println("El número debe ser positivo");
                return;
            }

            System.out.println("\nLa tabla del " + numero + " es: \n");

            for (int i = 0; i <= 10; i++) {
                System.out.println(numero + " * " + i + " = " + (numero * i));
            }
        }finally {
            sc.close();
        }
    }
}
