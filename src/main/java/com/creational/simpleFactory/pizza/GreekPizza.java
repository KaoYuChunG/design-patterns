package com.creational.simpleFactory.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare the Greek Pizza ");
    }
}
