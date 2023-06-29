package designpatterns.behaviouraldesignpattern.sate;

public class DelievredSate implements OrderSate{

    @Override
    public double performCancellation() {
        System.out.println("Order Cancalled, Return the item to courier guy, will intiate refund once item will be picked");
        return 0;
    }
}
