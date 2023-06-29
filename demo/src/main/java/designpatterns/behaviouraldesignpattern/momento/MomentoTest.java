package designpatterns.behaviouraldesignpattern.momento;

/**
 * Momento Pattern is used to keep record for a object state  and we can go to previous state of a object.
 * <p>
 * see below expmale of keeping employee state at every year.
 **/
public class MomentoTest {
    public static void main(String args[]) {
        Employee employee = new Employee("EMP01", "Sandeep", 25000, 1, "SE");

        EmployeeCareTaker employeeCareTaker = new EmployeeCareTaker();

        employeeCareTaker.addEmployeeMomento(employee.createMomento(employee));

        //emp sal and yoe changes after 2 years
        employee.setYearOfExperience(2);
        employee.setSalary(30000);

        employeeCareTaker.addEmployeeMomento(employee.createMomento(employee));

        // emp details after 3 years
        employee.setYearOfExperience(3);
        employee.setSalary(50000);
        employee.setPosition("SSE");

        employeeCareTaker.addEmployeeMomento(employee.createMomento(employee));

        //print employee details year by year

        for (int i = 1; i < 4; i++) {
            System.out.println("Emp Details : " + employeeCareTaker.getEmployeeDetailsOnYearOfExperience(i));
        }
    }

}
