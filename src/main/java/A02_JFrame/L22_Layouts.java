package A02_JFrame;

import javax.swing.*;
import java.awt.*;

public class L22_Layouts {

    public static void main(String[] args) {

        MarcoLayout marco = new MarcoLayout();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class MarcoLayout extends JFrame {
    public MarcoLayout() {
        setTitle("Marco con Layouts");
        setBounds(600, 100, 600, 600);
        PanelLayout layout = new PanelLayout();

        //FlowLayout colocacion = new FlowLayout(FlowLayout.LEFT);
        //layout.setLayout(colocacion);
        /*
        // Esta sentencia sustituye a las dos líneas superiores
        pero la llevamos a la clase PanelLayout simplificada
        layout.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 100));
         */

        PanelLayout2 layout2 = new PanelLayout2();

        add(layout, BorderLayout.NORTH);

        add(layout2, BorderLayout.SOUTH);

    }
}

class PanelLayout extends JPanel {
    public PanelLayout() {

        /*
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 100));
        add(new Button("Blanco"));
        add(new Button("Azul"));
        add(new Button("Rojo"));
        */

        /*
        setLayout(new BorderLayout(10,10));

        add(new Button("Blanco"), BorderLayout.NORTH);
        add(new Button("Azul"), BorderLayout.SOUTH);
        add(new Button("Rojo"), BorderLayout.EAST);
        add(new Button("Verde"), BorderLayout.WEST);
        add(new Button("Amarillo"), BorderLayout.CENTER);
        */

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(new JButton("Blanco"));
        add(new JButton("Azul"));

    }
}

class PanelLayout2 extends JPanel {
    public PanelLayout2() {
        setLayout(new BorderLayout());
        add(new JButton("Blanco"), BorderLayout.WEST);
        add(new JButton("Azul"), BorderLayout.CENTER);
        add(new JButton("Rojo"), BorderLayout.EAST);

    }
}
