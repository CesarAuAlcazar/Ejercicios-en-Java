package A01_EjerciciosVarios;

import java.util.Random;
import java.util.Scanner;

public class A16_NúmeroAleatorioV2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer numero entero: ");
        int n1 = sc.nextInt() ;

        System.out.println("Introduzca el segundo numero entero: ");
        int n2 = sc.nextInt() ;

        System.out.println("Introduzca el tercer número entero: ");
        int n3 = sc.nextInt() ;

        int min = Math.min(n1, Math.min(n2, n3));
        int max = Math.max(n1, Math.max(n2, n3));

        Random rand = new Random();
        int nAleatorio = rand.nextInt((max - min) + 1) + min;

        System.out.println("\nEl número aleatorio entre " + min + " y " + max + " es: " + nAleatorio);

        sc.close();
    }
}

