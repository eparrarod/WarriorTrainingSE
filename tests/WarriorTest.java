import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class WarriorTest {
    private Warrior warrior;

    @Before
    public void setUp() {
        warrior = new Warrior(50, 100);
    }

    @Test
    public void testCreation() {
        assertEquals(100, warrior.getEndurance(), 0.01);
        assertEquals(50, warrior.getStrength(), 0.01);
    }

    @Test
    public void testAttack_StrengthExceedsDamage() {
        warrior.attack(20);
        assertEquals(90, warrior.getEndurance(), 0.01);
    }

    @Test
    public void testAttack_StrengthBelowDamage() {
        warrior.attack(60);
        assertEquals(40, warrior.getEndurance(), 0.01);
    }
}
