package designpatterns.behaviouraldesignpattern.nilOrnullpattern;

public class NilEmployee extends EmployeeBase {

    @Override
    public void printEmpDetails() {
        System.out.println("Employee not available");
    }
}
