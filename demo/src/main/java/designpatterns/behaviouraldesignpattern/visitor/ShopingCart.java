package designpatterns.behaviouraldesignpattern.visitor;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ShopingCart {
     List<Product> products= new ArrayList();
     {
        products.add(new Shirt("Long","Levis"));
        products.add(new Soap("Lux"));
        products.add(new Cookies("Pale"));
    }

    public  List<Product> getProducts() {
        return products;
    }
}
