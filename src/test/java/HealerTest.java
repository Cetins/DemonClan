import Quests.Players.Demons.FlameLurker;
import Quests.Players.Healer;
import Quests.Players.Helpers.Attacks;
import Quests.Players.Helpers.Potions;
import Quests.Players.Helpers.Spells;
import Quests.Players.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer mary;
    Cleric merlin;
    FlameLurker flameLurker;

    @Before
    public void before() {
        mary = new Healer(200, Potions.ROYAL_LOTUS);
        merlin = new Cleric(200, Spells.POISON_CLOUD);
        flameLurker = new FlameLurker(200, Attacks.FIRE);
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
        flameLurker.damage(mary);
        assertEquals(140, mary.getHealthLevel());
    }
}