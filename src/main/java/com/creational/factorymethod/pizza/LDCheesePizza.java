package com.creational.factorymethod.pizza;

public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("LD Cheese");
        System.out.println("LD Cheese");
    }
}
