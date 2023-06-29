package designpatterns.creationdesignpattern.abstractfacotry;

public interface Shape {

    public default void draw(){
        System.out.println("Default shape has been drawn");
    };


}
