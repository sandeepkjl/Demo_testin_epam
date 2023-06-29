package designpatterns.stucturaldesignpattern.adaptor;

public class CustomerAdaptor implements Customer{

    Employee employee;

    public CustomerAdaptor(Employee employee) {
        this.employee = employee;
    }


    @Override
    public String getCustomerId() {
        return employee.getEmpId();
    }

    @Override
    public String getCustomerName() {
        return employee.getEmpName();
    }

    @Override
    public double getCustomerIncome() {
        return employee.getEmpSalary();
    }
}
