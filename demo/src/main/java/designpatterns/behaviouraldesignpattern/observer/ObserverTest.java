package designpatterns.behaviouraldesignpattern.observer;

/**
 * Observer Pattern is used in pub/sub model, where publisher publish the message and all
 * the subscribers received the message.
 *
 * **/
public class ObserverTest {
    public static void main(String args[]){

        Publisher publisher = new Publisher();

        publisher.publish("Updated Message 1");
        publisher.publish("Updated Message 2");

    }


}
