package A02_JFrame;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class L17_EventosRatonConMouseMotionListener {

    public static void main(String[] args) {

        MarcoRaton3 marco = new MarcoRaton3();
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

class MarcoRaton3 extends JFrame {

    public MarcoRaton3() {

        setVisible(true);
        setBounds(100, 100, 450, 300);

        EventoRaton3 accionRaton = new EventoRaton3();

        addMouseMotionListener(accionRaton);
    }
}

class EventoRaton3 implements MouseMotionListener {
    @Override
    public void mouseDragged(MouseEvent e) {

        System.out.println("Estás arrastrando el ratón por la ventana");

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estás moviendo el ratón por la ventana");

    }
}
