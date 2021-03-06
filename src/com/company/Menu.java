package com.company;

import java.util.Scanner;

public class Menu {

    public static void menu() {

        // Start menu for the Game

        boolean keepPlaying = true;

        while (keepPlaying) {
            System.out.println("choose between following options");
            System.out.println("1 - Start Game");
            System.out.println("2 - Quit");


            int userInput = getUserInput();
            switch (userInput) {
                case 1 -> {
                    Game.play();
                }

                case 2 -> {
                    keepPlaying = false;
                }
                default -> {


                }
            }
        }
    }

    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);

        int userInput = 0;
        try {
            userInput = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Sorry wrong input, please try again");
        }
        sc.nextLine();
        return userInput;
    }
}