package designpatterns.stucturaldesignpattern.bridge.bridge2;

public class Circle extends Shape {


    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
