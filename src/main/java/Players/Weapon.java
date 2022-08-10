package Players;

public enum Weapon {
    AXE(30, 1),
    SWORD(20, 2),
    KNIFE(10, 1);

    private final int damage;
    private final int speed;

    Weapon(int damage, int speed) {
        this.damage = damage;
        this.speed = speed;
    }
}
