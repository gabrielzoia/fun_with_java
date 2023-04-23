package lab_06;

import java.awt.*;

public class Punct {
    private int x;
    private int y;

    public Punct() {
        this.x = 0;
        this.y = 0;
    }

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }

    public double distance(Point p1) {
        return Math.sqrt(Math.pow(p1.getX() - x, 2) + Math.pow(p1.getY() - y, 2));
    }
}

