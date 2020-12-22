package com.behavioral.strategy.pratica.duck;

import com.behavioral.strategy.pratica.fly.NoFlyBehavior;
import com.behavioral.strategy.pratica.quack.NoQuackBehavior;

public class ToyDuck extends Duck {

    public ToyDuck() {

        flyBehavior = new NoFlyBehavior();
        quackBehavior = new NoQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    // 需要重写父类的所有方法
    public void quack() {
        System.out.println("玩具鸭不能叫~~");
    }

    public void swim() {
        System.out.println("玩具鸭不会游泳~~");
    }

}
