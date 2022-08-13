package DemonClan.Players.Fighters;

import DemonClan.Interfaces.ITarget;
import DemonClan.Helpers.Weapons;

public class Dwarf extends Fighter {

    public Dwarf(int healthLevel, Weapons weapon) {
        super(healthLevel, weapon);
    }

    public void doubleSpeedAttack(ITarget target) {
        int doubleSpeedDamage = this.getWeapon().getSpeed() * 2 * this.getWeapon().getDamage();
        target.takeDamage(doubleSpeedDamage);
    }
}
