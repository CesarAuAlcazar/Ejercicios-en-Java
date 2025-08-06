package A02_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static javax.swing.text.StyleConstants.setBackground;

public class L20_EventosMultiples {

    public static void main(String[] args) {

        AccionMarco marco = new AccionMarco();
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}

class AccionMarco extends JFrame {

    public AccionMarco() {
        setTitle("Acciones Multiples");
        setBounds(100, 100, 750, 600);
        PanelAccion capa = new PanelAccion();
        add(capa);
    }
}

class PanelAccion extends JPanel {

    public PanelAccion() {

        AccionColor accionBlanco = new AccionColor("Blanco", new ImageIcon("src/Imagenes/1blanca.png"), Color.white);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/Imagenes/1azul.png"), Color.blue);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/Imagenes/1roja.png"), Color.red);

        add(new JButton(accionBlanco) );
        add(new JButton(accionAzul) );
        add(new JButton(accionRojo) );


        /*JButton botonBlanco = new JButton("Blanco");
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");

        add(botonBlanco);
        add(botonAzul);
        add(botonRojo);
        */

        // Creamos el mapa de entrada también funcionaría con el ANCESTOR
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        // Definimos una combinación de teclas, pero podemos incluirla en el mapa de entrada
        // KeyStroke teclaBlanca = KeyStroke.getKeyStroke("ctrl B");


        // Asignamos la tecla elegida a un objeto
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "Blanco");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "Azul");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "Rojo");

        // Asignamos el objeto a la acción
        ActionMap mapaAccion = getActionMap();

        // Definimos la acción
        mapaAccion.put("Blanco", accionBlanco);
        mapaAccion.put("Azul", accionAzul);
        mapaAccion.put("Rojo", accionRojo);

    }

    private class AccionColor extends AbstractAction {

        public AccionColor(String nombre, Icon icon, Color color) {

            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icon);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color: " + nombre);
            putValue("ColorDeFondo", color);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Color c = (Color) getValue("ColorDeFondo");
            setBackground(c);

            System.out.println("Nombre: " + getValue(Action.NAME) + ", Descripción: " + getValue(Action.SHORT_DESCRIPTION));
        }
    }
}


