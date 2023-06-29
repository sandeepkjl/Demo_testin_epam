package designpatterns.stucturaldesignpattern.adaptor;

public class BusinessCardIssuer {

    public void issueCard(Customer customer){
        String cardNumber = customer.getCustomerId()+"-"+customer.getCustomerName();
        System.out.println("Card issued for the customer : "+customer.getCustomerName());
    }
}
