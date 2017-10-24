package fr.ecp.sio.fr.ecp.sio.model;

public abstract class Shape implements Drawable {
    protected int x;
    protected int y;

    public Shape() {
        this.x = 0;
        this.y = 0;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "toString() de shape/n"
                + super.toString();
    }

    public abstract double getArea();
}
