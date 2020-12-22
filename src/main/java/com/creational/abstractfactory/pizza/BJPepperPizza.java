package com.creational.abstractfactory.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJ Pepper");
        System.out.println("BJ Pepper");
    }
}
