package com.behavioral.strategy.example.high.skill;

import com.behavioral.strategy.example.high.Hero;
import com.behavioral.strategy.example.high.skill.Skill;

public class Waterball implements Skill {
    @Override
    public int attack(Hero attackingHero, Hero attackedHero) {
        attackingHero.lostMp(5);
        int injury = attackingHero.getWisdom()*2;
        attackedHero.lostHp(injury);
        return injury;
    }

    @Override
    public String toString() {
        return "水球";
    }
}
