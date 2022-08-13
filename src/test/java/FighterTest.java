import DemonClan.Players.Fighters.Dwarf;
import DemonClan.Players.Fighters.Barbarian;
import DemonClan.Demons.Phalanx;
import DemonClan.Players.Fighters.Fighter;
import DemonClan.Helpers.AttackMethods;
import DemonClan.Helpers.Weapons;
import DemonClan.Players.Fighters.Knight;
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
        phalanx = new Phalanx(200, AttackMethods.POISON);
        dwarf = new Dwarf(200, Weapons.AXE);
        barbarian = new Barbarian(200, Weapons.SPEAR);
        knight = new Knight(200, Weapons.SWORD);
    }

    @Test
    public void hasHealthLevel() {
        assertEquals(200, gorgon.getHealthLevel());
    }

    @Test
    public void startsWithZeroCoins() {
        assertEquals(0, gorgon.getCoins());
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
        gorgon.giveDamage(phalanx);
        assertEquals(140, phalanx.getHealthLevel());
    }

    @Test
    public void canTakeDamage() {
        phalanx.giveDamage(gorgon);
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
        phalanx.giveDamage(knight);
        assertEquals(160, knight.getHealthLevel());
    }

    @Test
    public void knightCanPutArmor() {
        knight.putArmor();
        phalanx.giveDamage(knight);
        assertEquals(132, knight.getHealthLevel());
    }
}
