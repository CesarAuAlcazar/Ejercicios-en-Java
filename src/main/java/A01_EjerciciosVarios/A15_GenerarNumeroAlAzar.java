package A01_EjerciciosVarios;

import java.util.Random;
import java.util.Scanner;

public class A15_GenerarNumeroAlAzar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero entero (inferior): ");
        int min = sc.nextInt() ;

        System.out.println("Introduzca un numero entero (superior): ");
        int max = sc.nextInt() ;

        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
            System.out.println("Intercambiamos los valores para corregir el rango en caso de error al introducir los datos");
        }

        Random rand = new Random();
        int nAleatorio = rand.nextInt((max - min) + 1) + min;

        System.out.println("\nNúmero aleatorio entre " + min + " y " + max + ": " + nAleatorio);

        sc.close();
    }
}
