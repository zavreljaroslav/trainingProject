package org.example.service;

import org.example.model.Person;

import java.util.Scanner;

public class AgeMinigameService {

    public void playGame(Person person) {
        Scanner str = new Scanner(System.in);
        Integer response;
        do {
            System.out.println("How old is " + person.getName());
            String input = str.nextLine();

            response = stringToInteger(input);
            if (response == person.getAge()) {
                System.out.println("Correct!");
            } else if (response < person.getAge()) {
                System.out.println(person.getName() + " is older than that, cmon...Try again!");
            } else {
                System.out.println(person.getName() + "is younger than that, cmon...Try again!");
            }
        } while (!(response == person.getAge()));
    }

    public int stringToInteger(String string) {
        Integer result = Integer.parseInt(string);
        return result;
    }
}
