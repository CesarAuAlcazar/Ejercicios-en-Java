package A02_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L23_GridLayout {
    public static void main(String[] args) {
        MarcoCalculadora mc = new MarcoCalculadora();
        mc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mc.setVisible(true);

    }
}

// Contructor del marco
class MarcoCalculadora extends JFrame {
    public MarcoCalculadora() {
        setTitle("Calculadora");
        setBounds(500, 100, 650, 600);
        CapaCalculadora cc = new CapaCalculadora();
        add(cc);
        // Para que la ventana se adapte al tamaño por defecto de lo que contiene
        pack();

    }
}

// Constructor del contenido del marco
class CapaCalculadora extends JPanel {
    public CapaCalculadora() {

        inicio = true;

        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);

        botones = new JPanel();
        botones.setLayout(new GridLayout(4, 4 ));

        ActionListener insertar = new Introducir();

        ActionListener orden = new AccionOrden();

        ponerBoton("7", insertar);
        ponerBoton("8", insertar);
        ponerBoton("9", insertar);
        ponerBoton("/", orden);

        ponerBoton("4", insertar);
        ponerBoton("5", insertar);
        ponerBoton("6", insertar);
        ponerBoton("*", orden);

        ponerBoton("1", insertar);
        ponerBoton("2", insertar);
        ponerBoton("3", insertar);
        ponerBoton("+", orden);

        ponerBoton("0", insertar);
        ponerBoton(".", orden);
        ponerBoton("=", orden);
        ponerBoton("-", orden);


        add(botones, BorderLayout.CENTER);

        ultimaOperacion = "=";
    }

    private void ponerBoton(String rotulo, ActionListener oyente){
        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        botones.add(boton);

    }

    private class Introducir implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String entrada = e.getActionCommand();

            if (inicio) {
                pantalla.setText("");
                inicio = false;
            }

            pantalla.setText(pantalla.getText() + entrada);

        }
    }

    private class AccionOrden implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            String operacion = e.getActionCommand();

            calcular (Double.parseDouble(pantalla.getText()));

            ultimaOperacion = operacion;

            inicio = true;
        }

        public void calcular(double valor){

            if (ultimaOperacion.equals("+")){

                resultado += valor;


            }else if (ultimaOperacion.equals("-")){
                resultado -= valor;


            }else if (ultimaOperacion.equals("*")){
                resultado *= valor;


            }else if (ultimaOperacion.equals("/")){
                resultado /= valor;


            }else if (ultimaOperacion.equals("=")){
                resultado = valor;

            }
            pantalla.setText(String.valueOf(resultado));
        }
    }

    private JPanel botones;
    private JButton pantalla;
    private boolean inicio;
    private double resultado;
    private String ultimaOperacion;

}


