
package com.behavioral.strategy.example.primeiro;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("小王", Hero.Skill.COLLIDING);
        Hero hero2 = new Hero("小明", Hero.Skill.WATERBALL);

        Battle battle = new Battle(hero1, hero2);
        battle.start();
    }
}
