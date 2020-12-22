package com.creational.abstractfactory.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("LD Pepper");
        System.out.println("LD Pepper");
    }
}
