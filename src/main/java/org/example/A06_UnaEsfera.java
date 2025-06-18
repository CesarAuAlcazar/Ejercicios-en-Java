package org.example;

import java.util.Scanner;

public class A06_UnaEsfera {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera a calcular: ");
        int radio = sc.nextInt();

        final double superficie =  4 * Math.pow(radio, 2) * Math.PI;
        final double volumen = (4.0 / 3) * Math.pow(radio, 3) * Math.PI;

        System.out.println("El volumen de la esfera con un radio de " + radio + " es igual a " + volumen);
        System.out.println("La superficie de la esfera con un radio de " + radio + " es igual a " + superficie);

        sc.close();
    }
}
