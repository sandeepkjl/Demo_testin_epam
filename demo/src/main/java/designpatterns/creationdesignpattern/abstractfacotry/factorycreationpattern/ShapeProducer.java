package designpatterns.creationdesignpattern.abstractfacotry.factorycreationpattern;

public class ShapeProducer {
    public static void main(String args[]){

        ShapeFactory factory = new ShapeFactory();
        Shape circleShape = factory.getShape("Circle");
        Shape rectangleShape = factory.getShape("Rectangle");

        circleShape.draw();
        rectangleShape.draw();

    }
}
