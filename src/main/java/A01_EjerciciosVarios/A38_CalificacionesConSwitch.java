package A01_EjerciciosVarios;

import javax.swing.*;

public class A38_CalificacionesConSwitch {
    public static void main(String[] args) {
        try {
            double calificacion = leerCalificacion("Introduzca su calificación, por favor");
            String nota = determinarNota(calificacion);
            mostrarNota(calificacion, nota);

        } catch (NumberFormatException e) {
            mostrarError("Debe introducir una calificación correcta");
        } catch (IllegalArgumentException e) {
            mostrarError(e.getMessage());
        }
    }

    private static double leerCalificacion(String mensaje) throws NumberFormatException {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

    private static String determinarNota(double calificacion) {
        if (calificacion < 0 || calificacion > 10) {
            throw new IllegalArgumentException("La calificación debe ser entre 0 y 10");
        }

        // Com Math.floor se redondea hacia abajo para evaluar rangos
        return switch ((int) Math.floor(calificacion)) {
            case 10 -> calificacion == 10 ? "Matrícula de Honor" : "Sobresaliente";
            case 9 -> "Sobresaliente";
            case 8, 7 -> "Notable";
            case 6 -> "Bien";
            case 5 -> "Aprobado";
            default -> "Suspenso";
        };
    }

    private static void mostrarNota (double calificacion, String nota) {
        /*
        String format permite crear cadenas formateadas usando % (placeholder)
        %.2 Se reemplaza por el valor de nota con dos decimales
        %s Se reemplaza por el valor de nota
         */
        String mensaje = String.format("Calificación de: %.2f\nNota: %s", calificacion, nota);
        JOptionPane.showMessageDialog(null, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void mostrarError (String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}


