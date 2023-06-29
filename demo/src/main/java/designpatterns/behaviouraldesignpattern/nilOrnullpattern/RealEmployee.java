package designpatterns.behaviouraldesignpattern.nilOrnullpattern;

public class RealEmployee extends EmployeeBase{
    String id;
    String name;

    public RealEmployee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RealEmployee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void printEmpDetails() {
         System.out.println(this.toString());
    }
}
