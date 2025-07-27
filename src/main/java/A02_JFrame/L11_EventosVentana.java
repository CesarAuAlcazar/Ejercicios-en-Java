package A02_JFrame;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class L11_EventosVentana {

    public static void main(String[] args) {

        MarcoVentana ventana = new MarcoVentana();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MarcoVentana ventana2 = new MarcoVentana();
        ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ventana.setTitle("Eventos en ventana 1");
        ventana.setBounds(100, 100, 450, 300);
        ventana2.setTitle("Eventos en ventana 2");
        ventana2.setBounds(200, 200, 450, 300);

    }
}

class MarcoVentana extends JFrame {

    public MarcoVentana() {

        //setTitle("Marco Ventana");

        //setBounds(200, 200, 1000, 700);

        setVisible(true);

        CapaVentana oyenteVentana = new CapaVentana();

        addWindowListener(oyenteVentana);
    }
}

class CapaVentana implements WindowListener {

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Se ha activado una ventana");
    }
    public void windowClosed(WindowEvent e) {
        System.out.println("Se ha cerrado la ventana2");
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("Se ha cerrado una ventana");
    }
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Se ha deactivado una ventana");
    }
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Se ha restaurado una ventana");
    }
    public void windowIconified(WindowEvent e) {
        System.out.println("Se ha minimizado una ventana");
    }
    public void windowOpened(WindowEvent e) {
        System.out.println("Se ha abierto una ventana");
    }

}
