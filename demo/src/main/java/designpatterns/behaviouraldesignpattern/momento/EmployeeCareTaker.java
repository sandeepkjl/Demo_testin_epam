package designpatterns.behaviouraldesignpattern.momento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeCareTaker {

   static Map<Integer,EmployeeMomento > employeeMomentos;

    public EmployeeCareTaker() {
        this.employeeMomentos = new HashMap<>();
    }



    public void addEmployeeMomento(EmployeeMomento employeeMomento){
        employeeMomentos.put(employeeMomento.YearOfExperience,employeeMomento);
    }

    public EmployeeMomento getEmployeeDetailsOnYearOfExperience(int yoe){
        return employeeMomentos.get(yoe);
    }






}
