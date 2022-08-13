import DemonClan.Demons.FlameLurker;
import DemonClan.Helpers.AttackMethods;
import DemonClan.Helpers.Spells;
import DemonClan.Players.Healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric merlin;
    FlameLurker flameLurker;

    @Before
    public void before() {
        merlin = new Cleric("Cleric", 200, Spells.POISON_CLOUD);
        flameLurker = new FlameLurker(200, AttackMethods.FIRE);
    }

    @Test
    public void hasHealthLevel() {
        assertEquals(200, merlin.getHealthLevel());
    }

    @Test
    public void hasSpell() {
        assertEquals(Spells.POISON_CLOUD, merlin.getSpell());
    }

    @Test
    public void spellHasDamage() {
        assertEquals(30, merlin.getSpell().getDamage());
    }

    @Test
    public void spellHasSpeed() {
        assertEquals(2, merlin.getSpell().getSpeed());
    }

    @Test
    public void canDamageDemon() {
        merlin.damage(flameLurker);
        assertEquals(140, flameLurker.getHealthLevel());
    }

    @Test
    public void canTakeDamage() {
        flameLurker.giveDamage(merlin);
        assertEquals(140, merlin.getHealthLevel());
    }
}
