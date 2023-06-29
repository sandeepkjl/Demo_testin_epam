package designpatterns.behaviouraldesignpattern.visitor;

public class Shirt implements Product{

    String size;
    String brandName;

    public Shirt(String size, String brandName) {
        this.size = size;
        this.brandName = brandName;
    }

    @Override
    public int getPrice() {
       return 1000;
    }
}
