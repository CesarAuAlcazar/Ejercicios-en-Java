package A02_JFrame;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class L16_OptimizandoL15ConHerencia {

    public static void main(String[] args) {

        MarcoRaton2 marco = new MarcoRaton2();
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

class MarcoRaton2 extends JFrame {

    public MarcoRaton2() {

        setVisible(true);
        setBounds(100, 100, 450, 300);

        EventoRaton2 accionRaton = new EventoRaton2();

        addMouseListener(accionRaton);


    }
}

class EventoRaton2 extends MouseAdapter {

    public void mouseClicked(MouseEvent e) {

        System.out.println("Has hecho click con el ratón en las coordenadas " + e.getX() + ", " + e.getY());

        System.out.println("Contamos los clicks que has hecho de manera consecutiva sin pausa: " + e.getClickCount());
        System.out.println("*****************************************************************");
    }

    public void mousePressed(MouseEvent e) {

        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            System.out.println("Has pusado el botón izquierdo");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
            System.out.println("Has pulsado el botón derecho");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
            System.out.println("Has pulsado con la rueda del ratón");
        }

        System.out.println("El valor del botón que has pulsado es: " + e.getModifiersEx());

    }
}
