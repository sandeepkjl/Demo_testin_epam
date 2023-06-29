package designpatterns.stucturaldesignpattern.composite;

public class SoftwareEngineer implements Employee{
    String id;
    String name;
    String position;

    public SoftwareEngineer(String id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void printEmployeeDetails() {
        System.out.println("ID : "+id+" Name :"+name+ " Position :"+position);
    }
}
