package A02_JFrame;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class L26_CampoContraseña {

    public static void main(String[] args) {

        MarcoContraseña marcoc = new MarcoContraseña();
        marcoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoContraseña extends JFrame {
    public MarcoContraseña(){
        setBounds(500, 100, 450, 300);
        CapaContraseña capac = new CapaContraseña();
        add(capac);
        setVisible(true);
    }
}

class CapaContraseña extends JPanel {
    public CapaContraseña() {
        setLayout(new BorderLayout());
        JPanel capaSuperior = new JPanel();
        capaSuperior.setLayout(new GridLayout(2, 2));
        add(capaSuperior, BorderLayout.NORTH);

        JLabel etiqueta1 = new JLabel("Usuario");
        JLabel etiqueta2 = new JLabel("Contraseña");

        CompruebaContra evento = new CompruebaContra();

        JTextField cUsuario = new JTextField(20);
        cContraseña = new JPasswordField(20);
        cContraseña.getDocument().addDocumentListener(evento);

        capaSuperior.add(etiqueta1);
        capaSuperior.add(cUsuario);
        capaSuperior.add(etiqueta2);
        capaSuperior.add(cContraseña);

        JButton enviar = new JButton("Enviar");
        add(enviar, BorderLayout.SOUTH);

    }

// Clase receptora de los eventos
    private class CompruebaContra implements DocumentListener {

    @Override
    public void insertUpdate(DocumentEvent e) {

        char [] contraseña;
        contraseña= cContraseña.getPassword();

        if (contraseña.length < 8 || contraseña.length > 12) {
            cContraseña.setBackground(Color.RED);
        }else {
            cContraseña.setBackground(Color.WHITE);
        }

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

        char [] contraseña;
        contraseña= cContraseña.getPassword();

        if (contraseña.length < 8 || contraseña.length > 12) {
            cContraseña.setBackground(Color.RED);
        }else {
            cContraseña.setBackground(Color.WHITE);
        }

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}

JPasswordField cContraseña;

}