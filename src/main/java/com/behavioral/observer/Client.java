package com.behavioral.observer;

public class Client {

    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();

        CurrentCondition currentCondition = new CurrentCondition();

        weatherData.registerObserver(currentCondition);

        System.out.println("====CurrentCondition=====");
        weatherData.setData(12f,50f,40f);

        System.out.println("====ADD Google========");
        Google google = new Google();
        weatherData.registerObserver(google);
        weatherData.setData(12f,50f,40f);




    }
}
