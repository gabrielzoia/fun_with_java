package lab_09.prob_01;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Test01 {
    public Test01() {
    }

    public static void main(String[] args) {
        boolean ok = true;
        new Square();
        new Rectangle();
        new Circle();
        new Square();
        Constructor[] allConstructors = Square.class.getDeclaredConstructors();
        if (allConstructors.length != 3) {
            System.out.println("Clasa Square NU are definiti toti constructorii!");
            ok = false;
        }

        Circle circle = new Circle(2.0, "green", true);
        Square square = new Square(5.0, "black", true);
        if (!Modifier.isAbstract(Shape.class.getModifiers())) {
            System.out.println("Clasa Shape NU este abstracta!");
            ok = false;
        }

        if (!Shape.class.isAssignableFrom(Square.class) && !Rectangle.class.isAssignableFrom(Square.class)) {
            System.out.println("Clasele NU respecta relatia de mostenire descrisa!");
            ok = false;
        }

        if (circle.isFilled() && circle.getColor().equals("green")) {
            if (square.isFilled() && square.getColor().equals("black") && square.getWidth() == square.getLength()) {
                if (ok) {
                    System.out.println("Au trecut toate testele!");
                }
            } else {
                System.out.println("Constructorul din clasa Square NU este definit conform specificatiilor!");
                ok = false;
            }
        } else {
            System.out.println("Constructorul din clasa Circle NU este definit conform specificatiilor!");
            ok = false;
        }

    }
}
