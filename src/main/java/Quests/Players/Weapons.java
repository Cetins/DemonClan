package Quests.Players;

import Quests.IDamage;

public enum Weapons implements IDamage {
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
