package org.example;

import java.util.Scanner;

public class A14_VelocidadParaLlegar {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la distancia a recorrer en metros: ");
        float distancia = sc.nextFloat();
        System.out.println("Ingrese las horas destinadas: ");
        float horas = sc.nextFloat();
        System.out.println("Ingrese los minutos destinados: ");
        float minutos = sc.nextFloat();
        System.out.println("Ingrese los segundos destinados: ");
        float segundos = sc.nextFloat();

        float segundosTotales = (horas * 3600) + (minutos * 60) + segundos;

        float metrosSegundo = distancia / segundosTotales;
        float kilometrosHora = (distancia / 1000) / (segundosTotales / 3600);
        float millasHora = kilometrosHora / 1.609f;

        System.out.println("La velocidad para recorrer " + distancia + " es igual a " + metrosSegundo + " m/s");
        System.out.println("La velocidad para recorrer " + distancia + " es igual a " + kilometrosHora + " Km/h");
        System.out.println("La velocidad para recorrer " + distancia + " es igual a " + millasHora + " M/h");
        sc.close();
    }
}
