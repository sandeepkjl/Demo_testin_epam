package designpatterns.behaviouraldesignpattern.observer;

public class SubscriberC implements Subscriber{

    @Override
    public void updatedMsg(String msg) {
        System.out.println("Received updated Message : "+msg + "by SubscriberA" );
    }
}
