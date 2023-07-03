package org.example.service;

import org.example.model.GameDTO;
import org.example.model.Person;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AgeMinigameService {

    public GameDTO playGame(Person person) {
        Scanner str = new Scanner(System.in);

        GameDTO gameDTO = new GameDTO();

        int response1;
        int tries = 0;

        System.out.println("How old is " + person.getName() + "?");

        do {
            String input = str.nextLine();
            tries++;
            response1 = stringToInteger(input);
            if (response1 < 0) {
                System.out.println("You have to put in a number!");
            } else if (response1 == person.getAge()) {
                System.out.println("Correct!");
            } else if (response1 < person.getAge()) {
                System.out.println(person.getName() + " is older than that, cmon... Try again!");
            } else {
                System.out.println(person.getName() + " is younger than that, cmon... Try again!");
            }
        } while (!(response1 == person.getAge()));
        gameDTO.setPerson(person);
        gameDTO.setNumberOfTries(tries);
        return gameDTO;
    }

    public int stringToInteger(String string) {
        int result;
        try {
            result = Integer.parseInt(string);
        } catch (Exception e) {
            return -1;
        }
        return result;
    }

    public String grammarNazi(int numberOfTries) {
        if (numberOfTries == 1) {
            return "try";
        } else {
            return "tries";
        }
    }
}
