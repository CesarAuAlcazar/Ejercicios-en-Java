package org.example;

import javax.swing.*;

public class A23_PesoIdealV2 {
    private static final int AJUSTE_MUJER = 120;
    private static final int AJUSTE_HOMBRE = 110;
    private static final int ALTURA_MINIMA = 120;
    private static final int ALTURA_MAXIMA = 220;

    public static void main(String[] args) {
        char género = leerGénero();
        int altura = leerAltura();
        int pesoIdeal = calculoPesoIdeal(género, altura);

        mostrarResultado (altura, pesoIdeal);
    }

    private static char leerGénero() {
        char género;
        do {
            String entrada = JOptionPane.showInputDialog("Ingrese su género: \nH - Hombre\nM - Mujer");
            género = (entrada != null && !entrada.isEmpty()) ?
                    Character.toUpperCase(entrada.charAt(0)) : ' ';
        } while (género != 'H' && género != 'M');
        return género;
    }

    private static int leerAltura() {
        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog("Ingrese el altura: " + ALTURA_MINIMA + "-" + ALTURA_MAXIMA);
                int altura = Integer.parseInt(entrada);
                if (altura >= ALTURA_MINIMA && altura <= ALTURA_MAXIMA) {
                    return altura;
                }
                JOptionPane.showMessageDialog(null, "Ingrese una altura valida entre " + ALTURA_MINIMA + "-" + ALTURA_MAXIMA + " en centímetros");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR: Ingrese una altura válida");
            }
        }
    }

    private static int calculoPesoIdeal(char género, int altura) {
        return género == 'M' ?
                altura - AJUSTE_MUJER :
                altura - AJUSTE_HOMBRE;
    }

    private static void mostrarResultado (int altura, int pesoIdeal) {
        JOptionPane.showMessageDialog(null, "El peso recomendado para una altura de: " + altura + " centímetros es: "
                + pesoIdeal + " kilogramos", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
