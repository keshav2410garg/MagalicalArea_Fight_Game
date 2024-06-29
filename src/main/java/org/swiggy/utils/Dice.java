package org.swiggy.utils;

import java.util.Random;

public class Dice {
    String Color;
    static int MaxOutputValue;// Maximum output that a roll of die can generate
    static Random random=new Random();

    public Dice(String color, int maxOutputValue){
        this.Color=color;
        MaxOutputValue=maxOutputValue;
    }


    public int rollDie(){
        int n;
        n=random.nextInt(MaxOutputValue);
        if(n==0){
            return 1;//handle the case when the random number generated is 0
        }

        return n;
    }





}
