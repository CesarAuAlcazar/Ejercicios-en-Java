package org.example;

import javax.swing.*;

public class A26_PaisesArray {
    public static void main(String[] args) {

        String [] paises = new String[4];

        for (int i = 0; i < 4; i++) {

            paises[i] = JOptionPane.showInputDialog("Inserte un país");

        }
        for (String pais : paises) {
            System.out.println("País: " + pais);
        }
    }
}
