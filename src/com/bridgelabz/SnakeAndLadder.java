package com.bridgelabz;

import java.util.Scanner;

public class SnakeAndLadder {

    public static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        System.out.println("******Welcome To Snake And Ladder Game*******");
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR NAME " + " PLAYER1 ");
        String firstPlayerName = sc.next();                         // for player1
        int positionOfPlayer1 = 0;

        System.out.println("ENTER YOUR NAME : " + " PLAYER2 ");
        String secondPlayerName = sc.next();                       // for player2
        int positionOfPlayer2 = 0;
        sc.close();

        // Checking WINNER
        while (positionOfPlayer1 <= WINNING_POSITION && positionOfPlayer2 <= WINNING_POSITION) {
            if (positionOfPlayer1 == WINNING_POSITION) {
                System.out.println("\nCongratulations " + " :) " + ":) " + firstPlayerName + ", You Won The Game!!!! ");
                break;
            } else if (positionOfPlayer2 == WINNING_POSITION) {
                System.out.println("\nCongratulations " + " :) " + ":) " + secondPlayerName + ", You Won The Game!!!! ");
                break;
            } else {
                positionOfPlayer1 = checkWinnerForPlayer1(positionOfPlayer1, firstPlayerName);
                positionOfPlayer2 = checkWinnerForPlayer2(positionOfPlayer2, secondPlayerName);
            }
        }
    }

    private static int checkWinnerForPlayer1(int positionOfPlayer1, String firstPlayerName) {
        int dieRoll = (int) (Math.random() * 6 + 1);   // For Generating 1 to 6 Number Randomly
        System.out.println("\n<---->After Die Roll You get Number : " + dieRoll);
        int optionCheck = (int) (Math.random() * 3);    // To check for options
        int forExactWin = positionOfPlayer1 + dieRoll;

        // Condition checking
        switch (optionCheck) {
            case 0:
                System.out.println("It is a No-Play " + " :(  " + ":("); // PLAYER_POSITION IS 0
                break;
            case 1:
                System.out.println("You got Ladder" + " /-/ ");
                if (forExactWin > 100) {                           // condition for exact winning position
                    positionOfPlayer1 = positionOfPlayer1;
                } else
                    positionOfPlayer1 += dieRoll;
                break;
            case 2:
                System.out.println("You got Snake " + " $$ ");
                positionOfPlayer1 -= dieRoll;
                if (positionOfPlayer1 < 0) {
                    System.out.println("You have to start from 0 " + " :( " + ":(");
                    positionOfPlayer1 = 0;
                }
                break;
        }
        System.out.println(firstPlayerName + " Your position is :" + positionOfPlayer1);  // to check the position of every die roll
        return positionOfPlayer1;
    }

    private static int checkWinnerForPlayer2(int positionOfPlayer2, String secondPlayerName) {
        int dieRoll = (int) (Math.random() * 6 + 1);   // For Generating 1 to 6 Number Randomly
        System.out.println("\n<---->After Die Roll You get Number : " + dieRoll);
        int optionCheck = (int) (Math.random() * 3);    // To check for options
        int forExactWin = positionOfPlayer2 + dieRoll;

        // Condition checking
        switch (optionCheck) {
            case 0:
                System.out.println("It is a No-Play " + " :(  " + ":(");
                break;
            case 1:
                System.out.println("You got Ladder" + " /-/ ");
                if (forExactWin > 100) {                           // condition for exact winning position
                    positionOfPlayer2 = positionOfPlayer2;
                } else
                    positionOfPlayer2 += dieRoll;
                break;
            case 2:
                System.out.println("You got Snake " + " $$ ");
                positionOfPlayer2 -= dieRoll;

                if (positionOfPlayer2 < 0) {
                    System.out.println("You have to start from 0 " + " :( " + ":(");
                    positionOfPlayer2 = 0;
                }
                break;
        }
        System.out.println(secondPlayerName + " Your position is :" + positionOfPlayer2);  // to check the position of every die roll
        return positionOfPlayer2;
    }
}