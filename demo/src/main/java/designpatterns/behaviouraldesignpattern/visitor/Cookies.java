package designpatterns.behaviouraldesignpattern.visitor;

public class Cookies implements Product{
    String brandName;

    public Cookies(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public int getPrice() {
        return 200;
    }
}
