package com.behavioral.strategy.example.high;

import com.behavioral.strategy.example.high.skill.Colliding;
import com.behavioral.strategy.example.high.skill.Habilite;
import com.behavioral.strategy.example.high.skill.Waterball;

//只要在skill加入class就可以，不需要一直用case和組合型的類爆炸
public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero("小王", new Habilite());
        Hero hero2 = new Hero("小明", new Waterball());

        Battle battle = new Battle(hero1, hero2);
        battle.start();
    }
}
