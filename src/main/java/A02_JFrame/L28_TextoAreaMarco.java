package A02_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L28_TextoAreaMarco {
    public static void main(String[] args) {

        MarcoPruebaArea m = new MarcoPruebaArea();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoPruebaArea extends JFrame {
    public MarcoPruebaArea() {
        setTitle("Jugando con Áreas de Texto");
        setBounds(500, 100, 450, 300);

        setLayout(new BorderLayout());

        capaBotones = new JPanel();

        botonInsertar = new JButton("Insertar");
        botonInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.append("Con diez cañones por banda, viento en popa a toda vela....");
            }
        });

        capaBotones.add(botonInsertar);

        botonSaltoLinea = new JButton("Salto Linea");
        botonSaltoLinea.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                boolean salta =! areaTexto.getLineWrap();
                areaTexto.setLineWrap(salta);

                /*if (salta == true) {
                    botonSaltoLinea.setText("Quita el salto");
                }else {
                    botonSaltoLinea.setText("Salto Linea");
                }
                 */

                // Como el If pero con un operador ternario
                botonSaltoLinea.setText(salta ? "Quitar Salto" : "Salto Linea");
            }
        });

        capaBotones.add(botonSaltoLinea);
        add(capaBotones, BorderLayout.SOUTH);

        areaTexto = new JTextArea(8, 20);
        capaConBarras = new JScrollPane(areaTexto);
        add(capaConBarras, BorderLayout.CENTER);


    }

    private JPanel capaBotones;

    private JButton botonInsertar;
    private JButton botonSaltoLinea;

    private JTextArea areaTexto;

    private JScrollPane capaConBarras;
}
