package DemonClan.Players.Fighters;

import DemonClan.Helpers.Weapons;

public class Knight extends Fighter {

    private boolean armor;

    public Knight(String name, int healthLevel, Weapons weapon) {
        super(name, healthLevel, weapon);
        this.armor = armor;
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
