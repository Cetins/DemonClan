package DemonClan.Players;

import DemonClan.Helpers.CoinBundles;
import DemonClan.Helpers.Herbs;
import DemonClan.Helpers.Treasures;
import DemonClan.Interfaces.ICollect;
import DemonClan.Interfaces.ITarget;
import DemonClan.Rooms.Room;
import DemonClan.Rooms.TreasureRoom;

import java.util.ArrayList;

public abstract class Player implements ITarget, ICollect {

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

    public void collectHerb(Room room) {
        ArrayList<Herbs> herbs = room.getHerbs();
        int healthPoints = 0;
        for (Herbs herb:
             herbs) {
            healthPoints += herb.getPoints();
        }
        this.addHealth(healthPoints);
    }

    public void collectCoins(Room room) {
        ArrayList<CoinBundles> coinBundles = room.getCoinBundles();
        int coins = 0;
        for (CoinBundles coinBundle:
             coinBundles) {
            coins += coinBundle.getCoins();
        }
        this.addCoins(coins);
    }

    public void collectTreasure(TreasureRoom treasureRoom) {
        ArrayList<Treasures> treasures = treasureRoom.getTreasures();
        int treasurePoints = 0;
        for (Treasures treasure:
             treasures) {
            treasurePoints += treasure.getPoints();
        }
        this.addCoins(treasurePoints);
    }
}
