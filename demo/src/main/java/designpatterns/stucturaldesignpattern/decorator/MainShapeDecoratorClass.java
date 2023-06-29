package designpatterns.stucturaldesignpattern.decorator;

public class MainShapeDecoratorClass {
    public static void main(String args[]){
        ShapeDecor shape = new RedShape(new Circle());
        shape.draw();
        Shape shapeR = new Rectangle();


        shapeR.draw();
    }
}
