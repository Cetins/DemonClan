import Quests.Players.Demons.FlameLurker;
import Quests.Players.Helpers.Attacks;
import Quests.Players.Helpers.Spells;
import Quests.Players.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric merlin;
    FlameLurker flameLurker;

    @Before
    public void before() {
        merlin = new Cleric(200, Spells.POISON_CLOUD);
        flameLurker = new FlameLurker(200, Attacks.FIRE);
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
        flameLurker.damage(merlin);
        assertEquals(140, merlin.getHealthLevel());
    }
}
