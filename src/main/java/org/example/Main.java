package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String response;
        do{
            System.out.println("Kolik je Kaibovi?");
            response = str.nextLine();
            if (response.equals("15")) {
                System.out.println("Spravna odpoved");
            } else {
                System.out.println("Tolik neni Kaibovi!");
            }
        } while (!response.equals("15"));
    }
}