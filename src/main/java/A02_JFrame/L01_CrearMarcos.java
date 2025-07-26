package A02_JFrame;

import javax.swing.*;

public class L01_CrearMarcos {
    public static void main(String[] args) {

        MiMarco marco1 = new MiMarco();

        marco1.setVisible(true);

        // Para parar la ejecución cuando se cierre la ventana
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

        class MiMarco extends JFrame {

            public MiMarco() {

                // setSize(800, 500);

                // setLocation(500, 300);

                // Esto es igual que lo de arriba
                setBounds(500, 300, 800, 500);

                // Para que no se pueda redimensionar ni con el ratón
                // setResizable(false);

                // Ventana en pantalla completa
                // setExtendedState(JFrame.MAXIMIZED_BOTH);

                setTitle("Mi primera ventana");
            }
        }


