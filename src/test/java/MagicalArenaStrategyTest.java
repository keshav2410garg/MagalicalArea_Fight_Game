import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.swiggy.service.implementation.MagicalArenaStrategy;
import org.swiggy.utils.Dice;
import org.swiggy.utils.Player;

import static org.junit.jupiter.api.Assertions.*;

public class MagicalArenaStrategyTest {

    private MagicalArenaStrategy strategy;
    private Player Attacker;
    private Player Defender;
    private Dice AttackerDice;
    private Dice DefenderDice;

    @BeforeEach
    public void setUp() {
        strategy = new MagicalArenaStrategy();
        Attacker = new Player("Attacker", 50, 5, 10);
        Defender = new Player("Defender", 100, 10, 5);
        AttackerDice = new Dice("Red", 6);
        DefenderDice = new Dice("Red", 6);
    }

    @Test
    public void testPlayingStrategy_AttackWins() {
        // Mock dice rolls for attacker and defender
        // Assuming attacker rolls 4 and defender rolls 3 for testing
        Dice mockAttackerDice = new Dice("Red", 6) {
            @Override
            public int rollDie() {
                return 4;
            }
        };

        Dice mockDefenderDice = new Dice("Red", 6) {
            @Override
            public int rollDie() {
                return 3;
            }
        };

        // Execute strategy
        strategy.playingStrategy(Attacker, Defender, mockAttackerDice, mockDefenderDice);

        // Verify defender's health after attack
        assertEquals(95, Defender.getHealth());
    }

    @Test
    public void testPlayingStrategy_DefenseWins() {
        // Mock dice rolls for attacker and defender
        // Assuming attacker rolls 3 and defender rolls 5 for testing
        Dice mockAttackerDice = new Dice("Red", 6) {
            @Override
            public int rollDie() {
                return 3;
            }
        };

        Dice mockDefenderDice = new Dice("Red", 6) {
            @Override
            public int rollDie() {
                return 5;
            }
        };

        // Execute strategy
        strategy.playingStrategy(Attacker, Defender, mockAttackerDice, mockDefenderDice);

        // Verify no change in defender's health since defense wins
        assertEquals(100, Defender.getHealth());
    }

    //Verify the getter and setter method for health is working fine
    @Test
    public void testAttackerGethealthSethealth(){

    }



    // Add more test cases as needed to cover different scenarios

}
