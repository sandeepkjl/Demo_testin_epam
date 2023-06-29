package designpatterns.behaviouraldesignpattern.visitor;

public class Soap implements Product{

    String brandName;

    public Soap(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
