package designpatterns.behaviouraldesignpattern.visitor;

/**
 * Visitor Pattern is used, when we want to perform a operation on  group of similar obejct.
 * visiot visist each element and perform the operation.
 *
 * like in mall, cashier check each item price and calcalute ttal price, so checking the price in every obejct
 * is kind of visitor design pattern
 *
 * **/
public class CashierVisitorTest {
    public static void main(String args[]){
        ShopingCart shopingCart = new ShopingCart();
        int totalAmount =0;
        for(Product p : shopingCart.getProducts()){
            totalAmount = totalAmount+p.getPrice();
        }

        System.out.println("Total Amount : "+ totalAmount);
    }
}
