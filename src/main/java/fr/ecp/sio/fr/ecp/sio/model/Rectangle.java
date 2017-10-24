package fr.ecp.sio.fr.ecp.sio.model;

import java.awt.*;

/**
 * Created by Philippe on 12/10/2017.
 */
public class Rectangle extends Shape {

    public int width;
    public int height;

    public Rectangle() {
        super();
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public void draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}
