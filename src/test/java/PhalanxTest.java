import Quests.Players.Demons.Phalanx;
import Quests.Players.Helpers.Attacks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhalanxTest {

    Phalanx phalanx;

    @Before
    public void before() {
        phalanx = new Phalanx(300, Attacks.POISON);
    }

    @Test
    public void hasHealth() {
        assertEquals(300, phalanx.getHealthLevel());
    }

    @Test
    public void hasAttackMethod() {
        assertEquals(Attacks.POISON, phalanx.getAttack());
    }

    @Test
    public void hasAttackDamage() {
        assertEquals(40, phalanx.getAttack().getDamage());
    }

    @Test
    public void hasAttackSpeed() {
        assertEquals(1, phalanx.getAttack().getSpeed());
    }
}
