package A01_EjerciciosVarios;

import java.util.Scanner;

public class A03_DivisionDeDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        int division = num1 / num2;
        int resto = num1 % num2;

        System.out.println("La división del " + num1 + " entre " + num2 + " es " + division);
        System.out.println("El resto del " + num1 + " entre " + num2 + " es " + resto);

        sc.close();
    }
}
