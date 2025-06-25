package org.example;

import javax.swing.*;

public class A31_V2Vocales {
    public static void main(String[] args) {

        String entrada = JOptionPane.showInputDialog("Ingrese un carácter, por favor");

        if (entrada == null || entrada.length() != 1) {
            JOptionPane.showMessageDialog(null, "Debe ingresar solamente un carácter, por favor",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        char caracter = entrada.toLowerCase().charAt(0);
        String tipo = clasificadoDeCaracter(caracter);

        JOptionPane.showMessageDialog(null, "El carácter " + entrada + " es " + tipo,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String clasificadoDeCaracter(char c) {

        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> "Vocal";
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' -> "una consonante";
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> "un número";
            default -> "Un carácter especial";
        };
    }
}
