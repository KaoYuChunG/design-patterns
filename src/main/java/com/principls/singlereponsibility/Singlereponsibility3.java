package com.principls.singlereponsibility;

public class Singlereponsibility3 {
    public static void main(String[] args){
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("car");
        vehicle2.AirRun("plan");
        vehicle2.WaterRun("nave");
    }
}

class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle+ " Roa----");
    }

    public void AirRun(String vehicle) {
        System.out.println(vehicle+ " Air----");
    }

    public void WaterRun(String vehicle) {
        System.out.println(vehicle+ "Water----");
    }
}
