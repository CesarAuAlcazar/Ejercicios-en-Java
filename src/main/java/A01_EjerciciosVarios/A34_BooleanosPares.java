package A01_EjerciciosVarios;

import javax.swing.*;

public class A34_BooleanosPares {
    public static void main(String[] args) {

        int numero = 0;
        int numero1 = 0;
        boolean resultado = false;

        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero, por favor"));
            numero1 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero entero, por favor"));

            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Debe ingresar un número entero",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        if (numero % 2 == 0 && numero1 % 2 == 0) {
            resultado = true;

            System.out.println("Los números ingresados son pares: " + resultado);
        } else {
            System.out.println("Los números ingresados son pares: " + resultado);
        }
    }
}

