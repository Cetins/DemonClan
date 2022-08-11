package Quests.Helpers;

public enum Spells {
    FIREBALL(40, 1),
    SOUL_FIRE(30,2),
    ACID_CLOUD(30,2),
    POISON_CLOUD(30,2);

    private final int damage;
    private final int speed;

    Spells(int damage, int speed) {
        this.damage = damage;
        this.speed = speed;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }
}
