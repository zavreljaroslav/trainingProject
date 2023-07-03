package org.example.service;

import java.util.Scanner;

public class AgeMinigameService {
    //public static void playGame(String[] args) {
    public static void playGame() {
        // while (!userGuess.equals("quit"))
        byte jimmiAge = 25;
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("How old is Jimmi? ");

        //System.out.print("How old is Jimmi? ");
        //byte userGuess = inputScanner.nextByte();
        //string userGuess = inputScanner.nextString().toLowerCase()
        // We convert the user's input to an integer
        // int userGuess = Integer.parseInt(userInput)
        while (true) {

            byte userGuess = inputScanner.nextByte();
            if (userGuess > jimmiAge)
                System.out.println("Nope, Jimmi is younger than " + userGuess + "! Guess again!");
            else if (userGuess < jimmiAge)
                System.out.println("Nope, Jimmi is older than " + userGuess + "! Guess again!");
            else {
                System.out.println("Correct! Jimmi is " + userGuess + " years old!");
                break;
            }
        }
    }
}
