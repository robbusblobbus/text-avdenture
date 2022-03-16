package com.robbie.textadventure;

import java.util.Scanner;

public class BagMenu {

    Player player;
    Bag bag;

    public BagMenu(Player player) {
        this.player = player;
        this.bag = player.getBag();
    }

    public void execute() {

        Scanner sc = new Scanner(System.in);
        boolean menuOpen = true;
        System.out.println("---------------------------------------------------------------------");

        while(menuOpen) {

            System.out.println("Battle Menu: \n A) Player Info \n B) Enemy Info \n C) Back ");

            boolean validInput = false;

            while (!validInput) {

                String input = sc.nextLine();
                switch (input) {
                    case ("a"), ("A") -> {
                        validInput = true;
                    }
                    case ("b"), ("B") -> {
                        validInput = true;
                    }
                    case ("c"), ("C") -> {
                        validInput = true;
                        menuOpen = false;
                    }
                    default -> System.out.println("Please enter a valid input");
                }
                System.out.println("---------------------------------------------------------------------");
            }
        }
    }
}
