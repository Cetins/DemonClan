package Quests.Rooms;

import Quests.Demons.Demon;
import Quests.Helpers.CoinBundles;
import Quests.Helpers.Herbs;
import Quests.Helpers.Treasures;

import java.util.ArrayList;

public class DemonRoom extends Room{

    ArrayList<Demon> demons;

    public DemonRoom(ArrayList<Herbs> herbs, ArrayList<CoinBundles> coinBundles, ArrayList<Demon> demons) {
        super(herbs, coinBundles);
        this.demons = demons;
    }

    public ArrayList<Demon> getDemons() {
        return demons;
    }

    public void setDemons(ArrayList<Demon> demons) {
        this.demons = demons;
    }
}
