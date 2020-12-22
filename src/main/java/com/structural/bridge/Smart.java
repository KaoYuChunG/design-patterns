package com.structural.bridge;

public class Smart extends Phone {
    public Smart(Brand brand) {
        super(brand);
    }
    public void open(){
        super.open();
        System.out.println("Smart phone open");
    }

    public void close() {
        super.close();
        System.out.println("Smart phone close");
    }

    public void call() {
        super.call();
        System.out.println("Smart phone call");
        email();
    }

    private void email() {
        System.out.println("Smart phone email");
    }
}
