package A01_EjerciciosVarios;

import java.util.Scanner;

public class A04_DivisionEntreCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte un número: ");
        int a = sc.nextInt();
        System.out.println("Inserte otro número: ");
        int b = sc.nextInt();

        if (b != 0) {
            int resultado = a / b;
            System.out.println("La división de " + a + " entre " + b + " es: " + resultado);
        }else {
            System.out.println("No se puede dividir entre 0");
        }
        sc.close();
    }
}
