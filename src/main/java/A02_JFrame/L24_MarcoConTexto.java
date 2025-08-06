package A02_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// Clase Principal
public class L24_MarcoConTexto {

    public static void main(String[] args) {

        //Construcción marco
        MarcoTexto mt = new MarcoTexto();

        //  Instancia marco
        mt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

// Clase del marco
class MarcoTexto extends JFrame {

    //Constructor
    public MarcoTexto() {

        setBounds(500, 100, 650, 300);

        // Instanciamos capa
        CapaTexto capa = new CapaTexto();

        add(capa);
        setVisible(true);

    }
}

// Clase Capa
class CapaTexto extends JPanel {
    public CapaTexto() {

        // Creamos una segunda capa
        setLayout(new BorderLayout());
        JPanel capa2 = new JPanel();
        capa2.setLayout(new FlowLayout());

        // Ponemos la comprobación en el centro
        resultado = new JLabel("", JLabel.CENTER);

        JLabel texto1 = new JLabel("Correo: ");
        capa2.add(texto1);

        campo1 = new JTextField( 25);
        capa2.add(campo1);

        // Creamos un boton para comprobar el corero
        JButton boton1 = new JButton("Comprobar");
        DarTexto evento = new DarTexto();
        boton1.addActionListener(evento);
        capa2.add(boton1);

        add(capa2, BorderLayout.NORTH);
        add(resultado, BorderLayout.CENTER);

    }

    private class DarTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            // Contador de @
            int correcto = 0;

            String correo = campo1.getText().trim();
            for (int i = 0; i < correo.length(); i++) {
                if (correo.charAt(i) == '@') {
                    correcto++;
                }
            }
            if (correcto != 1) {
                resultado.setText("Correo Incorrecto");
                System.out.println("Correo Incorrecto");
            } else {
                resultado.setText("Correo Correcto");
                System.out.println("Correo Correcto");
            }

            System.out.println(campo1.getText().trim());
        }
    }
    private JTextField campo1;

    private JLabel resultado;
}



