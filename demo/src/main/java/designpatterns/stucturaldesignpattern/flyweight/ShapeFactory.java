package designpatterns.stucturaldesignpattern.flyweight;

import java.util.HashMap;

public class ShapeFactory {

    HashMap<String, Shape> map = new HashMap();

    public Shape getShape(String color) {
        if (map.containsKey(color)){
            System.out.println("Getting from map");
            return (Shape) map.get(color);}

        if (color.equalsIgnoreCase("red")) {
            Shape shape = new RedRectangle();
            map.put(color, shape);
            return shape;
        }
        if (color.equalsIgnoreCase("Green")) {
            Shape shape = new GreenRectangle();
            map.put(color, shape);
            return shape;
        }
        if (color.equalsIgnoreCase("Blue")) {
            Shape shape = new BlueRectangle();
            map.put(color, shape);
            return shape;
        }
        if (color.equalsIgnoreCase("Yellow")) {
            Shape shape = new YellowRectangle();
            map.put(color, shape);
            return shape;
        }


        return null;
    }

}
