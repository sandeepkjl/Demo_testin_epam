package designpatterns.behaviouraldesignpattern.sate;

public class TransitState implements OrderSate{

    @Override
    public double performCancellation() {
        System.out.println("Order cancalled, Will reach to courier to stop delivey and payment refund initiated");
        return 0;
    }
}
