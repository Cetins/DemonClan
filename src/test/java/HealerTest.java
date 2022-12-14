import DemonClan.Demons.FlameLurker;
import DemonClan.Players.Healers.Healer;
import DemonClan.Helpers.AttackMethods;
import DemonClan.Helpers.Potions;
import DemonClan.Helpers.Spells;
import DemonClan.Players.Healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer mary;
    Cleric merlin;
    FlameLurker flameLurker;

    @Before
    public void before() {
        mary = new Healer("Healer", 200, Potions.ROYAL_LOTUS);
        merlin = new Cleric("Cleric", 200, Spells.POISON_CLOUD);
        flameLurker = new FlameLurker(200, AttackMethods.FIRE);
    }

    @Test
    public void hasHealthLevel() {
        assertEquals(200, mary.getHealthLevel());
    }

    @Test
    public void hasPotion() {
        assertEquals(Potions.ROYAL_LOTUS, mary.getPotion());
    }

    @Test
    public void potionHasHealPoints() {
        assertEquals(40, mary.getPotion().getHeal());
    }

    @Test
    public void canTakeDamage() {
        flameLurker.giveDamage(mary);
        assertEquals(140, mary.getHealthLevel());
    }
}