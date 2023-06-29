package designpatterns.behaviouraldesignpattern.startegy;

public class SubtractOperation implements ArithmeticOperation{

    @Override
    public void operation(int a, int b) {
        int res=0;
        if(a>b){
            res=a-b;
        }else{
            res=b-a;
        }

        System.out.println("subtract : "+res);
    }
}
