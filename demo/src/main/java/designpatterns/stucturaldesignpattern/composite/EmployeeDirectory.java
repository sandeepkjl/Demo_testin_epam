package designpatterns.stucturaldesignpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements Employee {
    static List<Employee> employeeList;

    public void addEmployee(Employee e){
        employeeList.add(e);
    }

    public void removeEmployee(Employee e){
        employeeList.remove(e);
    }
    public EmployeeDirectory() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public void printEmployeeDetails() {
        employeeList.stream().forEach(e->e.printEmployeeDetails());

    }
}
