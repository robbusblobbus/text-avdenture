package com.robbie.textadventure.events;

import com.robbie.textadventure.items.BattleItem;
import com.robbie.textadventure.items.BattleItemType;
import com.robbie.textadventure.player.Player;
import com.robbie.textadventure.player.PlayerType;
import com.robbie.textadventure.utils.InputAnalyser;

import java.util.Scanner;

public class Setup {

    public static Player playerSetup() {

        Scanner sc = new Scanner(System.in);
        boolean done = false;
        System.out.println("---------------------------------------------------------------------");

        String name;
        PlayerType playerType;

        do {
            System.out.println("---PLAYER SETUP---");
            System.out.println("What is your name?");
            name = sc.nextLine();
            System.out.println("What is your class?");
            System.out.printf("A) %s %n", PlayerType.WARRIOR.getTypeName());
            System.out.printf("B) %s %n", PlayerType.MAGE.getTypeName());
            System.out.printf("C) %s %n", PlayerType.PRIEST.getTypeName());
            System.out.printf("D) %s %n", PlayerType.ASSASSIN.getTypeName());
            System.out.printf("E) %s %n", PlayerType.HUNTER.getTypeName());
            System.out.printf("F) %s %n", PlayerType.BARD.getTypeName());

            boolean validInput = false;

            playerType = null;
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
            System.out.printf("Your class is %s, and you are called %s, ", playerType.getTypeName(), name);
            done = InputAnalyser.areYouSure("is this correct?");
        } while (!done);

        //TODO: Add typing (maybe "where are you from")

        Player player = new Player(name, playerType);

        player.getBag().addToBag(player.getEquippedArmour());
        player.getBag().addToBag(player.getEquippedWeapon());
        player.getBag().addToBag(new BattleItem(BattleItemType.SMALL_HEALTH_POTION));
        return player;
    }
}
