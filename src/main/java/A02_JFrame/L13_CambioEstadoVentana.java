package A02_JFrame;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class L13_CambioEstadoVentana {

    public static void main(String[] args) {

        MarcoEstado ventana = new MarcoEstado();

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoEstado extends JFrame {

    public MarcoEstado() {
        setVisible(true);
        setBounds(100, 100, 450, 300);

        CambioEstado nuevoEstado = new CambioEstado();
        addWindowStateListener(nuevoEstado);

    }
}

class CambioEstado implements WindowStateListener {

    public void windowStateChanged(WindowEvent e) {



        if (e.getNewState() == JFrame.MAXIMIZED_BOTH) {
            System.out.println("Tienes la ventana en pantalla completa");
        } else if (e.getNewState() == JFrame.ICONIFIED) {
            System.out.println("Tienes la ventana minimizada");
        } else if (e.getNewState() == JFrame.NORMAL) {
            System.out.println("Tienes la ventana normal");
        }

        System.out.println("La ventana ha cambiado de estado");
        System.out.println("Cambio estado: " + e.getNewState());

    }
}