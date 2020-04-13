package ch06.derived;

import ch06.base.Shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
