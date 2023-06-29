package designpatterns.stucturaldesignpattern.adaptor;

public class CustomerImpl implements Customer{

    String custId;
    String custName;

    double custMonthlyIncome;

    public CustomerImpl(String custId, String custName, double custMonthlyIncome) {
        this.custId = custId;
        this.custName = custName;
        this.custMonthlyIncome = custMonthlyIncome;
    }

    @Override
    public String getCustomerId() {
        return this.custId;
    }

    @Override
    public String getCustomerName() {
        return this.custName;
    }

    @Override
    public double getCustomerIncome() {
        return this.custMonthlyIncome;
    }
}
