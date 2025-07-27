package A02_JFrame;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class L19_FocoEnVentana extends JFrame implements WindowFocusListener {
    public static void main(String[] args) {

        L19_FocoEnVentana vent = new L19_FocoEnVentana();

        vent.iniciar();

    }

    public void iniciar(){

        marco1 = new L19_FocoEnVentana();
        marco2 = new L19_FocoEnVentana();

        marco1.setVisible(true);
        marco2.setVisible(true);

        marco1.setBounds(100, 100, 450, 300);
        marco2.setBounds(700, 100, 450, 300);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);

    }

    @Override
    public void windowGainedFocus(WindowEvent e) {

        if (e.getSource() == marco1){

            marco1.setTitle("Aquí está el foco");
        }else{
            marco2.setTitle("Ahora lo tengo yo");
        }

    }

    @Override
    public void windowLostFocus(WindowEvent e) {

        if (e.getSource() == marco1){

            marco1.setTitle("");
        }else{
            marco2.setTitle("");
        }

    }

    L19_FocoEnVentana marco1;
    L19_FocoEnVentana marco2;
}
