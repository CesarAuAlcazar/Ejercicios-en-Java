package org.example;

import javax.swing.*;

public class A35_V2BooleanosPares {

        public static void main(String[] args) {

            try {
                int numero1 = leerNumero("Ingrese un número entero, por favor");
                int numero2 = leerNumero("Ingrese otro número entero, por favor");

                boolean ambosPares = ambosSonPares (numero1, numero2);
                mostrarResultado (ambosPares);

            } catch(NumberFormatException e){
                mostrarError("Debe introducir número enteros");
            }
        }

        private static int leerNumero(String mensaje) throws NumberFormatException {
            String input = JOptionPane.showInputDialog(mensaje);
            return Integer.parseInt(input);
    }

    private static boolean ambosSonPares (int numero1, int numero2) {
            return numero1 % 2 == 0 && numero2 % 2 == 0;
    }

    private static void mostrarResultado (boolean ambosPares) {
            String mensaje = ambosPares ? "✅ Ambos número SI son pares" : "⛔ Al menos uno de los números introducidos no es par";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void mostrarError (String mensaje) {
            JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
