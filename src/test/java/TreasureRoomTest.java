import DemonClan.Demons.Phalanx;
import DemonClan.Helpers.*;
import DemonClan.Players.Fighters.Knight;
import DemonClan.Rooms.TreasureRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    Knight knight;
    Phalanx phalanx;
    ArrayList<Herbs> herbs;
    ArrayList<CoinBundles> coinBundles;
    ArrayList<Treasures> treasures;
    TreasureRoom treasureRoom;

    @Before
    public void before() {
        knight = new Knight("Knight",200, Weapons.SWORD);
        phalanx = new Phalanx(300, AttackMethods.POISON);
        herbs = new ArrayList<>(Arrays.asList(Herbs.OLD_SPICE, Herbs.PURPLE_LOTUS)); // 70hp
        coinBundles = new ArrayList<>(Arrays.asList(CoinBundles.SMALL, CoinBundles.SMALL, CoinBundles.LARGE));  // 70pt
        treasures = new ArrayList<>(Arrays.asList(Treasures.SILVER, Treasures.GOLD)); // 300pt
        treasureRoom = new TreasureRoom(herbs, coinBundles, treasures);
    }

    @Test
    public void hasArrayOfHerbs() {
        assertEquals(2, treasureRoom.getTreasures().size());
    }

    @Test
    public void hasArrayOfCoinBundles() {
        assertEquals(3, treasureRoom.getCoinBundles().size());
    }

    @Test
    public void hasArrayOfTreasures() {
        assertEquals(2, treasureRoom.getTreasures().size());
    }

    @Test
    public void playerCanCollectHerbs() {
        phalanx.giveDamage(knight); // knight healthLevel should go 160
        knight.collectHerb(treasureRoom); // room has herbs in total value of 70
        assertEquals(230, knight.getHealthLevel());
    }

    @Test
    public void playerCanCollectCoinBundles() {
        knight.collectCoins(treasureRoom);
        assertEquals(70, knight.getCoins());
    }

    @Test
    public void playerCanCollectTreasures() {
        knight.collectTreasure(treasureRoom);
        assertEquals(300, knight.getCoins());
    }
    @Test
    public void canCollectTotalHP() {
        int totalPoints = herbs.stream()
                .mapToInt(Herbs::getPoints)
                .sum();
        assertEquals(70, totalPoints);
    }
}
