package com.structural.facade;

public class DVDPlay {

    private static DVDPlay instance = new DVDPlay();

    public  static DVDPlay getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVDPlay on");
    }

    public void off() {
        System.out.println("DVDPlay off");
    }

    public void play() {
        System.out.println("DVDPlay play");
    }

    public void pause() {
        System.out.println("DVDPlay pause");
    }
}
