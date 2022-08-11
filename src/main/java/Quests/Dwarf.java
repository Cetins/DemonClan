package Quests;

import Quests.Players.Fighter;
import Quests.Players.Helpers.Weapons;

public class Dwarf extends Fighter {

    public Dwarf(int healthLevel, Weapons weapon) {
        super(healthLevel, weapon);
    }

    public void doubleSpeedAttack(ITarget target) {
        int doubleSpeedDamage = this.getWeapon().getSpeed() * 2 * this.getWeapon().getDamage();
        target.takeDamage(doubleSpeedDamage);
    }
}
