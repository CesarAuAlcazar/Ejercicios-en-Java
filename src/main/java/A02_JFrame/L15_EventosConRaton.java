package A02_JFrame;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class L15_EventosConRaton {

    public static void main(String[] args) {

        MarcoRaton marco = new MarcoRaton();
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

class MarcoRaton extends JFrame {

    public MarcoRaton() {

        setVisible(true);
        setBounds(100, 100, 450, 300);

        EventoRaton accionRaton = new EventoRaton();

        addMouseListener(accionRaton);

    }
}

class EventoRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("Has hecho click con un botón del ratón");

    }

    @Override
    public void mousePressed(MouseEvent e) {

        System.out.println("Has presionado un botón del ratón");

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        System.out.println("Has liberado un botón del ratón");

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        System.out.println("Has entrado con el ratón en el marco");

    }

    @Override
    public void mouseExited(MouseEvent e) {

        System.out.println("Has salido con el ratón del marco");

    }
}
