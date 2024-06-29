package org.swiggy.service.implementation;

import org.swiggy.service.Strategy;
import org.swiggy.utils.Dice;
import org.swiggy.utils.Player;

public class MagicalArenaStrategy implements Strategy {

    @Override
    public void playingStrategy(Player Attacker, Player Defender, Dice AttackerDice, Dice DefenderDice) {
        int attackRoll = AttackerDice.rollDie();
        int defenseRoll = DefenderDice.rollDie();

        int attackDamage =Attacker.getAttack()*attackRoll;
        int defenseStrength = Defender.getStrength() * defenseRoll;

        int damageTaken = Math.max(0, attackDamage - defenseStrength);
        Defender.setHealth(Defender.getHealth()-damageTaken);

        System.out.println(Attacker.getName()+" The Attacker rolls " + attackRoll + " " + Defender.getName()+" The Defender rolls " + defenseRoll);
        System.out.println("Attack damage: " + attackDamage + ", Defense strength: " + defenseStrength);
        if(attackDamage>defenseStrength){
            System.out.println("Defender "+Defender.getName()+ " health reduced by " + damageTaken + " to " + Defender.getHealth() + "\n");
        }
        else{
            System.out.println("No loss of health"+ "\n");
        }

    }

}
