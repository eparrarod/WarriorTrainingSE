import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarriorTest {
    private Warrior warrior;

    public void setUp() {
        warrior = new Warrior(50, 100);
    }

    public void testCreation() {
        assertEquals(100, warrior.getEndurance(), 0.01);
        assertEquals(50, warrior.getStrength(), 0.01);
    }

    @Test
    public void testAttackStrengthExceedsDamage() {
        warrior.attack(20);
        assertEquals(90, warrior.getEndurance(), 0.01);
    }


    public void testAttackStrengthBelowDamage() {
        warrior.attack(60);
        assertEquals(40, warrior.getEndurance(), 0.01);
    }

    @Test
    public void testAttackNegativeDamage() {
        warrior.attack(-20);
        assertEquals(100, warrior.getEndurance(), 0.01);
    }

    @Test
    public void testCardio() {
        warrior.train("cardio");
        assertEquals(105, warrior.getEndurance(), 0.01);
    }

    @Test
    public void testWeights() {
        warrior.train("weights");
        assertEquals(60, warrior.getStrength(), 0.01);
    }
}
