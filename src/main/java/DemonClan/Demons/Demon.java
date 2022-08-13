package DemonClan.Demons;

import DemonClan.IAttack;
import DemonClan.ITarget;
import DemonClan.Helpers.AttackMethods;

public abstract class Demon implements ITarget,IAttack {

    private int healthLevel;
    private AttackMethods attackMethods;

    public Demon(int healthLevel, AttackMethods attackMethods) {
        this.healthLevel = healthLevel;
        this.attackMethods = attackMethods;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public AttackMethods getAttackMethods() {
        return attackMethods;
    }

    public void giveDamage(ITarget target) {
        target.takeDamage(this.attackMethods.getDamage() * this.attackMethods.getSpeed());
    }

    public void takeDamage(int damage) {
        setHealthLevel(this.healthLevel - damage);
    }
}
