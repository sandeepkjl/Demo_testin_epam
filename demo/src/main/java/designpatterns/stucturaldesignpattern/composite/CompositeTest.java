package designpatterns.stucturaldesignpattern.composite;

/**
*Composite pattern performed on the objets store in tree structure.
*
* leaf node perform base operation and
*
* non-leaf node perform base operation as well as some additional operation on child to add child or remove child
*
* see the example below.
* **/
public class CompositeTest {
    public static void main(String args[]){

        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        Employee employee1 = new SoftwareEngineer("SE01","Sandeep","Software Engineer");
        Employee employee2 = new Manager("MG01","Rohan","Manager");
        Employee employee3 = new HumanResource("HR01","Rahul","Human Resource");
        Employee employee4 = new SoftwareEngineer("SE02","Karan","Software ENgineer");



        employeeDirectory.addEmployee(employee1);
        employeeDirectory.addEmployee(employee2);
        employeeDirectory.addEmployee(employee3);
        employeeDirectory.addEmployee(employee4);

        employeeDirectory.printEmployeeDetails();

        employeeDirectory.removeEmployee(employee1);
        System.out.println("Employee details after removing element");
        employeeDirectory.printEmployeeDetails();
    }
}
