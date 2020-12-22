package com.creational.simpleFactory.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare the Cheese Pizza ");
    }
}
