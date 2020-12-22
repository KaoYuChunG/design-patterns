package com.principls.singlereponsibility;

public class Singlereponsibility1 {

    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.run("moto");
        vehicle.run("car");


    }
}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle+ "----");
    }
}
