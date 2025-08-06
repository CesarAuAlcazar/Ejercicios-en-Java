package A02_JFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L27_AreaTexto {
    public static void main(String[] args) {

        MarcoArea ca = new MarcoArea();
        ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoArea extends JFrame {
    public MarcoArea() {

        setBounds(500, 100, 500, 500);
        TextoArea capa = new TextoArea();
        add(capa);
        setVisible(true);

    }
}

class TextoArea extends JPanel {
    public TextoArea() {

        texto = new JTextArea(8, 20);

        JScrollPane scroll = new JScrollPane(texto); // Construimos una capa nueva con una barra de desplazamiento
        texto.setLineWrap(true);  // Definimos que haga un salto de línea cuando llegue al final horizontal del área de texto

        add(scroll);

        // Para que imprima el texto en consola
        JButton aceptar = new JButton("Aceptar");
        aceptar.addActionListener(new ImprimeArea());
        add(aceptar);

    }

    private class ImprimeArea implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println(texto.getText());

        }
    }

    private JTextArea texto;
}
