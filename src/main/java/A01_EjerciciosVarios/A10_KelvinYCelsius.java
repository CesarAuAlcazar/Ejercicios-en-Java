package A01_EjerciciosVarios;

import java.util.Scanner;

public class A10_KelvinYCelsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una temperatura en Celsius: ");
        int num1 = sc.nextInt();

        double kelvin = num1 + 273.15;
        double farenheit = num1 * 1.8 + 32;

        System.out.println("La temperatura en grados Kelvin de: " + num1 + " grados Celsius es: " + kelvin);
        System.out.println("la temperatura en grados Farenheit de: " + num1 + " grados Celsius es: " + farenheit);
    }
}
