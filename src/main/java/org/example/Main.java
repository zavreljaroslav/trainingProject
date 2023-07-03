package org.example;

import org.example.service.AgeMinigameService;
import org.example.models.Person;

public class Main {
    public static void main(String[] args) {
        AgeMinigameService ageMinigameService = new AgeMinigameService();
        Person Toob = new Person();
        Toob.setAge (29);
        Toob.setName("Toob");

        //String userName = "Jimmi";
        //byte userAge = 25;
        int userTries = ageMinigameService.playGame(Toob.getAge(), Toob.getName());

        //grammar check for try v tries
        ageMinigameService.grammarPolice(userTries);

            }
        }
