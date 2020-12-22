package com.principls.singlereponsibility;

public class Singlereponsibility2 {
    public static void main(String[] args){
        RoaVehicle vehicle = new RoaVehicle();
        vehicle.run("moto");
        vehicle.run("car");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("plan");
    }
}

class RoaVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle+ "----");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle+ "----");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle+ "----");
    }
}

