package designpatterns.behaviouraldesignpattern.sate;

public class PaidSate implements OrderSate{

    @Override
    public double performCancellation() {
        System.out.println("Order cancelled, Payement refunded");
        return 200;
    }
}
