package A01_EjerciciosVarios;

import javax.swing.*;

public class A37_OperadorCondicionalAnidado {
    public static void main(String[] args) {
        try {
            int numero1 = leerNumero("Introduzca un número entero, por favor");
            int numero2 = leerNumero("Introduzca un número entero, por favor");

             int positivos = contarSignos(numero1, numero2);
             mostrarResultados(positivos);

        } catch (Exception e) {
            mostrarError("Debe introducir números enteros");
        }
    }

    private static int leerNumero (String mensaje) throws NumberFormatException{
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    private static int contarSignos (int numero1, int numero2) {
        return (numero1 > 0 ? 1 : 0) + (numero2 > 0 ? 1 : 0);
    }

    private static void mostrarResultados (int cantidad) {
        String mensaje = switch (cantidad) {
            case 0 -> "Ningún número es positivo";
            case 1 -> "Solo un número es positivo";
            case 2 -> "Los dos números son positivos";
            default -> "Esto no va a pasar nunca";
        };
        JOptionPane.showMessageDialog(null, mensaje, "\n Total: " + cantidad + "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void mostrarError (String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
