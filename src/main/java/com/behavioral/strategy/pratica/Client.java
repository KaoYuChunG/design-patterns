package com.behavioral.strategy.pratica;

import com.behavioral.strategy.pratica.duck.PekingDuck;
import com.behavioral.strategy.pratica.duck.ToyDuck;
import com.behavioral.strategy.pratica.duck.WildDuck;
import com.behavioral.strategy.pratica.fly.NoFlyBehavior;
import com.behavioral.strategy.pratica.quack.NoQuackBehavior;

public class Client {

    public static void main(String[] args) {
        System.out.println("野鸭鸭的实际飞翔能力");
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.quack();

        System.out.println("玩具鸭的实际飞翔能力");
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
        toyDuck.quack();

        System.out.println("北京鸭的实际飞翔能力");
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();
        pekingDuck.quack();
        // 动态改变某个对象的行为, 北京鸭 不能飞
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        pekingDuck.setQuackBehavior(new NoQuackBehavior());
        System.out.println("北京鸭的实际飞翔能力");
        pekingDuck.fly();
        pekingDuck.quack();
    }

}
