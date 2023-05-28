package lab_06;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Point a = new Point(1, 2);
        Point b = new Point(-1, 3);

        double distance = a.distance(b);
        System.out.println("The distance between A " + a.toString() + " and B " + b.toString() + " is " + distance);
    }
}
