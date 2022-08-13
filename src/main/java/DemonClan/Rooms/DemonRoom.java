package DemonClan.Rooms;

import DemonClan.Demons.Demon;
import DemonClan.Helpers.CoinBundles;
import DemonClan.Helpers.Herbs;
import DemonClan.Helpers.Treasures;
import DemonClan.Players.Player;

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

    public void splitDemonFight(ArrayList<Player> players) {
        this.splitHP(players);
        this.splitCoins(players);
        ArrayList<Demon> demons = this.getDemons();
        int totalDamage = demons.stream()
                .mapToInt(Demon::getHealthLevel)
                .sum();
        double damagePerPlayer = totalDamage / players.size();
        for (Player player:
                players) {
            player.takeDamage((int)damagePerPlayer);
        }
    }
}
