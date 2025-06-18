package org.example;

import java.util.Scanner;

public class A12_AlRevés {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera letra: ");
        char primera = validarEntrada(sc);
        System.out.println("Ingrese la segunda letra: ");
        char segunda = validarEntrada(sc);
        System.out.println("Ingrese la tercera letra: ");
        char tercera = validarEntrada(sc);

        String resultado = (tercera + " " + segunda + " " + primera);

        System.out.println("Las letras introducidas, al revés son: " + resultado);
        sc.close();
    }

    private static char validarEntrada(Scanner sc) {
        while (true) {
            String entrada = sc.nextLine().trim();
            if (entrada.length() == 1) {
                return entrada.charAt(0);
            }
            System.out.print("Error: Ingrese solo un carácter. Inténtelo de nuevo: ");
        }
    }
}
