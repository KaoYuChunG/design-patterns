package com.structural.facade;

public class Client {

    public static void main(String[] args){
        HomeTheater home = new HomeTheater();
        home.ready();
        home.play();
        home.end();
    }
}
