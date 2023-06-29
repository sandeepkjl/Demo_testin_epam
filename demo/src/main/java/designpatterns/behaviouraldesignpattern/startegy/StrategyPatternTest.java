package designpatterns.behaviouraldesignpattern.startegy;

public class StrategyPatternTest {

    public static void main(String args[]){

        ArithmeticOperation operation = new AddOperation();
        ArithmeticOperation operationSub = new SubtractOperation();
        ArithmeticOperation operationMul = new MultiplyOperation();
        Performer performer = new Performer();
        performer.setOperation(operation);
        performer.performOperation(5,5);

        performer.setOperation(operationSub);
        performer.performOperation(5,5);


        performer.setOperation(operationMul);
        performer.performOperation(5,5);
    }
}
