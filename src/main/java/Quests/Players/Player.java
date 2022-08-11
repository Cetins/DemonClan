package Quests.Players;

import Quests.ITarget;

public abstract class Player implements ITarget {

    private int healthLevel;
    private int coins;

    public Player(int healthLevel) {
        this.healthLevel = healthLevel;
        this.coins = 0;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void addHealth(int points) {
        this.setHealthLevel(this.getHealthLevel() + points);
    }

    public void addCoins(int points) { this.setCoins(this.getCoins() + points); }

    public void takeDamage(int damage) {
        setHealthLevel(this.healthLevel - damage);
    }
}
