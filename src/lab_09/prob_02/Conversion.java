package lab_09.prob_02;

import lab_09.prob_01.Circle;
import lab_09.prob_01.Rectangle;
import lab_09.prob_01.Square;

public class Conversion {
    public static void main(String[] args) {
        new Circle();
        Square sq = new Square();
        new Rectangle(5.0, 5.0);
        sq = new Square(7.0);
    }
}
