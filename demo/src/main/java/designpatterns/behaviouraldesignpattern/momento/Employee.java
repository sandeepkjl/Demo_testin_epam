package designpatterns.behaviouraldesignpattern.momento;

/**
 * it is orignator
 *
 * **/
public class Employee {
    String empId;
    String empName;

    double salary;
    int YearOfExperience;



    String position;

    public Employee(String empId, String empName, double salary, int yearOfExperience, String position) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        YearOfExperience = yearOfExperience;
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getYearOfExperience() {
        return YearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        YearOfExperience = yearOfExperience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", YearOfExperience=" + YearOfExperience +
                ", position='" + position + '\'' +
                '}';
    }

    public EmployeeMomento createMomento(Employee e){
        return new EmployeeMomento(empId,empName,salary,YearOfExperience,position);
    }




}
