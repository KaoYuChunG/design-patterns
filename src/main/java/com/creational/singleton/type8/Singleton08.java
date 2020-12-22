package com.creational.singleton.type8;

public class Singleton08 {
    public static void main(String[] args){
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton == singleton2);
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

enum Singleton {
    INSTANCE;

    public void method() {

    }

}

