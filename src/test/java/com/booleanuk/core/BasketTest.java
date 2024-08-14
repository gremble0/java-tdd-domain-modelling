package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void shouldAddProductToBasket() {
        Basket basket = new Basket();
        basket.add(new Product("Bread", 29, 0.0f));
        Assertions.assertEquals(1, basket.items.size());
    }

    @Test
    public void shouldCalculateTotal() {
        Basket basket = new Basket();
        basket.add(new Product("Bread", 29, 0.0f));
        basket.add(new Product("Soda", 20, 0.5f));
        Assertions.assertEquals(2, basket.items.size());
        Assertions.assertEquals(29 + (20 * 0.5), basket.total());
    }

}
