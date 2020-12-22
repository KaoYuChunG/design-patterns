package com.behavioral.strategy.pratica.duck;

import com.behavioral.strategy.pratica.fly.FlyBehavior;
import com.behavioral.strategy.pratica.quack.QuackBehavior;

public abstract class Duck {

    // 属性，策略接口
    FlyBehavior flyBehavior;
    // 其它属性<->策略接口
    QuackBehavior quackBehavior;

    public Duck() {

    }

    // 显示鸭子信息
    public abstract void display();

    public void quack() {
        if(quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void swim() {
        System.out.println("鸭子会游泳~~");
    }

    public void fly() {

        if(flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
