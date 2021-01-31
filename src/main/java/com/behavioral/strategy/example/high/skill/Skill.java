package com.behavioral.strategy.example.high.skill;

import com.behavioral.strategy.example.high.Hero;

public interface Skill {
    /**
     * @param attackingHero 攻擊者
     * @param attackedHero 被攻擊者
     * @return 回傳此次攻擊的傷害值
     */
    int attack(Hero attackingHero, Hero attackedHero);
}
