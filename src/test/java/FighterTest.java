import Quests.Dwarf;
import Quests.Players.Barbarian;
import Quests.Players.Demons.Phalanx;
import Quests.Players.Fighter;
import Quests.Players.Helpers.Attacks;
import Quests.Players.Helpers.Weapons;
import Quests.Players.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter gorgon;
    Phalanx phalanx;
    Dwarf dwarf;
    Barbarian barbarian;
    Knight knight;

    @Before
    public void before() {
        gorgon = new Fighter(200, Weapons.AXE);
        phalanx = new Phalanx(200, Attacks.POISON);
        dwarf = new Dwarf(200, Weapons.AXE);
        barbarian = new Barbarian(200, Weapons.SPEAR);
        knight = new Knight(200, Weapons.SWORD);
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

    @Test
    public void dwarfCanDoubleSpeedAttack() {
        dwarf.doubleSpeedAttack(phalanx);
        assertEquals(80, phalanx.getHealthLevel());
    }

    @Test
    public void barbarianCanHeavyAttack() {
        barbarian.heavyAttack(phalanx);
        assertEquals(80, phalanx.getHealthLevel());
    }

    @Test
    public void knightTakesNormalDamageWithoutArmor() {
        phalanx.damage(knight);
        assertEquals(160, knight.getHealthLevel());
    }

    @Test
    public void knightCanPutArmor() {
        knight.putArmor();
        phalanx.damage(knight);
        assertEquals(132, knight.getHealthLevel());
    }
}
