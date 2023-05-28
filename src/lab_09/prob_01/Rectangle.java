package lab_09.prob_01;

public class Rectangle extends Shape {
    private double width, length;

    public Rectangle() {
        super("black", false);
        width = 0.0;
        length = 0.0;
    }

    public Rectangle(double width, double length) {
        super("black", false);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Width of the rectangle is " + getWidth() + ";\nLength of the rectangle is " + getLength() + ";\nColor of the rectangle is " + super.getColor() + ";\nRectangle is filled: " + super.isFilled() + ";";
    }
}
