package com.robbie.textadventure;

import java.util.Scanner;

public class BattleMenu {

    Player player;
    Enemy enemy;

    public BattleMenu(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void execute() {

        Scanner sc = new Scanner(System.in);
        boolean menuOpen = true;
        System.out.println("---------------------------------------------------------------------");

        while(menuOpen) {

            System.out.println("Battle Menu: \n A) Player Info \n B) Enemy Info \n C) Back ");
            System.out.printf("%s's health: %d/%d     Enemy health: %d/%d %n",
                    player.getPlayerName(), player.getPlayerHitPoints(), player.getPlayerMaxHitPoints(),
                    enemy.getEnemyMaxHitPoints(), enemy.getEnemyHitPoints());

            boolean validInput = false;

            while (!validInput) {

                String input = sc.nextLine();
                switch (input) {
                    case ("a"), ("A") -> {
                        validInput = true;
                        System.out.printf("Name: %s, Level %d %n", player.getPlayerName(), player.getPlayerLevel());
                        System.out.printf("HP: %d/%d %n",
                                player.getPlayerName(), player.getPlayerHitPoints(), player.getPlayerMaxHitPoints());
                        System.out.printf("Base attack: %d %n", player.getPlayerName(), player.getPlayerBaseAttack());
                        System.out.printf("Equipped weapon: %s", player.getEquippedWeapon().getName());
                        System.out.printf("Equipped armour: %s", player.getEquippedArmour().getName());


                    }
                    case ("b"), ("B") ->
                            //validInput = true;
                            // Do bag stuff -- make sure to increment turn if you do something
                            System.out.println("Bag functionality under construction -- enter something else");
                    case ("c"), ("C") -> {
                        validInput = true;
                        // Add random run effects? E.g. run chance, maybe take some damage
                        System.out.println("You narrowly escaped!");
                    }
                    case ("d"), ("D") -> {
                        // Do menu stuff like see stats
                        validInput = true;
                        menuOpen = false;
                    }
                    default -> System.out.println("Please enter a valid input");
                }
                System.out.println("---------------------------------------------------------------------");
            }

            if (enemy.getEnemyHitPoints() <= 0 || player.getPlayerHitPoints() <=0) menuOpen = true;
        }
    }
}
