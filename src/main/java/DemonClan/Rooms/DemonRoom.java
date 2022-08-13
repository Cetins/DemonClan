package DemonClan.Rooms;

import DemonClan.Demons.Demon;
import DemonClan.Helpers.CoinBundles;
import DemonClan.Helpers.Herbs;

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
