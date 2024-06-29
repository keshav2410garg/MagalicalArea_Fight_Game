package org.swiggy;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.swiggy.service.implementation.LetsPlay;

import static org.swiggy.service.implementation.LetsPlay.gamePlay;

public class StartYourGame {
    public static void main(String[] args) {
            System.out.println("Rules of the Game" + "\n");
            System.out.println("1. It is a two player game where any two players can fight");
            System.out.println("2. Any two player can fight a match in the arena. Players attack in turns.");
            System.out.println("3. Attacking player rolls the attacking dice and the defending player rolls the defending dice");
            System.out.println("4. Player with lower health will attack first");
            System.out.println("5. The attack damage made by attacker is equal to (Outcome of attacking die)* Attack");
            System.out.println("6. The damage defended  by the defender player is equal to (Outcome of defending die)* Strength");
            System.out.println("7. The damage created by attacker which is in excess of the damage defended \n by the defender will reduce the “health” of the defender");
            System.out.println("8. The player who reaches to 0 first will loose the game ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first player name");
            String FirstPLayer = sc.nextLine();
            System.out.println("Enter the health of first player:");
            int FirstPlayerHealth=sc.nextInt();
            System.out.println("Enter the strength value of first player");
            int FirstPlayerStrength=sc.nextInt();
            System.out.println("Enter the attack value of first player");
            int FirstPlayerAttack=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the second player name");
            String SecondPlayer = sc.nextLine();
            System.out.println("Enter the health value of second player");
            int SecondPlayerHealth=sc.nextInt();
            System.out.println("Enter the strength value of first player");
            int SecondPlayerStrength=sc.nextInt();
            System.out.println("Enter the attack value of first player");
            int SecondPlayerAttack=sc.nextInt();
            System.out.println("GAME BEGINS");
            gamePlay(FirstPLayer,SecondPlayer,FirstPlayerHealth,FirstPlayerStrength,FirstPlayerAttack, SecondPlayerHealth,SecondPlayerStrength,SecondPlayerAttack);

        }
}
