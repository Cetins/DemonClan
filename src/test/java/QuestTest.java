import DemonClan.Demons.Demon;
import DemonClan.Demons.FlameLurker;
import DemonClan.Helpers.*;
import DemonClan.Players.Fighters.Knight;
import DemonClan.Players.Spellers.Warlock;
import DemonClan.Quests.Quest;
import DemonClan.Rooms.DemonRoom;
import DemonClan.Rooms.TreasureRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class QuestTest {

    Quest demonQuest;
    Knight knight;
    Warlock warlock;
    FlameLurker flameLurker;
    ArrayList<Herbs> herbs;
    ArrayList<CoinBundles> coinBundles;
    ArrayList<Treasures> treasures;
    ArrayList<Demon> demons;
    TreasureRoom treasureRoom;
    DemonRoom demonRoom;

    @Before
    public void before() {
        knight = new Knight(200, Weapons.SWORD);
        warlock = new Warlock(200, Spells.POISON_CLOUD);
        flameLurker = new FlameLurker(300, AttackMethods.FIRE);
        herbs = new ArrayList<>(Arrays.asList(Herbs.OLD_SPICE, Herbs.PURPLE_LOTUS)); // 70hp
        coinBundles = new ArrayList<>(Arrays.asList(CoinBundles.SMALL, CoinBundles.SMALL, CoinBundles.LARGE));  // 70pt
        treasures = new ArrayList<>(Arrays.asList(Treasures.SILVER, Treasures.GOLD)); // 300pt
        demons = new ArrayList<>(Arrays.asList(flameLurker));
        treasureRoom = new TreasureRoom(herbs, coinBundles, treasures);
        demonRoom = new DemonRoom(herbs, coinBundles, demons);
        demonQuest = new Quest();

        demonQuest.addPlayer(knight);
        demonQuest.addRoom(demonRoom);
    }

    @Test
    public void hasPlayers() {
        assertEquals(1, demonQuest.getPlayers().size());
    }

    @Test
    public void hasRooms() {
        assertEquals(1, demonQuest.getRooms().size());
    }

    @Test
    public void canAddPlayer() {
        demonQuest.addPlayer(warlock);
        assertEquals(2, demonQuest.getPlayers().size());
    }

    @Test
    public void canAddRoom() {
        demonQuest.addRoom(treasureRoom);
        assertEquals(2, demonQuest.getRooms().size());
    }
}
