package A01_EjerciciosVarios;

import javax.swing.*;

public class A24_FactorialDeUnNúmero {
    public static void main(String[] args) {

        int número = leerNúmero();
        long factorial = cálculoFactorial(número);
        mostrarResultado(número, factorial);

    }

    private static int leerNúmero(){
        while (true){
            try {
                String entrada = JOptionPane.showInputDialog("Introduzca un número entero entre 0 y 20");
                int num = Integer.parseInt(entrada);
                if (num >= 0 && num <= 20) {
                    return num;
                }
                JOptionPane.showMessageDialog(null, "Ingrese un número entre 0 y 20");
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR. Ingrese un número válido");
            }
        }
    }

    private static long cálculoFactorial(long n) {
        long resultado = 1;
        for (long i = n; i > 0 ; i--) {
            resultado *= i;
        }
        return resultado;
    }

    private static void mostrarResultado(int número, long resultado) {
        JOptionPane.showMessageDialog(null, "El factorial de: " + número + " es: " + resultado,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
