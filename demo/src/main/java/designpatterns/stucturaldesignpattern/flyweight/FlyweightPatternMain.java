package designpatterns.stucturaldesignpattern.flyweight;

/**
 * Flyweight pattern we used when we need to create lot's of object with same kind, so uncessary we crate similar object.
 * in this case we use flywieght pattern, this pattern helps to save memory by avoifing creating unneccesary object.
 *
 * let's take example if want to create 100 object with 25 each of red,green, blue and yellow color rectangle
 * so instead of created 25 each color rectangle we can create four rectangle for each color and
 * and if someone asking for again any of these we can return the same object that we have created.
 *
 *
 * Here we try to get extrinsic argument that is diffrent in each object and we create object for doffernet
 * extrinsic value and store in map. here we have color as extrinsic value.
 *
 * see below example for more details
 *
 * **/


public class FlyweightPatternMain {
    public static void main(String args[]) {

        ShapeFactory shapeFactory = new ShapeFactory();

        for (int i = 0; i < 100; i++) {
            if(i<25)
                System.out.println(shapeFactory.getShape("Red"));
            else if (i>24 && i<50)
                System.out.println(shapeFactory.getShape("Green"));
            else if (i>49 && i<75) {
                System.out.println(shapeFactory.getShape("Blue"));
            }
            else{
                System.out.println(shapeFactory.getShape("Yellow"));
            }

        }
    }
}
