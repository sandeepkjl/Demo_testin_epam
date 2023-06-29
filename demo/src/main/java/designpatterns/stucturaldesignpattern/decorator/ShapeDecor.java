package designpatterns.stucturaldesignpattern.decorator;

public abstract class ShapeDecor implements Shape {
    Shape shape;

    public ShapeDecor(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();

    }
}
