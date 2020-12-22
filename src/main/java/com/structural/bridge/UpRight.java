package com.structural.bridge;

public class UpRight extends Phone{
    public UpRight(Brand brand) {
        super(brand);
    }
    public void open(){
        super.open();
        System.out.println("UpRight phone open");
    }

    public void close() {
        super.close();
        System.out.println("UpRight phone close");
    }

    public void call() {
        super.call();
        System.out.println("UpRight phone call");
    }
}
