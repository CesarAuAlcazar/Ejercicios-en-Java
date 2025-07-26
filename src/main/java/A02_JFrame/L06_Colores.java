package A02_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class L06_Colores {

    public static void main(String[] args) {

        MarcoConColores marco = new MarcoConColores();

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);
    }
}

class MarcoConColores extends JFrame {

    public MarcoConColores() {

        setTitle("Marco Con Colores");

        setSize(500, 500);

        CapaConColor capa = new CapaConColor();

        add(capa);

        capa.setBackground(Color.lightGray);

    }
}

class CapaConColor extends  JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        Rectangle2D rectangulo = new Rectangle2D.Double(50, 50, 400, 350);

        // El borde del rectángulo
        g2d.setPaint(Color.white);
        g2d.draw(rectangulo);

        // El interior del rectángulo
        g2d.setPaint(Color.blue);
        g2d.fill(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();

        elipse.setFrame(rectangulo);

        // Las dos opciones para dar un color a la elipse
        Color color = new Color(255,0,0);
        g2d.setPaint(color);

        // g2d.setPaint(new Color(255, 0, 0));

        g2d.fill(elipse);

    }
}