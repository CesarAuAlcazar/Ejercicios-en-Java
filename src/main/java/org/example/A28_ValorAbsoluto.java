package org.example;

import javax.swing.*;

public class A28_ValorAbsoluto {
    public static void main(String[] args) {

        int numero = leerNumero();
        int absoluto = calcularAbsoluto(numero);
        mostrarResultado(numero, absoluto);
    }

    private static int leerNumero() {
        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog("Ingrese un número");
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR. Ingrese un número válido");
            }
        }
    }

    private static int calcularAbsoluto(int numero) {
        return (numero < 0) ? -numero : numero;
    }

    private static void mostrarResultado(int numero, int absoluto) {
        JOptionPane.showMessageDialog(null, "El absoluto de: "  + numero + " es: " + absoluto  ,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}






