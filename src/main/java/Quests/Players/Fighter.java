package Quests.Players;

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
}
