package DemonClan.Helpers;

public enum AttackMethods {

    SPELL(20, 2),
    FIRE(30, 2),
    POISON(40,1),
    SWORD(20, 2);


    private final int damage;
    private final int speed;

    AttackMethods(int damage, int speed) {

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
