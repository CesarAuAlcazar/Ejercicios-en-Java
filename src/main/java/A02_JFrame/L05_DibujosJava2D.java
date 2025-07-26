package A02_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class L05_DibujosJava2D {

    public static void main(String[] args) {

        CapaCon2D marco = new CapaCon2D();

        marco.setVisible(true);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class CapaCon2D extends JFrame {

    public CapaCon2D() {

        setTitle("Capa con 2D");

        setSize(600, 600);

        Capa2D frame = new Capa2D();

        add(frame);

    }
}

class Capa2D extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponents(g);

        Graphics2D g2d = (Graphics2D) g;

        // Como la clase Rectangle es abstracta, tenemos que instanciarla con uno de sus métodos
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 300, 300);

        g2d.draw(rectangulo);

        Ellipse2D ellipse = new Ellipse2D.Double(120, 120, 250, 200);

        // Ajusta la elipse a las dimensiones del rectángulo
        ellipse.setFrame(rectangulo);

        g2d.draw(ellipse);

        g2d.draw(new Line2D.Double(100, 100, 400, 400));

        double CentroEnX = rectangulo.getCenterX();
        double CentroEnY = rectangulo.getCenterY();
        double radio = 220;

        Ellipse2D circulo = new Ellipse2D.Double();

        circulo.setFrameFromCenter(CentroEnX, CentroEnY, CentroEnX+radio, CentroEnY+radio);

        g2d.draw(circulo);

    }
}
