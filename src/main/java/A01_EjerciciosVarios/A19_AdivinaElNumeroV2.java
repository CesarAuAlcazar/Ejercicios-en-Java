package A01_EjerciciosVarios;

import java.util.Scanner;

public class A19_AdivinaElNumeroV2 {
    // Constantes para mejor mantenibilidad
    private static final int RANGO_MINIMO = 1;
    private static final int RANGO_MAXIMO = 100;
    private static final int INTENTOS_MAXIMOS = 10;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numAleatorio = (int)(Math.random()*RANGO_MAXIMO) + RANGO_MINIMO;
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("¡Adivina el numero entre " + RANGO_MINIMO + " y " +RANGO_MAXIMO + "!");

        while (intentos < INTENTOS_MAXIMOS && !adivinado) {
            intentos++;
            System.out.println("Intento número: " + intentos + ":");
            int numUsuario = leerNumeroValido(entrada);

            if (numUsuario == numAleatorio) {
                adivinado = true;
                System.out.println("¡CORRECTO! El número era: " + numAleatorio + ". Lo adivinaste en " + intentos + " intentos.");
            } else if (numUsuario < numAleatorio) {
                System.out.println("El número que buscas es más alto");
            }
            else {
                System.out.println("El número que buscas es más bajo");
            }
        }
        if (!adivinado) {
            System.out.println("Gracias por participar, agotaste tus " + INTENTOS_MAXIMOS + " intentos. El número que buscabas era el: " + numAleatorio);
        }
        entrada.close();
    }

    // Método para evitar números fuera de rango
    private static int leerNumeroValido(Scanner sc) {
        while (true) {
            try {
                int num = sc.nextInt();
                if (num >= RANGO_MINIMO && num <= RANGO_MAXIMO) return num;
                System.out.println("El número introducido no es valido. Ingresa un numero entre: " + RANGO_MINIMO + " y " +RANGO_MAXIMO + ":");
            } catch (Exception e) {
                System.out.println("¡Error! Ingresa un número válido: ");
                sc.next();
            }
        }
    }
}
