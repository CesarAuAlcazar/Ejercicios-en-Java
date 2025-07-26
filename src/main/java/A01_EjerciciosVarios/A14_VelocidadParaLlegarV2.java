package A01_EjerciciosVarios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A14_VelocidadParaLlegarV2 {
    private static final int SEGUNDOS_POR_HORA = 3600;
    private static final int METROS_POR_KILOMETRO = 1000;
    private static final float KILOMETROS_POR_MILLA = 1.609f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float distancia = leerNoNegativo(sc, "Ingrese la distancia a recorrer en metros: ");
        float horas = leerNoNegativo(sc, "Ingrese las horas destinadas: ");
        float minutos = leerNoNegativo(sc, "Ingrese los minutos destinados: ");
        float segundos = leerNoNegativo(sc, "Ingrese los segundos destinados: ");

        float segundosTotales = calcularSegundosTotales(horas, minutos, segundos);
        Velocidades velocidades = calcularVelocidades(distancia, segundosTotales);

        mostrarResultados(distancia, velocidades);

        sc.close();
    }

    private static float calcularSegundosTotales(float horas, float minutos, float segundos) {
        return horas * SEGUNDOS_POR_HORA + minutos * 60 + segundos;
    }

    private static Velocidades calcularVelocidades(float distancia, float segundosTotales) {
        float metrosSegundo = distancia / segundosTotales;
        float kilometrosHora = (distancia / METROS_POR_KILOMETRO) / (segundosTotales / SEGUNDOS_POR_HORA);
        float millasHora = kilometrosHora / KILOMETROS_POR_MILLA;

        return new Velocidades(metrosSegundo, kilometrosHora, millasHora);
    }

    private static void mostrarResultados(float distancia, Velocidades v) {
        System.out.printf("\nResultados para %.2f metros:%n", distancia);
        System.out.printf("- Velocidad: %.2f m/s%n", v.metrosSegundo());
        System.out.printf("- Velocidad: %.2f km/h%n", v.kilometrosHora());
        System.out.printf("- Velocidad: %.2f mi/h%n", v.millasHora());
    }

    private static float leerNoNegativo(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                float valor = sc.nextFloat();
                if (valor >= 0) return valor;
                System.out.println("Error: No puede ser negativo.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                sc.next(); // Limpiar buffer
            }
        }
    }

    private record Velocidades(float metrosSegundo, float kilometrosHora, float millasHora) {}
}