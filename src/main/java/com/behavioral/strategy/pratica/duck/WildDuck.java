package com.behavioral.strategy.pratica.duck;

import com.behavioral.strategy.pratica.fly.GoodFlyBehavior;
import com.behavioral.strategy.pratica.quack.GaGaQuackBehavior;

public class WildDuck extends Duck {

    // 构造器，传入 FlyBehavor 的对象
    public WildDuck() {

        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println(" 这是野鸭 ");
    }

}
