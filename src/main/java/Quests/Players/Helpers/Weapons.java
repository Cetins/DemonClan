package Quests.Players.Helpers;

import Quests.ITool;

public enum Weapons implements ITool {

    SPEAR(40,1),
    AXE(30, 2),
    SWORD(20, 3),
    BOW(20, 3),
    KNIFE(10, 4);

    private final int damage;
    private final int speed;

    Weapons(int damage, int speed) {
        this.damage = damage;
        this.speed = speed;
    }
}