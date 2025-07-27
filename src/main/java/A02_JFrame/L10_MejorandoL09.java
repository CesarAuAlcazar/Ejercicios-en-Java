package A02_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L10_MejorandoL09 extends JFrame {

    public static void main(String[] args) {

        MarcoBotones marco = new MarcoBotones();

        marco.setVisible(true);

        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

class MarcoBotones2 extends JFrame {

    public MarcoBotones2() {

        setTitle("Botones y eventos en un marco");

        setBounds(500, 300, 1000, 700);

        CapaBotones capa = new CapaBotones();

        add(capa);
    }
}

class CapaBotones2 extends JPanel {

    JButton botonRojo = new JButton("Rojo");
    JButton botonBlanco = new JButton("Blanco");
    JButton botonAzul = new JButton("Azul");


    public CapaBotones2() {

        add(botonBlanco);
        add(botonAzul);
        add(botonRojo);

        ColorFondo Blanco = new ColorFondo(Color.white);
        ColorFondo Azul = new ColorFondo(Color.blue);
        ColorFondo Rojo = new ColorFondo(Color.RED);

        // Evento - Action; Fuente - botonCOLOR; Listener - "Los colores"
        botonBlanco.addActionListener(Blanco);
        botonAzul.addActionListener(Azul);
        botonRojo.addActionListener(Rojo);
    }

    private class ColorFondo implements ActionListener {

        public ColorFondo(Color color) {

            colorDeFondo = color;
        }
        public void actionPerformed(ActionEvent e) {
            setBackground(colorDeFondo);
        }
    }
    private Color colorDeFondo;
}