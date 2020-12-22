package com.structural.bridge;

public class XaiMi implements  Brand {
    @Override
    public void open() {
        System.out.println("XaiMi phone open");
    }

    @Override
    public void close() {
        System.out.println("XaiMi phone close");
    }

    @Override
    public void call() {
        System.out.println("XaiMi phone call");
    }
}
