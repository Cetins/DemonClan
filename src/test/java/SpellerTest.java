import DemonClan.Demons.FlameLurker;
import DemonClan.Helpers.AttackMethods;
import DemonClan.Helpers.Spells;
import DemonClan.Players.Spellers.Warlock;
import DemonClan.Players.Spellers.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellerTest {

    Warlock warlock;
    FlameLurker flameLurker;
    Wizard wizard;

    @Before
    public void before() {
        warlock = new Warlock("Warlock", 200, Spells.POISON_CLOUD);
        flameLurker = new FlameLurker(200, AttackMethods.FIRE);
        wizard = new Wizard("Wizard", 200, Spells.ACID_CLOUD);
    }

    @Test
    public void hasHealthLevel() {
        assertEquals(200, warlock.getHealthLevel());
    }

    @Test
    public void startsWithZeroCoins() {
        assertEquals(0, warlock.getCoins());
    }

    @Test
    public void hasSpell() {
        assertEquals(Spells.POISON_CLOUD, warlock.getSpell());
    }

    @Test
    public void spellHasDamage() {
        assertEquals(30, warlock.getSpell().getDamage());
    }

    @Test
    public void spellHasSpeed() {
        assertEquals(2, warlock.getSpell().getSpeed());
    }

    @Test
    public void canDamageDemon() {
        warlock.giveDamage(flameLurker);
        assertEquals(140 ,flameLurker.getHealthLevel());
    }

    @Test
    public void canTakeDamage() {
        flameLurker.giveDamage(warlock);
        assertEquals(140, warlock.getHealthLevel());
    }

    @Test
    public void warlockCanSpellStorm() {
        warlock.spellStorm(flameLurker);
        assertEquals(110, flameLurker.getHealthLevel());
    }

    @Test
    public void wizardCanMagicArrowSpell() {
        wizard.magicArrowSpell(flameLurker);
        assertEquals(80, flameLurker.getHealthLevel());
    }
}
