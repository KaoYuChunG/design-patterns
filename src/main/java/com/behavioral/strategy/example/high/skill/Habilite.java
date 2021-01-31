package com.behavioral.strategy.example.high.skill;

import com.behavioral.strategy.example.high.Hero;

public class Habilite implements Skill{

    //在此處血藥處裡的流程，此方法又稱為單一職責原則
    @Override
    public int attack(Hero attackingHero, Hero attackedHero) {
        attackingHero.lostMp(50);
        int injury = attackingHero.getWisdom()*5;
        attackedHero.lostHp(injury);
        return injury;
    }

    @Override
    public String toString() {
        return "天外飛仙";
    }
}
