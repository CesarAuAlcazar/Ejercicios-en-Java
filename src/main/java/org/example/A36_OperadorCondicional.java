package org.example;

import javax.swing.*;

public class A36_OperadorCondicional {
    public static void main(String[] args) {
        try {
            int numero1 = leerNumero("Introduzca un número entero, por favor");
            int numero2 = leerNumero("Introduzca un número entero, por favor");

            verificarSignos(numero1, numero2);

        } catch (Exception e) {
            mostrarError("Debe introducir números enteros");
        }
    }

    private static int leerNumero (String mensaje) throws NumberFormatException{
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    private static void verificarSignos (int numero1, int numero2) {
        String resultado = "Resultados:\n" +
                determinarSigno(numero1) + "\n" +
                determinarSigno(numero2) + "\n" +
                compararSignos(numero1, numero2);
        JOptionPane.showMessageDialog(null, resultado, "Análisis de signos", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String determinarSigno (int numero) {
        if (numero > 0) return numero + " es positivo";
        else if (numero < 0) return numero + " es negativo";
        else return numero + " es cero";
    }

    private static String compararSignos (int numero1, int numero2) {
        if (numero1 > 0 && numero2 > 0) return "Los dos números son positivos: " + numero1 + " y " + numero2;
        else if (numero1 < 0 && numero2 < 0) return "Los dos números son negativos: " + numero2 + " y " + numero1;
        else if (numero1 == 0 && numero2 == 0) return "Los dos números son cero: " + numero1 + " y " + numero2;
        else return "Tienen signos diferentes: " + numero1 + " y " + numero2;
    }

    private static void mostrarError (String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}


