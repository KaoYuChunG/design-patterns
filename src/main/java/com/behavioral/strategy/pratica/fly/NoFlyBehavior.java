package com.behavioral.strategy.pratica.fly;

public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println(" 不会飞翔 ");
    }

}
