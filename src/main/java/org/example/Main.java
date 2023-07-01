package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String response;
        do{
            System.out.println("How old is Jimmi");
            response = str.nextLine();
            if (response.equals("15")) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong..Try again!");
            }
        } while (!response.equals("15"));
    }
}