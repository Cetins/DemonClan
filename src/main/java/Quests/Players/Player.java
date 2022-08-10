package Quests.Players;

import Quests.ITarget;
import Quests.ITool;

public class Player implements ITarget {

    private int healthLevel;

    public Player(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }
}
