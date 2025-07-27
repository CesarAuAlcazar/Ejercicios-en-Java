package A02_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L09_PruebaEventos {

    public static void main(String[] args) {

        MarcoBotones marco = new MarcoBotones();

        marco.setVisible(true);

        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

class MarcoBotones extends JFrame {

    public MarcoBotones() {

        setTitle("Botones y eventos en un marco");

        setBounds(500, 300, 1000, 700);

        CapaBotones capa = new CapaBotones();

        add(capa);
    }
}

class CapaBotones extends JPanel implements ActionListener {

    JButton botonRojo = new JButton("Rojo");
    JButton botonBlanco = new JButton("Blanco");
    JButton botonAzul = new JButton("Azul");


    public CapaBotones() {

        add(botonBlanco);
        add(botonAzul);
        add(botonRojo);

        // Evento - Action; Fuente - botonRojo; Listener - this
        botonBlanco.addActionListener(this);
        botonAzul.addActionListener(this);
        botonRojo.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {

        Object botonUsado = e.getSource();

        if (botonUsado == botonRojo) {
            setBackground(Color.red);
        }else if (botonUsado == botonBlanco) {
            setBackground(Color.white);
        }else {
            setBackground(Color.blue);
        }
    }
}