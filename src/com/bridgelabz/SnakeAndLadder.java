package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int playerPosition = 0;       // Initial Position
        System.out.println("Welcome To Snake And Ladder Game");
        System.out.println("Your Initial Position is : " + playerPosition);

        int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);   // For Generating 1 to 6 Number Randomly
        System.out.println("After Die Roll You get Number : " + dieRoll);
    }
}
