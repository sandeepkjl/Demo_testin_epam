package designpatterns.behaviouraldesignpattern.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Publisher {

    static List<Subscriber> subscribers;

    public Publisher() {
       subscribers=Arrays.asList(new SubscriberA(),new SubscriberB(), new SubscriberC());
    }

    public void publish(String msg){
        for(Subscriber subscriber:subscribers){
            subscriber.updatedMsg(msg);
        }
        System.out.println("----------------------");
    }
}
