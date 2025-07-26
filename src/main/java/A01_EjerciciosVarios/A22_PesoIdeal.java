package A01_EjerciciosVarios;

import javax.swing.*;

public class A22_PesoIdeal {
    public static void main(String[] args) {

        String género = "";

        do {
            género = JOptionPane.showInputDialog("Ingrese sú género (M ó H)");
        } while (género.equalsIgnoreCase("H") == false && género.equalsIgnoreCase("M") == false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura en centímetros"));

        int pesoIdeal = 0;

        if (género.equalsIgnoreCase("M")) {
            pesoIdeal = altura - 120;
        }else if (género.equalsIgnoreCase("H")) {
            pesoIdeal = altura - 110;
        }

        System.out.println("El peso ideal para " + altura + " centimetros de altura es: " + pesoIdeal);
    }
}
