package A01_EjerciciosVarios;

import java.util.Scanner;

public class A42_ImparesDescendente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número entero positivo mayor");
        int numeroMayor = sc.nextInt();
        System.out.println("Ingrese un número entero positivo inferior al anterior");
        int numeroMenor = sc.nextInt();

        try {
            if (numeroMayor <= 0 || numeroMenor <= 0) {
                System.out.println("Uno de los número no es entero o positivo");
            }

            if (numeroMayor % 2 == 0) {
                numeroMayor--;
            }

            while (numeroMayor >= numeroMenor) {
                System.out.print(numeroMayor);
                numeroMayor -=2;
                if (numeroMayor >= numeroMenor) {
                    System.out.print(", ");
                }
            }
        } finally {
            sc.close();
        }
    }
}
