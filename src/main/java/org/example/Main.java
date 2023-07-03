package org.example;

import org.example.model.GameDTO;
import org.example.model.Person;
import org.example.service.AgeMinigameService;

public class Main {
    public static void main(String[] args) {
        AgeMinigameService ageMinigameService = new AgeMinigameService();
        Person Toob = new Person(29,"Toob");
        GameDTO gameDTO = ageMinigameService.playGame(Toob);
        System.out.println("It took you " + gameDTO.getNumberOfTries() + " " + ageMinigameService.grammarNazi(gameDTO.getNumberOfTries()) + " to guess that " + gameDTO.getPerson().getName() + " is " + gameDTO.getPerson().getAge());
    }
}