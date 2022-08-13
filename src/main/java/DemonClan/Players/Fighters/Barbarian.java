package DemonClan.Players.Fighters;

import DemonClan.Interfaces.ITarget;
import DemonClan.Helpers.Weapons;

public class Barbarian extends Fighter {

    public Barbarian(String name, int healthLevel, Weapons weapon) {
        super(name, healthLevel, weapon);
    }

    public void heavyAttack(ITarget target) {
        int heavyDamage = this.getWeapon().getDamage() * 3;
        target.takeDamage(heavyDamage);
    }
}
