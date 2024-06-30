This file contains the description and the structure of the project and how to run the game.\


# INTRODUCTION
Welcome to the Magical Arena Two-Player Game repository! 
This project is designed using the **SOLID principle** with an object-oriented approach 
and follows the **strategy design pattern** for gameplay strategies.Strategy design pattern is implemented by creating a Strategy interface which is implemented  by MagicalArenaStrategy class , as in near future the strategy of the game changes can be included in my design efficiently.

# PACKAGE & FILE DESCRIPTION
**utils.Player.java:** It contains the attributes and getter setter methods which the Player of a game requires\
**utils.Dice.java:** It contains the attributes of a Die and function for returning the outcome after rolling the die\
**service.Strategy.java:** It is the interface for creating the playing strategy of the game.\
**service.implementation.MagicalArenaStrategy.java:** It contains the strategy of player this MagicalArena Two player game\
**service.implementation.LetsPlay.java:** It contains the method for beginning the game using playing strategy used\
**StartYourGame.java:** The main file which needs to be executed to start the game after describing the rules of the game
**MagicalArenaStrategyTest.java:** This file under test/java contains **uint test cases using junit** for MagicalArenaStrategy class.


# HOW TO START YOUR GAME
**1. Clone the Repository:** git clone <repository_url> \
**2. Navigate to Source Directory:** cd src/main/java/org/swiggy \
**3. Compile the Code:** javac StartYourGame.java \
**4. Run the Game:** java StartYourGame \
**5. Follow On-Screen Instructions:** Once the game starts, follow the prompts and instructions provided to play the game. \


