package org.example;

import javax.swing.*;

public class A29_PositivoNegativo {
    public static void main(String[] args) {

        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número, por favor"));

            mostrarNumero(numero);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "¡Debe ingresar un numero válido",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void mostrarNumero(int numero) {
        String mensaje;

        if (numero < 0) {
            mensaje = "El número introducido, " + numero + ", es negativo";
        } else if (numero > 0) {
            mensaje = "El número introducido, " + numero + ", es positivo";
        } else {
            mensaje = "El número introducido es cero";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
