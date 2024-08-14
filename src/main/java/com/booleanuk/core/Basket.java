package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    public List<Product> items = new ArrayList<>();

    public void add(Product product) {
        this.items.add(product);
    }

    public float price() {
        float price = 0;
        for (Product product : this.items)
            price += product.price();

        return price;
    }
}
