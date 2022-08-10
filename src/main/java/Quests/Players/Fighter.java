package Quests.Players;

import Quests.ITarget;
import Quests.Players.Helpers.Weapons;

public class Fighter extends Player{

    private Weapons weapon;

    public Fighter(int healthLevel, Weapons weapon) {
        super(healthLevel);
        this.weapon = weapon;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public void damage(ITarget target) {
        int damagePoints = this.weapon.getDamage() * this.weapon.getSpeed();
        target.takeDamage(damagePoints);
    }
}
