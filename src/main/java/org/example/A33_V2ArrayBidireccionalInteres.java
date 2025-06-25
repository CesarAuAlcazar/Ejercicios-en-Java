package org.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class A33_V2ArrayBidireccionalInteres {

    private static final int AÑOS = 5;
    private static final int TASAS_INTERES = 6;
    private static final double INTERES_INICIAL = 0.10;
    private static final double INVERSION_INICIAL = 10000;
    private static final double INCREMENTO_INTERES = 0.01;

    public static void main(String[] args) {
        double[][] proyecciones = calcularProyeccionFinanciera();
        mostarProyecciones(proyecciones);
    }

    private static double[][] calcularProyeccionFinanciera() {
        double [][] saldos = new double[TASAS_INTERES][AÑOS];
        double tasaActual = INTERES_INICIAL;

        for (int tasa= 0; tasa < TASAS_INTERES; tasa++) {
            double acumulado = INVERSION_INICIAL;
            saldos[tasa][0] = acumulado;

            for (int año = 1; año < AÑOS; año++) {
                acumulado *= (1 + tasaActual);
                saldos [tasa][año] = acumulado;
            }

            tasaActual += INCREMENTO_INTERES;
        }

        return saldos;
    }

    private static void mostarProyecciones(double[][] saldos) {
        System.out.println("\nProyección de la inversión a 5 años con diferentes tasas de interés: ");
        System.out.println("-------------------------------------------------------------------------------------");

        for (int tasa = 0; tasa < TASAS_INTERES; tasa++) {
            System.out.printf("\nTasa %.2f%%: ", (INTERES_INICIAL + tasa * INCREMENTO_INTERES) * 100);
            for (int año = 0; año < AÑOS; año++) {
                System.out.printf("Año %d: %,.2f   ", año + 1, saldos[tasa][año]);
            }
        }
    }
}
