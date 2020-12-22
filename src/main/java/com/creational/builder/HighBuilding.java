package com.creational.builder;

public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("Basic of HighBuilding ");
    }

    @Override
    public void buildWalls() {
        System.out.println("Walls of HighBuilding ");
    }

    @Override
    public void roofed() {
        System.out.println("roofed of HighBuilding ");
    }
}
