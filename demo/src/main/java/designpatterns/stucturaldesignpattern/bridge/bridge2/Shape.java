package designpatterns.stucturaldesignpattern.bridge.bridge2;

public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}
