import DemonClan.Demons.Phalanx;
import DemonClan.Helpers.AttackMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemonTest {

    Phalanx phalanx;

    @Before
    public void before() {
        phalanx = new Phalanx(300, AttackMethods.POISON);
    }

    @Test
    public void hasHealth() {
        assertEquals(300, phalanx.getHealthLevel());
    }

    @Test
    public void hasAttackMethod() {
        assertEquals(AttackMethods.POISON, phalanx.getAttackMethods());
    }

    @Test
    public void hasAttackDamage() {
        assertEquals(40, phalanx.getAttackMethods().getDamage());
    }

    @Test
    public void hasAttackSpeed() {
        assertEquals(1, phalanx.getAttackMethods().getSpeed());
    }
}
