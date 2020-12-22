package com.structural.bridge;

public class Folde extends Phone{

    public Folde(Brand brand) {
        super(brand);
    }
    public void open(){
        super.open();
        System.out.println("flode phone open");
    }

    public void close() {
        super.close();
        System.out.println("flode phone close");
    }

    public void call() {
        super.call();
        System.out.println("flode phone call");
    }
}
