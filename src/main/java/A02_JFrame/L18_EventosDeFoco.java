package A02_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class L18_EventosDeFoco {

    public static void main(String[] args) {
        MarcoFoco mf = new MarcoFoco();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

class MarcoFoco extends JFrame {

    public MarcoFoco() {

        setBounds(100, 100, 450, 300);
        add(new CapaFoco());
        setVisible(true);
    }
}

class CapaFoco extends JPanel {
    JTextField cuadro1;
    JTextField cuadro2;

    public CapaFoco() {

        setLayout(null);

        cuadro1 = new JTextField();
        cuadro2 = new JTextField();

        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);

        add(cuadro1);
        add(cuadro2);

        LanzarFoco foco = new LanzarFoco();
        cuadro1.addFocusListener(foco);
    }

    private class LanzarFoco implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {

            String correo = cuadro1.getText();
            boolean comprobar = false;

            for (int i = 0; i < correo.length(); i++) {
                if (correo.charAt(i) == '@') {
                    comprobar = true;
                    break;
                }
            }
            if (comprobar) {
                System.out.println("El correo es correcto");
            }else {
                System.out.println("El correo no es correcto");
            }
        }
    }

    // Declaramos las variables fuera de CapaFoco para poder acceder a ellas desde otros métodos

}


