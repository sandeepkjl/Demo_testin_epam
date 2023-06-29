package designpatterns.behaviouraldesignpattern.startegy;

public class AddOperation implements ArithmeticOperation{

    @Override
    public void operation(int a, int b) {
        int sum=a+b;
        System.out.println("sum ="+sum);
    }
}
