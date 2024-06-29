package org.swiggy.utils;

public class Player {

    String Name;
    int Health;
    int Strength;
    int Attack;

    public Player(String Name, int health, int strength, int attack){
        this.Name=Name;
        this.Health=health;
        this.Strength=strength;
        this.Attack=attack;
    }
    public String getName() {
        return Name;
    }

    public int getStrength(){
        return Strength;
    }

    public int getAttack(){
        return Attack;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        this.Health = health;
    }
}
