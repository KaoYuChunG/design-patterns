package com.behavioral.strategy.pratica.quack;

public class NoQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println(" No No ~~~");
    }
}
