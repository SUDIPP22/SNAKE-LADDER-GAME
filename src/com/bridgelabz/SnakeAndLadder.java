package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int playerPosition = 0;       // Initial Position
        System.out.println("Welcome To Snake And Ladder Game");
        System.out.println("Your Initial Position is : " + playerPosition);

        int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);   // For Generating 1 to 6 Number Randomly
        System.out.println("After Die Roll You get Number : " + dieRoll);

        // Constants for checking the options
        int NO_PLAY = 0;
        int LADDER = 1;
        int SNAKE = 2;
        int newPlayerPosition;
        int optionCheck = (int) (Math.random() * 3);    // To check for options

        // Condition checking

        switch (optionCheck) {
            case 0:
                System.out.println("You stays in " + playerPosition + " position ");
                break;
            case 1:
                System.out.println("You get the Ladder and moves ahead by " + dieRoll + " steps");
                newPlayerPosition = playerPosition + dieRoll;
                System.out.println("Now your position is : " + newPlayerPosition);
                break;
            case 2:
                System.out.println("You get the Snake and moves behind by " + dieRoll + " steps");
                newPlayerPosition = playerPosition - dieRoll;
                System.out.println("Now your position is : " + newPlayerPosition);
                break;
        }
    }
}
