package designpatterns.behaviouraldesignpattern.sate;

public class NewState implements OrderSate{

    @Override
    public double performCancellation() {
        System.out.println("Order is cancelled");
        return 0;
    }
}
