package designpatterns.behaviouraldesignpattern.sate;

/**
 * State Pattern is used to change the behaviour of a object according to it's state.
 *
 * like we order something so cancellation behaviour depends on the order sate like
 *
 * payemnt done, dispatch, delivered etc.
 * **/

public class StatePatternTest {
    public static void main(String args[]){
        Order order =new Order();
        //order.cancel();

        order.paymentDone();
       // order.cancel();

        order.dispatch();
       // order.cancel();

        order.delivered();
        order.cancel();

        //order.cancel();

    }
}
