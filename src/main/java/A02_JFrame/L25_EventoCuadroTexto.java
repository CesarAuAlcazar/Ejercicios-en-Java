package A02_JFrame;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class L25_EventoCuadroTexto {
    public static void main(String[] args) {

        MarcoPruebat mar = new MarcoPruebat();
        mar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoPruebat extends JFrame {
    public MarcoPruebat() {
        setBounds(500, 100, 500, 500);
        CapaCampot capat = new CapaCampot();
        add(capat);
        setVisible(true);
    }
}

class CapaCampot extends JPanel {
    public CapaCampot() {

        JTextField campot = new JTextField(20);

        EscuchaTexto1 evento = new EscuchaTexto1();
        Document doc = campot.getDocument();
        doc.addDocumentListener(evento);

        add(campot);
    }

    private class EscuchaTexto1 implements DocumentListener {


        @Override
        public void insertUpdate(DocumentEvent e) {

            System.out.println("Has introducido un carácter en el campo");

        }

        @Override
        public void removeUpdate(DocumentEvent e) {

            System.out.println("Has borrado un carácter en el campo");

        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }
}
