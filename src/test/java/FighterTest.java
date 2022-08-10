import Quests.Players.Fighter;
import Quests.Players.Helpers.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter gorgon;

    @Before
    public void before() {
        gorgon = new Fighter(200, Weapons.AXE);
    }

    @Test
    public void hasHealthLevel() {
        assertEquals(200, gorgon.getHealthLevel());
    }

    @Test
    public void hasWeapon() {
        assertEquals(Weapons.AXE, gorgon.getWeapon());
    }

    @Test
    public void weaponHasDamage() {
        assertEquals(30, gorgon.getWeapon().getDamage());
    }

    @Test
    public void weaponHasSpeed() {
        assertEquals(2, gorgon.getWeapon().getSpeed());
    }
}
