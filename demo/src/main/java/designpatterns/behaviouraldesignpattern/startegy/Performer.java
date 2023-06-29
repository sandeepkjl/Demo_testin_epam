package designpatterns.behaviouraldesignpattern.startegy;

public class Performer {
    ArithmeticOperation operation;

    public Performer() {

    }

    public void setOperation(ArithmeticOperation operation){
        this.operation=operation;
    }

    public void performOperation(int a, int b){
        operation.operation(a,b);
    }

}
