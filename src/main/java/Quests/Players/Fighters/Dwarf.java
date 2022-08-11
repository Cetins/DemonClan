package Quests.Players.Fighters;

import Quests.ITarget;
import Quests.Players.Fighters.Fighter;
import Quests.Helpers.Weapons;

public class Dwarf extends Fighter {

    public Dwarf(int healthLevel, Weapons weapon) {
        super(healthLevel, weapon);
    }

    public void doubleSpeedAttack(ITarget target) {
        int doubleSpeedDamage = this.getWeapon().getSpeed() * 2 * this.getWeapon().getDamage();
        target.takeDamage(doubleSpeedDamage);
    }
}
