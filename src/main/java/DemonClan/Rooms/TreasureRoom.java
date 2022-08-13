package DemonClan.Rooms;

import DemonClan.Helpers.CoinBundles;
import DemonClan.Helpers.Herbs;
import DemonClan.Helpers.Treasures;
import DemonClan.Players.Player;

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

    public ArrayList<Treasures> getTreasures() {
        return treasures;
    }

    public void splitTreasures(ArrayList<Player> players) {
        this.splitHP(players);
        this.splitCoins(players);
        ArrayList<Treasures> treasures = this.getTreasures();
        int totalCoinPoints = treasures.stream()
                .mapToInt(Treasures::getPoints)
                .sum();
        double coinsPerPlayer = totalCoinPoints / players.size();
        for (Player player:
                players) {
            player.addCoins((int)coinsPerPlayer);
        }
    }
}
