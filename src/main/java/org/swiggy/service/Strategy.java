package org.swiggy.service;

import org.swiggy.utils.Dice;
import org.swiggy.utils.Player;

public interface Strategy {
    void playingStrategy(Player Attacker, Player Defender, Dice AttackerDice, Dice DefenderDice);
}
