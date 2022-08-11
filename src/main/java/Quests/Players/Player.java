package Quests.Players;

import Quests.ITarget;

public class Player implements ITarget {

    private int healthLevel;

    public void addHealth(int points) {
        this.setHealthLevel(this.getHealthLevel() + points);
    }

    public Player(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public void takeDamage(int damage) {
        setHealthLevel(this.healthLevel - damage);
    }
}
