package DemonClan.Players.Fighters;

import DemonClan.Interfaces.ITarget;
import DemonClan.Helpers.Weapons;
import DemonClan.Players.Player;

public class Fighter extends Player {

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

    public void giveDamage(ITarget target) {
        int damagePoints = this.weapon.getDamage() * this.weapon.getSpeed();
        target.takeDamage(damagePoints);
    }
}
