
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.swiggy.service.implementation.MagicalArenaStrategy;
import org.swiggy.utils.Dice;
import org.swiggy.utils.Player;
import org.junit.jupiter.api.BeforeEach;

public class PlayerTest {
    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player("Attacker",0,0,0);
    }

    @Test
    public void testGetHealth() {
        // Initially, health should be 0 or default value
        assertEquals(0, player.getHealth());

        // Set health to a new value
        player.setHealth(100);
        assertEquals(100, player.getHealth());

        // Set health to another value
        player.setHealth(50);
        assertEquals(50, player.getHealth());
    }

    @Test
    public void testSetHealth() {
        // Set health to a positive value
        player.setHealth(75);
        assertEquals(75, player.getHealth());

        // Set health to a negative value (assuming health can't be negative)
        player.setHealth(-10);
        assertEquals(-10, player.getHealth()); // Assuming the setter allows negative values

        // Set health to zero
        player.setHealth(0);
        assertEquals(0, player.getHealth());
    }
}
