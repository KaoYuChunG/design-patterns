package com.creational.factorymethod.pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("BJ Cheese");
        System.out.println("BJ Cheese");
    }
}
