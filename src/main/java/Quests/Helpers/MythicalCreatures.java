package Quests.Helpers;

public enum MythicalCreatures {

    OGRE(10, 4, 100),
    WOLF(30, 2, 300),
    DRAGON(40,1, 400);

    private final int damage;
    private final int speed;
    private final int health;

    MythicalCreatures(int damage, int speed, int health) {
        this.damage = damage;
        this.speed = speed;
        this.health = health;
    }
}
