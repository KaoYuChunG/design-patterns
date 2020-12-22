package com.creational.abstractfactory.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJ Cheese");
        System.out.println("BJ Cheese");
    }
}
