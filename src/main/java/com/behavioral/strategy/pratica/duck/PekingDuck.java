package com.behavioral.strategy.pratica.duck;

import com.behavioral.strategy.pratica.fly.BadFlyBehavior;
import com.behavioral.strategy.pratica.quack.GaGaQuackBehavior;

public class PekingDuck extends Duck {

    // 假如北京鸭可以飞翔，但是飞翔技术一般
    public PekingDuck() {

        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("~~北京鸭~~~");
    }

}
