package A02_JFrame;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class L14_EventosDeTeclado {

    public static void main(String[] args) {

        MarcoTeclas marco = new MarcoTeclas();

        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

class MarcoTeclas extends JFrame {

    public MarcoTeclas() {

        setVisible(true);
        setBounds(100, 100, 450, 300);

        EventoTeclado tecla = new EventoTeclado();
        addKeyListener(tecla);
    }
}

class EventoTeclado implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {

        char tecla = e.getKeyChar();
        System.out.println("La tecla que ha pulsado es: " + tecla);

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        System.out.println("El código de la tecla pulsada es: " + key);

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
