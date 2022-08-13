package DemonClan;

import DemonClan.Demons.Demon;
import DemonClan.Demons.FlameLurker;
import DemonClan.Demons.Phalanx;
import DemonClan.Helpers.*;
import DemonClan.Players.Fighters.Knight;
import DemonClan.Players.Player;
import DemonClan.Players.Spellers.Warlock;
import DemonClan.Quests.Quest;
import DemonClan.Rooms.DemonRoom;
import DemonClan.Rooms.Room;
import DemonClan.Rooms.TreasureRoom;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {


    public static void main(String[] args) {
        // players
        Knight knight = new Knight("Knight", 400,Weapons.SWORD);
        Warlock warlock = new Warlock("Warlock", 200,Spells.POISON_CLOUD);
        //  items in the rooms
        ArrayList<Herbs> herbs = new ArrayList<>(Arrays.asList(Herbs.OLD_SPICE, Herbs.PURPLE_LOTUS));
        ArrayList<CoinBundles> coinBundles = new ArrayList<>(Arrays.asList(CoinBundles.SMALL, CoinBundles.SMALL, CoinBundles.LARGE));
        ArrayList<Treasures> treasures = new ArrayList<>(Arrays.asList(Treasures.SILVER, Treasures.GOLD));
        // demons
        Phalanx phalanx = new Phalanx(300,AttackMethods.POISON);
        FlameLurker flameLurker = new FlameLurker(300, AttackMethods.FIRE);
        ArrayList<Demon> demons1 = new ArrayList<>(Arrays.asList(phalanx));
        ArrayList<Demon> demons2 = new ArrayList<>(Arrays.asList(flameLurker));
        //  rooms
        DemonRoom demonRoom1 = new DemonRoom(herbs, coinBundles, demons1);
        DemonRoom demonRoom2 = new DemonRoom(herbs, coinBundles, demons2);
        TreasureRoom treasureRoom = new TreasureRoom(herbs, coinBundles, treasures);
        Quest quest = new Quest();
        quest.addRoom(demonRoom1);
        quest.addRoom(demonRoom2);
        quest.addRoom(treasureRoom);
        quest.addPlayer(knight);
        quest.addPlayer(warlock);

        ArrayList<Player> players = quest.getPlayers();
        ArrayList<Room> rooms = quest.getRooms();

        //  for each room in the quest
        for (Room room:
             rooms) {
            if (room instanceof TreasureRoom) {
                ((TreasureRoom) room).splitTreasures(players);
            }
            if (room instanceof DemonRoom) {
                ((DemonRoom) room).splitDemonFight(players);
            }
        }

        for (Player player:
             players) {
            if (player.isAlive()){
                System.out.println(player.getName() + " is still alive");
                player.addCoins(5000);
                System.out.println(player.getName() + " has " + player.getCoins() + " coins");
                System.out.println("Quest completed successfully");
                return;
            }
        }
        System.out.println("Quest has failed, all players are dead");
    }
}
