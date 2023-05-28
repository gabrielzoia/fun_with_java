package lab_09.prob_01;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super("black", false);
        radius = 0.0;
    }

    public Circle(double radius) {
        super("black", false);
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Radius of the circle is: " + getRadius() + ";\nColor of the circle is: " + super.getColor() + ";\nCircle is filled: " + super.isFilled() + ";";
    }
}
