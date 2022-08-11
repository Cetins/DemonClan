package Quests.Players;

import Quests.IHeal;
import Quests.ITarget;
import Quests.Players.Helpers.Potions;

public class Healer extends Player implements IHeal {

    private Potions potion;

    public Healer(int healthLevel, Potions potion) {
        super(healthLevel);
        this.potion = potion;
    }

    public Potions getPotion() {
        return potion;
    }

    public void setPotion(Potions potion) {
        this.potion = potion;
    }

    public void heal(Player player) {
        player.setHealthLevel(player.getHealthLevel() + this.getPotion().getHeal());
    }
}
