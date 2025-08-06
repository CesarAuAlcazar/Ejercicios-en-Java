package A02_JFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L21_OyentesMultiples {

    public static void main(String[] args) {
        MarcoPrincipal marco = new MarcoPrincipal();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

// Construimos el marco
class MarcoPrincipal extends JFrame {
    public MarcoPrincipal() {
        setTitle("Marco Principal");
        setBounds(500, 100, 450, 450);

        LaminaPrincipal capa = new LaminaPrincipal();
        add(capa);

    }
}

// Creamos una capa para pintar
class LaminaPrincipal extends JPanel {
    public LaminaPrincipal() {
        JButton boton = new JButton("Nueva");
        add(boton);
        cerrar = new JButton("Cerrar todo");
        add(cerrar);

        OyenteNuevo oyente = new OyenteNuevo();
        boton.addActionListener(oyente);

    }

    private class OyenteNuevo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            MarcoEmergente marco = new MarcoEmergente(cerrar);
            marco.setVisible(true);

        }
    }

    // Creamos la variable fuera del constructor para poder usarlo con otros métodos
    JButton cerrar;
}

class MarcoEmergente extends JFrame {
    public MarcoEmergente(JButton botonPrincipal) {
        contador ++;
        setTitle("Marco Emergente " + contador);
        setBounds(100*contador, 100*contador, 450, 300);

        CerrarVentanas oyenteCerrar = new CerrarVentanas();

        botonPrincipal.addActionListener(oyenteCerrar);



    }

    private class CerrarVentanas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }
    private static int contador = 0;
}
