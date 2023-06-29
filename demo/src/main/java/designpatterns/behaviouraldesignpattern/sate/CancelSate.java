package designpatterns.behaviouraldesignpattern.sate;

public class CancelSate implements OrderSate{

    @Override
    public double performCancellation() {
        throw new RuntimeException("Item already cancelled");
    }
}
