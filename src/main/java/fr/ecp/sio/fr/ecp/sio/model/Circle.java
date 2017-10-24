package fr.ecp.sio.fr.ecp.sio.model;

import java.awt.*;

public class Circle extends Shape {


    public int radius;

    public Circle() {
        super();
        this.radius = 0;
    }


    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void draw(Graphics g) {
        g.drawOval(x, y, radius, radius);
    }
}
