package A02_JFrame;

import javax.swing.*;
import java.awt.*;

public class L03_EscribirEnMarco {

    public static void main(String[] args) {

        MarcoConTexto miMarco = new MarcoConTexto();

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoConTexto extends JFrame {

    public MarcoConTexto() {

        setVisible(true);

        setSize(600, 450);

        setLocation(400, 200);

        setTitle("Primer Marco Con Texto");

        Capa miCapa = new Capa();

        add(miCapa);

    }
}

class Capa extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.drawString("Primera Capa de Texto Con Swing", 100, 100);
    }
}
