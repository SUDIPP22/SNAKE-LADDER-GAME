package com.bridgelabz;

public class SnakeAndLadder {

    public static final int WINNING_POSITION = 100;
    public static int PLAYER_POSITION = 0;

    public static void main(String[] args) {
        System.out.println("******Welcome To Snake And Ladder Game*******");
        checkWinner();
    }

    public static void checkWinner() {
        int numOfDieRoll = 0;                              // input variable for counting die rolling
        while (PLAYER_POSITION < WINNING_POSITION) {
            int dieRoll = (int) (Math.random() * 6 + 1);   // For Generating 1 to 6 Number Randomly
            numOfDieRoll++;                                // method for counting die rolling
            System.out.println("\n<---->After Die Roll You get Number : " + dieRoll);

            int optionCheck = (int) (Math.random() * 3);    // To check for options

            // variables
            int noPlay = 0;
            int ladder = 1;
            int snake = 2;
            int forExactWin = PLAYER_POSITION + dieRoll;

            // Condition checking
            switch (optionCheck) {
                case 0:
                    System.out.println("It is a No-Play " + " :(  " + ":("); // PLAYER_POSITION IS 0
                    break;
                case 1:
                    System.out.println("You got Ladder" + " /-/ ");
                    if (forExactWin > 100) {                           // condition for exact winning position
                        PLAYER_POSITION = PLAYER_POSITION;
                    } else
                        PLAYER_POSITION += dieRoll;
                    break;
                case 2:
                    System.out.println("You got Snake " + " $$ ");
                    PLAYER_POSITION -= dieRoll;

                    if (PLAYER_POSITION < 0) {
                        System.out.println("You have to start from 0 " + " :( " + ":(");
                        PLAYER_POSITION = 0;
                    }
                    break;
            }
            System.out.println("your position is :" + PLAYER_POSITION);  // to check the position of every die roll
        }
        System.out.println("\nNumber of times the dice was played to win the game is : " + numOfDieRoll);
        System.out.println("\nYou win the game  :) :)");
    }
}
