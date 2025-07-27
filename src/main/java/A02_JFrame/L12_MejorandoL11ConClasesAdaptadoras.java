package A02_JFrame;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class L12_MejorandoL11ConClasesAdaptadoras extends JFrame {

    public static void main(String[] args) {

        MarcoVentana2 ventana = new MarcoVentana2();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MarcoVentana2 ventana2 = new MarcoVentana2();
        ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ventana.setTitle("Eventos en ventana 1");
        ventana.setBounds(100, 100, 450, 300);
        ventana2.setTitle("Eventos en ventana 2");
        ventana2.setBounds(200, 200, 450, 300);

    }
}

class MarcoVentana2 extends JFrame {

    public MarcoVentana2() {

        setVisible(true);

        addWindowListener(new CapaVentana2());
    }
}

class CapaVentana2 extends WindowAdapter {

    @Override

    public void windowIconified(WindowEvent e) {
        System.out.println("Se ha minimizado una ventana");
    }
}
