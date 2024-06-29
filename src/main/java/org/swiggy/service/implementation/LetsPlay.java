package org.swiggy.service.implementation;

import org.swiggy.service.Strategy;
import org.swiggy.utils.Dice;
import org.swiggy.utils.Player;

public class LetsPlay {

    public static void gamePlay(String firstplayername,String secondplayername,int firstplayerhealth,int firstplayerstrength,int firstplayerattack,int secondplayerhealth,int secondplayerstrength,int secondplayerattack) {
        //instantiating the dice of both attacker and defender
        Dice AttackerDice = new Dice("Red", 6);
        Dice DefenderDice = new Dice("Red", 6);


        //Instantiating players with their name, strength and attack
        Player firstPlayer = new Player(firstplayername, firstplayerhealth, firstplayerstrength, firstplayerattack);
        Player SecondPlayer = new Player(secondplayername, secondplayerhealth, secondplayerstrength, secondplayerattack);
        Strategy s1 = new MagicalArenaStrategy();
        while (firstPlayer.getHealth() > 0 && SecondPlayer.getHealth() > 0) {
            if (firstPlayer.getHealth() < SecondPlayer.getHealth()) {
                s1.playingStrategy(firstPlayer, SecondPlayer, AttackerDice, DefenderDice);
                if (firstPlayer.getHealth() <= 0) {
                    System.out.println(firstPlayer.getName() + " Wins!!");
                    break;
                }
                s1.playingStrategy(SecondPlayer, firstPlayer, AttackerDice, DefenderDice);
                if (SecondPlayer.getHealth() <= 0) {
                    System.out.println(SecondPlayer.getName() + " Wins!!");
                    break;
                }
            } else {
                s1.playingStrategy(SecondPlayer, firstPlayer, AttackerDice, DefenderDice);
                if (firstPlayer.getHealth() <= 0) {
                    System.out.println(firstPlayer.getName() + " Wins!!");
                    break;
                }
                s1.playingStrategy(firstPlayer, SecondPlayer, AttackerDice, DefenderDice);
                if (SecondPlayer.getHealth() <= 0) {
                    System.out.println(SecondPlayer.getName() + " Wins!!");
                    break;
                }
            }

        }

    }

}
