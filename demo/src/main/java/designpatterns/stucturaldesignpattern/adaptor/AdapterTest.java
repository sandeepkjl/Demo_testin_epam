package designpatterns.stucturaldesignpattern.adaptor;

/***
 * Adaptor pattern is used to make connection between to two incompitable objects
 *
 * or, we can say, Adaptor pattern is used when client action is supported by one type of object like customer
 * but not other similar type like employee. in that case also we use adaptor pattern as my expamle shows that.
 *
 * or one more example with apple charger we can charge android phone with the help of adaptor
 *
 * */

public class AdapterTest {
    public static void main(String args[]){

        BusinessCardIssuer issuer = new BusinessCardIssuer();
        Customer customer1 = new CustomerImpl("CUST001","Sandeep Patel",500000);

        Employee employee = new Employee("EMP001", "Rohan Singh", 100000);

        issuer.issueCard(customer1);

        //issuer.issueCard(employee); => this lines not supported becoz issue card supported on customer type not employee type
        //so wee add customer adaptor that convert employee functionality to customer functionality

        CustomerAdaptor customerAdaptor = new CustomerAdaptor(employee);

        issuer.issueCard(customerAdaptor);
    }
}
