package designpatterns.behaviouraldesignpattern.observer;

public class SubscriberA implements Subscriber{

    @Override
    public void updatedMsg(String msg) {
        System.out.println("Received updated Message : "+msg + "by SubscriberA" );
    }
}
