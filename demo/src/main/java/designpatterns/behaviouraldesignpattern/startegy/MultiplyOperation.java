package designpatterns.behaviouraldesignpattern.startegy;

public class MultiplyOperation implements ArithmeticOperation{

    @Override
    public void operation(int a, int b) {
        int res=a*b;
        System.out.println("Multiply :" +res);
    }
}
