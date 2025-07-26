package A02_JFrame;

import javax.swing.*;
import java.awt.*;

public class L07b_MarcosConLetras {

    public static void main(String[] args) {

        MarcoConFuentes m = new MarcoConFuentes();

        m.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        m.setVisible(true);

    }
}

class MarcoConFuentes extends JFrame {

    public MarcoConFuentes() {
        setTitle("Jugando con fuentes");

        setSize(500, 500);

        CapaConFuentes capa = new CapaConFuentes();

        add(capa);

        // Si no defines un color en CapasConFuentes, defines un color para tudo el texto así
        capa.setForeground(Color.gray);
    }
}

class CapaConFuentes extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        Font miFuente = new Font("Tahoma", Font.BOLD, 22);

        g2d.setFont(miFuente);
        g2d.setColor(Color.red);
        g2d.drawString("Jugando con fuentes en marcos", 50, 50);

        g2d.setFont(new Font("Arial", Font.ITALIC, 20));
        g2d.setColor(Color.blue);
        g2d.drawString("Jugando con fuentes en marcos", 50, 100);
        g2d.drawString("Jugando con fuentes en marcos", 50, 150);

    }
}