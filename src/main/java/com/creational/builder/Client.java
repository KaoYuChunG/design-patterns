package com.creational.builder;

public class Client {
    public static void main(String[] args){
        CommonHouse commonHouse = new CommonHouse();

        HouseDirector director = new HouseDirector(commonHouse);

        House house = director.construcHouse();

        System.out.println("===============================");
        HighBuilding highBuilding = new HighBuilding();

        director.setHouseBuilder(highBuilding);

        director.construcHouse();
    }
}
