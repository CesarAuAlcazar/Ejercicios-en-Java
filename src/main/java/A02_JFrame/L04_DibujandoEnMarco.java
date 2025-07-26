package A02_JFrame;

import javax.swing.*;
import java.awt.*;

import static java.awt.AWTEventMulticaster.add;

public class L04_DibujandoEnMarco {

    public static void main(String[] args) {

        MarcoConDibujos marco = new MarcoConDibujos();

        marco.setVisible(true);

        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        marco.setLocation(500, 500);

    }
}

class MarcoConDibujos extends JFrame {

    public MarcoConDibujos() {

        setTitle("Marco Con Dibujos");

        setSize(400, 400);

        CapaConFiguras capa = new CapaConFiguras();

        add(capa);
    }
}

class CapaConFiguras extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.drawRect(50, 50, 50, 50);

        g.drawLine(150, 150, 100, 200);

        g.drawArc(100, 200, 100, 100, 180, 180);
    }
}
