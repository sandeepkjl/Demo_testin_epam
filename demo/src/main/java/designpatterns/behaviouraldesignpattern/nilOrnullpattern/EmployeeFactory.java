package designpatterns.behaviouraldesignpattern.nilOrnullpattern;

import java.util.Arrays;
import java.util.List;

public class EmployeeFactory {
    static List<String> names;

    public EmployeeFactory() {
        names = Arrays.asList("Sandeep","Rohan","Rahul","Karan");
    }

    public EmployeeBase getEmployee(String id,String name){
        if(names.contains(name))
            return new RealEmployee(id,name);
        else
            return new NilEmployee();
    }

}
