package fr.ecp.sio;

import fr.ecp.sio.fr.ecp.sio.model.Circle;
import fr.ecp.sio.fr.ecp.sio.model.Drawable;
import fr.ecp.sio.fr.ecp.sio.model.Rectangle;
import fr.ecp.sio.ui.DrawingCanvas;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

/**
 * Created by Philippe on 12/10/2017.
 */
public class Demos {

    public static void main(String[] args) {
        JFrame window = new JFrame("paint Demo");
        window.setSize(640, 480);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel(new BorderLayout());
        Component component = new DrawingCanvas();

        java.util.List<Drawable> drawables = Arrays.asList((Drawable) new Rectangle(5, 5, 5, 5), (Drawable) new Circle(5, 5, 5));

        for (Drawable d : drawables) {
            d.draw(component.getGraphics());
        }

        contentPane.add(component);
        window.add(contentPane);
        window.setVisible(true);
    }

}
