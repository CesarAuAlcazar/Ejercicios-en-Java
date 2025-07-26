package A02_JFrame;

import javax.swing.*;
import java.awt.*;

public class L02_MarcoCentrado {

    public static void main(String[] args) {

        MarcoCentrado marco2 = new MarcoCentrado();

        marco2.setVisible(true);

        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class MarcoCentrado extends JFrame {

    public MarcoCentrado() {

        Toolkit miPantalla = Toolkit.getDefaultToolkit();

        Dimension tamañoPantalla = miPantalla.getScreenSize();

        int alturaPantalla = tamañoPantalla.height;
        int anchoPantalla = tamañoPantalla.width;

        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);

        setTitle("Ventana Centrada");

        // Llamas a una imagen para que la ponga de icono de la ventana
        // Image miIcono = miPantalla.getImage("icono.png");

        // Establecemos el icono
        //setIconImage(miIcono);

    }


}
