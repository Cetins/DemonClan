package Quests.Players.Fighters;

import Quests.ITarget;
import Quests.Helpers.Weapons;

public class Barbarian extends Fighter {

    public Barbarian(int healthLevel, Weapons weapon) {
        super(healthLevel, weapon);
    }

    public void heavyAttack(ITarget target) {
        int heavyDamage = this.getWeapon().getDamage() * 3;
        target.takeDamage(heavyDamage);
    }
}
