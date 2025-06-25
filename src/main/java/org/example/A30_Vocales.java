package org.example;

import javax.swing.*;

public class A30_Vocales {
    public static void main(String[] args) {

        String letra = JOptionPane.showInputDialog("Ingrese un carácter, por favor");

        String resultado = switch (letra) {
            case "a", "e", "i", "o", "u" -> "Vocal";
            default -> "El carácter introducido no es una vocal";
        };

        JOptionPane.showMessageDialog(null, "El carácter introducido " + resultado,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}

