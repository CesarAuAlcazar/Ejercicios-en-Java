package A02_JFrame;

import javax.swing.*;
import java.awt.*;

public class L07a_ComprobarFuentes {

    public static void main(String[] args) {

        String nombreDeFuente = JOptionPane.showInputDialog("Ingrese el nombre de fuente");

        boolean existeFuente = false;

        // Almacenamos en el array todas las fuentes que existen en el sistema
        String [] tipoDeLetra = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String letra : tipoDeLetra) {
            if (letra.equalsIgnoreCase(nombreDeFuente)) {
                existeFuente = true;
            }
        }

        if (existeFuente) {

            System.out.println("El tipo de letra que quiere existe");
        }else {
            System.out.println("El tipo de letra no existe");
        }

    }
}
