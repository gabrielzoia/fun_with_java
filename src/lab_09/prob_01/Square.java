package lab_09.prob_01;

public class Square extends Rectangle {
    public Square() {
        super(0.0, 0.0, "", false);
    }

    public Square(double side) {
        super(side, side, "black", false);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public String toString() {
        return super.toString();
    }
}
