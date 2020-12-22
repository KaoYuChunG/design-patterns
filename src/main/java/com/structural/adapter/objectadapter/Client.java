package com.structural.adapter.objectadapter;

public class Client {
    public static void main(String[] args){
        System.out.println("----object adapter----" );
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
