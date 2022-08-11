package Quests.Players;

import Quests.Players.Helpers.Weapons;

public class Knight extends Fighter{

    private boolean armor;

    public Knight(int healthLevel, Weapons weapon) {
        super(healthLevel, weapon);
        this.armor = false;
    }

    public boolean isArmor() {
        return armor;
    }

    public void setArmor(boolean armor) {
        this.armor = armor;
    }

    public void putArmor() {
        setArmor(true);
    }

    public void takeDamage(int damage) {
        if (armor) {
            double reducedDamage = damage * 0.7;
            this.setHealthLevel(this.getHealthLevel() - (int)reducedDamage);
        }
        this.setHealthLevel(this.getHealthLevel() - damage);
    }
}
