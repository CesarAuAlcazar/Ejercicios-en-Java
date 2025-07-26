package A02_JFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class L08_ImágenesEnMarcos {

    public static void main(String[] args) {

        ImagenEnMarco capa = new ImagenEnMarco();

        capa.setVisible(true);

        capa.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}

class ImagenEnMarco extends JFrame {

    public ImagenEnMarco() {

        setTitle("Una imagen en un marco");

        setBounds(0, 0, 1450, 900);

        CapaConImagen capa = new CapaConImagen();
        add(capa);
    }
}

class CapaConImagen extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        if (imagen != null) {

            // Mantenemos la relación del aspecto de la imagen
            int ancho = imagen.getWidth(this);
            int alto = imagen.getHeight(this);

            double imgAspecto = (double) alto / ancho;
            double imgPerimetro = (double) getHeight() / getWidth();

            int newAncho, newAlto;

            if (imgAspecto > imgPerimetro) {
                // La imagen es más alta que el marco (ajustamos por altura)
                newAlto = getHeight();
                newAncho = (int) (newAlto / imgAspecto);
            } else {
                // La imagen es más ancha que el marco (ajustamos por anchura)
                newAncho = getWidth();
                newAlto = (int) (newAncho * imgPerimetro);
            }

            // Centramos la imagen
            int x = (getWidth() - newAncho) / 2;
            int y = (getHeight() - newAlto) / 2;

            g.drawImage(imagen, x, y, newAncho, newAlto, this);
        }

        File miimagen = new File("src/Imagenes/Imagen1.jpg");

        try {
            imagen = ImageIO.read(miimagen);
        } catch (IOException e) {
            System.out.println("Error al leer el imagen");;
        }
    }

    private Image imagen;
}