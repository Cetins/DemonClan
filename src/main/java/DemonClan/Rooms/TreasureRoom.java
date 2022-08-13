package DemonClan.Rooms;

import DemonClan.Helpers.CoinBundles;
import DemonClan.Helpers.Herbs;
import DemonClan.Helpers.Treasures;

import java.util.ArrayList;

public class TreasureRoom extends Room {

    ArrayList<Treasures> treasures;

    public TreasureRoom(ArrayList<Herbs> herbs, ArrayList<CoinBundles> coinBundles, ArrayList<Treasures> treasures) {
        super(herbs, coinBundles);
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
