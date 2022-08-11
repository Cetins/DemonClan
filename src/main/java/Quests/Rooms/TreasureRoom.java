package Quests.Rooms;

import Quests.Players.Helpers.Herbs;
import Quests.Players.Helpers.Treasures;

import java.util.ArrayList;

public class TreasureRoom {

    ArrayList<Herbs> herbs;
    ArrayList<Treasures> treasures;

    public TreasureRoom(ArrayList<Herbs> herbs, ArrayList<Treasures> treasures) {
        this.herbs = herbs;
        this.treasures = treasures;
    }

    public ArrayList<Herbs> getHerbs() {
        return herbs;
    }

    public void setHerbs(ArrayList<Herbs> herbs) {
        this.herbs = herbs;
    }

    public ArrayList<Treasures> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasures> treasures) {
        this.treasures = treasures;
    }
}
