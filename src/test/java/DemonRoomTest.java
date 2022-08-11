import Quests.Demons.Demon;
import Quests.Demons.Phalanx;
import Quests.Helpers.*;
import Quests.Players.Fighters.Knight;
import Quests.Rooms.DemonRoom;
import Quests.Rooms.TreasureRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DemonRoomTest {

    Knight knight;
    Phalanx phalanx;
    ArrayList<Herbs> herbs;
    ArrayList<CoinBundles> coinBundles;
    ArrayList<Demon> demons;
    DemonRoom demonRoom;

    @Before
    public void before() {
        knight = new Knight(200, Weapons.SWORD);
        phalanx = new Phalanx(300, AttackMethods.POISON);
        herbs = new ArrayList<>(Arrays.asList(Herbs.OLD_SPICE, Herbs.PURPLE_LOTUS));
        coinBundles = new ArrayList<>(Arrays.asList(CoinBundles.SMALL, CoinBundles.SMALL, CoinBundles.LARGE));
        demons = new ArrayList<>(Arrays.asList(phalanx));
        demonRoom = new DemonRoom(herbs, coinBundles, demons);
    }

    @Test
    public void hasArrayOfHerbs() {
        assertEquals(2, demonRoom.getHerbs().size());
    }

    @Test
    public void hasArrayOfCoinBundles() {
        assertEquals(3, demonRoom.getCoinBundles().size());
    }

    @Test
    public void playerCanCollectHerbs() {
        phalanx.giveDamage(knight); // knight healthLevel should go 160
        knight.collectHerb(demonRoom); // room has herbs in total value of 70
        assertEquals(230, knight.getHealthLevel());
    }

    @Test
    public void playerCanCollectCoinBundles() {
        knight.collectCoins(demonRoom);
        assertEquals(70, knight.getCoins());
    }

}
