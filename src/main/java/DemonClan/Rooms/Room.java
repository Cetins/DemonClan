package DemonClan.Rooms;

import DemonClan.Helpers.CoinBundles;
import DemonClan.Helpers.Herbs;
import DemonClan.Players.Player;

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

    public ArrayList<CoinBundles> getCoinBundles() {
        return coinBundles;
    }

    public void splitHP(ArrayList<Player> players) {
        ArrayList<Herbs> herbs = this.getHerbs();
        int totalHPPoints = herbs.stream()
                .mapToInt(Herbs::getPoints)
                .sum();
        double hpPerPlayer = totalHPPoints / players.size();

        for (Player player:
                players) {
            player.addHealth((int)hpPerPlayer);
        }
    }

    public void splitCoins(ArrayList<Player> players) {
        ArrayList<CoinBundles> coinBundles = this.getCoinBundles();
        int totalCoinPoints = coinBundles.stream()
                .mapToInt(CoinBundles::getCoins)
                .sum();
        double coinsPerPlayer = totalCoinPoints / players.size();
        for (Player player:
                players) {
            player.addCoins((int)coinsPerPlayer);
        }
    }

}
