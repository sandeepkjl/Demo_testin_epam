package designpatterns.stucturaldesignpattern.bridge.bridge2;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
        color.fillColor();
    }
}
