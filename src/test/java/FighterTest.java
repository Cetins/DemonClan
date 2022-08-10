import Quests.Players.Demons.Phalanx;
import Quests.Players.Fighter;
import Quests.Players.Helpers.Attacks;
import Quests.Players.Helpers.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter gorgon;
    Phalanx phalanx;

    @Before
    public void before() {
        gorgon = new Fighter(200, Weapons.AXE);
        phalanx = new Phalanx(200, Attacks.POISON);
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

    @Test
    public void canDamageDemon() {
        gorgon.damage(phalanx);
        assertEquals(140, phalanx.getHealthLevel());
    }

    @Test
    public void canTakeDamage() {
        phalanx.damage(gorgon);
        assertEquals(160, gorgon.getHealthLevel());
    }
}
