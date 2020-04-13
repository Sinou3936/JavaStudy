package ch06;

import ch06.base.Shape;
import ch06.derived.Circle;

public class ex4 {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
