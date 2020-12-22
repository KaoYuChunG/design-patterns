package com.creational.simpleFactory.pizza;

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare the Pepper Pizza ");
    }
}
