package Quests.Rooms;

import Quests.Players.Demons.Demon;
import Quests.Players.Helpers.Herbs;
import Quests.Players.Helpers.Treasures;

import java.util.ArrayList;

public class DemonRoom extends TreasureRoom{

    ArrayList<Demon> demons;

    public DemonRoom(ArrayList<Herbs> herbs, ArrayList<Treasures> treasures, ArrayList<Demon> demons) {
        super(herbs, treasures);
        this.demons = demons;
    }

    public ArrayList<Demon> getDemons() {
        return demons;
    }

    public void setDemons(ArrayList<Demon> demons) {
        this.demons = demons;
    }
}
