package A01_EjerciciosVarios;

import java.util.Scanner;

public class A41_NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        boolean esPrimo = true;

        try {
            int x = sc.nextInt();
            int divisor = 2;

            if (x <= 0) {
                System.out.println("El número debe ser positivo");
                return;
            }
            while (divisor < x) {
                if (x % divisor == 0) {
                    esPrimo = false;
                    break;
                }
                divisor++;
            }
            if (esPrimo) {
                System.out.println("El número " + x + " es primo");
            } else {
                System.out.println("El número " + x + " no es primo");
            }

        } finally{
                sc.close();
            }
    }
}


