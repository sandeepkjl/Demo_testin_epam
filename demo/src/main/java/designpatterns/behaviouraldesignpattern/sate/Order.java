package designpatterns.behaviouraldesignpattern.sate;

public class Order {
    OrderSate orderSate;

    public Order() {
        this.orderSate = new NewState();
    }

    public void cancel(){
        orderSate.performCancellation();
        orderSate=new CancelSate();

    }

    public void paymentDone(){
        orderSate=new PaidSate();

    }

    public void dispatch(){
        orderSate=new TransitState();
    }

    public void delivered(){
        orderSate=new DelievredSate();

    }

}
