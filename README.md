This file contains the description and the structure of the project and how to run the game.\


**INTRODUCTION**\
In this repository I designed the structure for Maigcal Arena Two player game ,
The design is based on **SOLID principle** using object oriented approach.
The design follows the **strategy design pattern**

**PACKAGE & FILE DESCRIPTION**
**utils.Player.java:** It contains the attributes and getter setter methods which the Player of a game requires\
**utils.Dice.java:**It contains the attributes of a Die and function for returning the outcome after rolling the die\
**service.Strategy.java:** It is the interface for creating the playing strategy of the game.\
**service.implementation.MagicalArenaStrategy.java:** It contains the strategy of player this MagicalArena Two player game\
**service.implementation.LetsPlay.java:** It contains the method for beginning the game using playing strategy used\
**StartYourGame:** The main file which needs to be executed to start the game after describing the rules of the game\


**HOW TO START YOUR GAME**\
For starting your game run the file "StartYourGame.java" under src/main/java/org/swiggy


