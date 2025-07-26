package A01_EjerciciosVarios;

import javax.swing.*;
import java.math.BigInteger;

public class A25_FactorialBigInteger {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Ingrese un número positivo");
        try {
            int num = Integer.parseInt(entrada);
            if (num < 0) throw  new NumberFormatException();

            BigInteger factorial = calcularFactorialBigInteger(num);
            JOptionPane.showMessageDialog(null, "El factorial del número " + num + " es = " + factorial.toString(),
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El número tiene que ser positivo",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    private static BigInteger calcularFactorialBigInteger(int n) {
        BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }
}
