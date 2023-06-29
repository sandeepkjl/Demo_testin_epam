package com.example.demo;

public class EmployeeBuilder {

    int id;

    String name;

    int age;

    double salary;



    public EmployeeBuilder setid(int id){
        this.id=id;
        return this;
    }

    public EmployeeBuilder setName(String name){
        this.name=name;
        return this;
    }
    public EmployeeBuilder setAge(int age){
        this.age=age;
        return this;
    }
    public EmployeeBuilder setSalary(double salary){
        this.salary=salary;
        return this;
    }

    public Employee build(){
        return new Employee(id,name,age,salary);
    }
}
