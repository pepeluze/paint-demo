package fr.ecp.sio.ui;

import fr.ecp.sio.fr.ecp.sio.model.Drawable;

import java.awt.*;

public class DrawingCanvas extends Canvas {

    public java.util.List<Drawable> drawables;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Drawable drawable : drawables) {
            drawable.draw(g);
        }
    }
}
