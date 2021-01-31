
package com.behavioral.strategy.example.high.skill;

import com.behavioral.strategy.example.high.Hero;

public class Colliding implements Skill {
    @Override
    public int attack(Hero attackingHero, Hero attackedHero) {
        int injury = attackingHero.getStrength() - attackedHero.getDefense();
        attackedHero.lostHp(injury);
        return injury;
    }

    @Override
    public String toString() {
        return "衝撞";
    }
}
