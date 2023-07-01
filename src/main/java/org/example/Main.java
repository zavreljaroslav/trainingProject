package org.example;

import org.example.model.Person;
import org.example.service.AgeMinigameService;

public class Main {
    public static void main(String[] args) {
        AgeMinigameService ageMinigameService = new AgeMinigameService();
        Person Toob = new Person(27, "Boobke");

        ageMinigameService.playGame(Toob);

    }
}