package A01_EjerciciosVarios;

import java.util.Scanner;

public class A08_MediaAritmética {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();
        System.out.println("Ingrese el cuarto numero: ");
        int num4 = sc.nextInt();

        double resultado = (num1 + num2 + num3 + num4) / 4;

        System.out.println("La media aritmética de los cuatro números ingresados es: " + resultado);
        sc.close();
    }
}
