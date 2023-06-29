package designpatterns.behaviouraldesignpattern.nilOrnullpattern;

/**
 * Null pattern is used, when we have to check null on object to perform some operation on obejct.
 *
 * in null pattern instead of providing null for object reference,
 * we provide Nil implementation of the same object that client wants
 *
 * see the below examples.
 *
 *
 * **/

public class ClientNullTest {
    public static void main(String args[]) {
        EmployeeFactory employeeFactory = new EmployeeFactory();

        EmployeeBase employee1 = employeeFactory.getEmployee("01", "Sandeep");
        EmployeeBase employee2 = employeeFactory.getEmployee("02", "Rohan");
        EmployeeBase employee3 = employeeFactory.getEmployee("03", "Rahul");
        EmployeeBase employee4 = employeeFactory.getEmployee("04", "Karan");
        EmployeeBase employee5 = employeeFactory.getEmployee("05", "Ankita");

        System.out.println("Employees Details");

        employee1.printEmpDetails();
        employee2.printEmpDetails();
        employee3.printEmpDetails();
        employee4.printEmpDetails();
        employee5.printEmpDetails();


    }
}
