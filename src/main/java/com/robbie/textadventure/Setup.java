package com.robbie.textadventure;

import java.util.Scanner;

public class Setup {

    public static Player playerSetup() {

        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("---PLAYER SETUP---");
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your class?");
        System.out.println("A) Warrior");
        System.out.println("B) Mage");
        System.out.println("C) Priest");
        System.out.println("D) Assassin");
        System.out.println("E) Hunter");
        System.out.println("F) Bard");

        boolean validInput = false;

        PlayerType playerType = null;
        while (!validInput) {

            String input = sc.nextLine();
            switch (input) {
                //TODO: Attack can use weapon or power
                case ("a"), ("A") -> {
                    validInput = true;
                    playerType = PlayerType.WARRIOR;
                }
                case ("b"), ("B") -> {
                    validInput = true;
                    playerType = PlayerType.MAGE;
                }
                case ("c"), ("C") -> {
                    validInput = true;
                    playerType = PlayerType.PRIEST;
                }
                case ("d"), ("D") -> {
                    validInput = true;
                    playerType = PlayerType.ASSASSIN;
                }
                case ("e"), ("E") -> {
                    validInput = true;
                    playerType = PlayerType.HUNTER;
                }
                case ("f"), ("F") -> {
                    validInput = true;
                    playerType = PlayerType.BARD;
                }
                default -> System.out.println("Please enter a valid input");
            }
        }

        //TODO: Add "are you sure?" logic
        //TODO: Add typing (maybe "where are you from")

        Player player = new Player(name, playerType);

        player.getBag().addToBag(player.equippedArmour);
        player.getBag().addToBag(player.equippedWeapon);
        return player;
    }
}
