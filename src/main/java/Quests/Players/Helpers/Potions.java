package Quests.Players.Helpers;

import Quests.IHeal;

public enum Potions {

    CRESCENT_MOON_GRASS(10),
    HALF_MOON_GRASS(20),
    FULL_MOON_GRASS(40),
    ROYAL_LOTUS(40);

    private final int heal;

    Potions(int heal) {
        this.heal = heal;
    }

    public int getHeal() {
        return heal;
    }
}
