package com.creational.builder;

public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("Basic of Common ");
    }

    @Override
    public void buildWalls() {
        System.out.println("Walls of Common ");
    }

    @Override
    public void roofed() {
        System.out.println("roofed of Common ");
    }
}
