package com.creational.builder.normal;

public class CommonHouse extends AbsHouse{
    @Override
    public void buildBasic() {
        System.out.println("Basic of Common");
    }

    @Override
    public void buildWalls() {
        System.out.println("Basic of Walls");
    }

    @Override
    public void roofed() {
        System.out.println("Basic of Roofed");
    }
}
