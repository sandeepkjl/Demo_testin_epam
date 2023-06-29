package designpatterns.stucturaldesignpattern.decorator;

public class RedShape extends ShapeDecor{

    public RedShape(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("decorated with red");
    }
}
