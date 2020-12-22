package com.behavioral.observer;

public class Google implements Observer{

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("========Today the temperature is "+ temperature + "--->Google");
        System.out.println("========Today the pressure is "+ pressure + "--->Google");
        System.out.println("========Today the humidity is "+ humidity + "--->Google");
    }
}
