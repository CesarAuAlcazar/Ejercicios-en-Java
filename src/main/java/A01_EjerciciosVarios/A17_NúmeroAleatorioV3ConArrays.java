package A01_EjerciciosVarios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A17_NúmeroAleatorioV3ConArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.println("Introduzca el primer número entero: ");
        numeros[0] = sc.nextInt();
        System.out.println("Introduzca el segundo número entero: ");
        numeros[1] = sc.nextInt();
        System.out.println("Introduzca el tercer número entero: ");
        numeros[2] = sc.nextInt();

        Arrays.sort(numeros); // Ordena el array de menor a mayor
        int min = numeros[0];
        int max = numeros[2];

        Random rand = new Random();
        int nAleatorio = rand.nextInt((max - min) + 1) + min;

        System.out.println("\nNúmeros ordenados: " + Arrays.toString(numeros));
        System.out.println("El número aleatorio entre " + min + " y " + max + " es: " + nAleatorio);

        sc.close();
    }
}

