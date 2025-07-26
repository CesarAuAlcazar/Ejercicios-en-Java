package A01_EjerciciosVarios;

import java.util.Scanner;

public class A20_OtraCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese un operador:");
        char operador = sc.next().charAt(0);
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        double resultado = 0;

        if (operador == '+') {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma de " + num1 + " + " + num2 + " es: " + resultado);
        } else if (operador == '-') {
            resultado = num1 - num2;
            System.out.println("El resultado de la reesta de " + num1 + " - " + num2 + " es: " + resultado);
        } else if (operador == '*') {
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación de " + num1 + " * " + num2 + " es: " + resultado);
        }else if (operador == '/') {
            resultado = num1 / num2;
            System.out.println("El resultado de la división de " + num1 + " / " + num2 + " es: " + resultado);
        }else {
            System.out.println("Carácter no reconocido");
        }
    sc.close();}
}
