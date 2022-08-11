package Quests.Rooms;

import Quests.Helpers.CoinBundles;
import Quests.Helpers.Herbs;

import java.util.ArrayList;

public abstract class Room {

    ArrayList<Herbs> herbs;
    ArrayList<CoinBundles> coinBundles;

    public Room(ArrayList<Herbs> herbs, ArrayList<CoinBundles> coinBundles) {
        this.herbs = herbs;
        this.coinBundles = coinBundles;
    }

    public ArrayList<Herbs> getHerbs() {
        return herbs;
    }

    public void setHerbs(ArrayList<Herbs> herbs) {
        this.herbs = herbs;
    }

    public ArrayList<CoinBundles> getCoinBundles() {
        return coinBundles;
    }

    public void setCoinBundles(ArrayList<CoinBundles> coinBundles) {
        this.coinBundles = coinBundles;
    }
}
