package DemonClan.Players.Healers;

import DemonClan.Interfaces.IHeal;
import DemonClan.Helpers.Potions;
import DemonClan.Players.Player;

public class Healer extends Player implements IHeal {

    private Potions potion;

    public Healer(String name, int healthLevel, Potions potion) {
        super(name, healthLevel);
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
