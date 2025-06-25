package org.example;

import java.util.Scanner;

public class A21_OtraCalculadoraV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = leerNumero(sc, "Ingrese el primer número: ");
        char operador = leerOperador(sc);
        double num2 = leerNumero(sc, "Ingrese el segundo número: ");

        calculoYResultado(num1, operador, num2);

        sc.close();
    }

    // Método para garantizar la entrada de los números
    private static double leerNumero(Scanner sc, String mensaje) {
        while (true){
            System.out.println(mensaje);
            try{
            return Double.parseDouble(sc.nextLine());
        }catch (NumberFormatException e){
                System.out.println("ERROR: Debe ingresar un numero válido.");
            }
        }
    }

    // Método para controlar que el operador sea correcto
    private static char leerOperador(Scanner sc) {
        while (true) {
            System.out.println("Ingrese el operador (+, -, *, /): ");
            String entrada = sc.nextLine().trim();
            if (entrada.length() == 1 && "+-*/".contains(entrada)) {
                return entrada.charAt(0);
            }
            System.out.println("ERROR. Utilice un operador válido (+, -, *, /)");
        }
    }

    // Método para realizar los cálculos
    private static void calculoYResultado(double num1, char operador, double num2) {
        double resultado;
        String operacion;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                operacion = "suma";
                break;
           case '-':
                resultado = num1 - num2;
                operacion = "resta";
                break;
           case '*':
                resultado = num1 * num2;
                operacion = "multiplicación";
                break;
           case '/':
                    if (num2 == 0) {
                    System.out.println("ERROR: No se puede dividir entre 0");
                    return;
                    }
                    resultado = num1 / num2;
                    operacion = "división";
                    break;
           default:
                    System.out.println("\nEl resultado de la %s es %.2\n");
        }
    }
}
