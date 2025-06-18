package org.example;

import java.util.Scanner;

public class A01_LecturaEntradaUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dígame un número");

        // Espera a que el usuario presione Enter
        int numero = input.nextInt();

        System.out.println("El resultado de " + numero + " al cuadrado es = " + (numero * numero));
        input.close();
    }
}